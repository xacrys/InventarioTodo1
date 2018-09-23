/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.context.RequestContext;
import todo1.inventario.dto.DetalleProductoDto;
import todo1.inventario.modelo.Categoria;
import todo1.inventario.modelo.DetalleTransaccion;
import todo1.inventario.modelo.Movimiento;
import todo1.inventario.modelo.Operacion;
import todo1.inventario.modelo.Producto;
import todo1.inventario.modelo.Transaccion;
import todo1.inventario.modelo.Usuario;
import todo1.inventario.modelo.Vendedor;
import todo1.inventario.parametros.GlobalParametros;
import todo1.inventario.servicio.CategoriaServicio;
import todo1.inventario.servicio.DetalleTransaccionServicio;
import todo1.inventario.servicio.MovimientoServicio;
import todo1.inventario.servicio.OperacionServicio;
import todo1.inventario.servicio.ProductoServicio;
import todo1.inventario.servicio.TransaccionServicio;
import todo1.inventario.servicio.UsuarioServicio;
import todo1.inventario.servicio.VendedorServicio;
import todo1.inventario.utilitarios.Utilitarios;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class CompraControlador extends Utilitarios {

    @EJB
    private UsuarioServicio usuarioServicio;

    @EJB
    private CategoriaServicio categoriaServicio;

    @EJB
    private ProductoServicio productoServicio;

    @EJB
    private OperacionServicio operacionServicio;

    @EJB
    private VendedorServicio vendedorServicio;

    @EJB
    private DetalleTransaccionServicio detalleTransaccionServicio;

    @EJB
    private TransaccionServicio transaccionServicio;

    @EJB
    private MovimientoServicio movimientoServicio;

    private Integer idTipoDocumento;
    private Boolean botonActualizarVisible;
    private Boolean banderaPanelRucVisible;
    private String mascaraNumDocumento;
    private Usuario usuario;
    private Categoria categoria;
    private List<Categoria> listaCategorias;
    private Producto producto;
    private List<SelectItem> listaProductos;
    private Integer cantidad;
    private Integer maximoStock;
    private Integer idProducto;
    private Operacion operacion;
    private List<DetalleProductoDto> listaDetalles;
    private BigDecimal subtotal;
    private BigDecimal iva;
    private BigDecimal total;

    @PostConstruct
    public void inicio() {
        setIdTipoDocumento(1);
        setBanderaPanelRucVisible(false);
        setBotonActualizarVisible(false);

        setMascaraNumDocumento("9999999999");
        setUsuario(new Usuario());

        setListaCategorias(categoriaServicio.obtenerCategoriasActivas());
        setCantidad(0);
        setOperacion(operacionServicio.obtenerOperacionPorId(1));
        setListaDetalles(new ArrayList<>());

    }

    public void cambiarModelo() {
        try {
            setBanderaPanelRucVisible(idTipoDocumento != 1);
            setMascaraNumDocumento(idTipoDocumento != 1 ? "9999999999999" : "9999999999");
            setUsuario(new Usuario());
            //setBotonActualizarVisible(false);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void buscarCliente() {
        if (usuario != null) {
            if (usuario.getNumDocUsuario() != null && (usuario.getNumDocUsuario().length() == 10 || usuario.getNumDocUsuario().length() == 13)) {
                Usuario usuarioExiste = usuarioServicio.buscarUsuarioCliente(usuario.getNumDocUsuario(), 2);
                if (usuarioExiste != null) {
                    usuario = usuarioExiste;
                    setBotonActualizarVisible(true);
                    setCategoria(null);
                    setIdProducto(null);
                    setCantidad(0);
                    setSubtotal(new BigDecimal("0.00"));
                    setTotal(new BigDecimal("0.00"));
                    setIva(new BigDecimal("0.00"));
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El proveedor no existe debe registrarlo."));
                }

            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Verifique la cantidad de dígitos del número de documento."));
            }
        }

    }

    public void guardarCompra() {
        try {
            Operacion operacionRealizada = operacionServicio.obtenerOperacionPorId(GlobalParametros.COD_COMPRA);
            Vendedor vendedor = vendedorServicio.obtenerVendedorPorCedula(GlobalParametros.CED_VENDEDOR);
            if (operacionRealizada != null && vendedor != null && usuario != null && !listaDetalles.isEmpty()) {
                Transaccion transaccion = new Transaccion();
                transaccion.setFechaTransaccion(new Date());
                transaccion.setIdOperacion(operacionRealizada);
                transaccion.setIdUsuario(usuario);
                transaccion.setIdVendedor(vendedor);
                transaccion.setSubtotal(subtotal);
                transaccion.setImpuesto(iva);
                transaccion.setTotal(total);
                transaccion = transaccionServicio.guardarTransaccion(transaccion);
                for (DetalleProductoDto detalleProducto : listaDetalles) {
                    DetalleTransaccion detalleTransaccion = new DetalleTransaccion();
                    detalleTransaccion.setIdTransaccion(transaccion);
                    detalleTransaccion.setCantidadDetalleTransaccion(detalleProducto.getCantidad());
                    detalleTransaccion.setIdProducto(detalleProducto.getProducto());
                    detalleTransaccion.setPreciouDetalleTransaccion(detalleProducto.getPreciouProducto());
                    detalleTransaccion.setMontoDetalleTransaccion(detalleProducto.getMonto());
                    detalleTransaccion = detalleTransaccionServicio.guardarDetalleTransaccion(detalleTransaccion);
                    Movimiento movimiento = new Movimiento();
                    movimiento.setCantidad(detalleProducto.getCantidad());
                    movimiento.setIdDetalleTransaccion(detalleTransaccion);
                    movimiento.setIdProducto(detalleProducto.getProducto());
                    movimiento.setStockAnterior(detalleProducto.getProducto().getStock());
                    movimiento.setStockActual(detalleProducto.getProducto().getStock() + detalleProducto.getCantidad());
                    movimiento.setValorUnitario(detalleProducto.getPreciouProducto());
                    movimiento.setValorTotal(detalleProducto.getMonto());
                    movimientoServicio.guardarMovimiento(movimiento);
                    detalleProducto.getProducto().setStock(detalleProducto.getProducto().getStock() + detalleProducto.getCantidad());
                    productoServicio.guardarProducto(detalleProducto.getProducto());

                }
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "Se ha realizado la compra exitosamente."));
                limpiarCompra();
            }

        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo almacenar la compra."));
        }

    }

    public void obtenerMaximo() {
        try {
            producto = productoServicio.buscarProductoPorId(idProducto);
            maximoStock = producto.getStock();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void agregarDetalle() {
        try {
            if (getCantidad() != 0) {
                BigDecimal monto = producto.getPreciocProducto().multiply(new BigDecimal(cantidad));
                DetalleProductoDto detalle = new DetalleProductoDto(producto, producto.getPreciocProducto(), cantidad, monto);
                if (!verificarExistencia(producto.getIdProducto(), listaDetalles)) {
                    listaDetalles.add(detalle);
                    setCategoria(null);
                    setIdProducto(null);
                    setCantidad(0);
                    subtotal = subtotal.add(monto);
                    iva = (subtotal.multiply(new BigDecimal(GlobalParametros.IVA))).divide(new BigDecimal("100.00"));
                    total = subtotal.add(iva);
                } else {
                    FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El producto ya ha sido ingresado."));
                }
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "La cantidad no puede ser cero."));
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public Boolean verificarExistencia(Integer idProducto, List<DetalleProductoDto> listaProductos) {
        try {
            for (DetalleProductoDto det : listaProductos) {
                if (Objects.equals(det.getProducto().getIdProducto(), idProducto)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            return false;
        }

    }

    public void listarProductos() {
        try {
            setListaProductos(productoServicio.obtenerListaProductosActivosPorCategoria(categoria));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void limpiarCompra() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmCompra");
    }

    public void eliminarProducto(DetalleProductoDto detalleProducto) {
        if (detalleProducto != null) {
            listaDetalles.remove(detalleProducto);
        }
    }

    public void actualizarCliente() {
        try {
            Usuario clienteGuardado = usuarioServicio.guardarUsuario(getUsuario());
            if (clienteGuardado != null) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido actualizado exitosamente."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido actualizado."));
            }
            inicio();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    /**
     * @return the idTipoDocumento
     */
    public Integer getIdTipoDocumento() {
        return idTipoDocumento;
    }

    /**
     * @param idTipoDocumento the idTipoDocumento to set
     */
    public void setIdTipoDocumento(Integer idTipoDocumento) {
        this.idTipoDocumento = idTipoDocumento;
    }

    /**
     * @return the botonActualizarVisible
     */
    public Boolean getBotonActualizarVisible() {
        return botonActualizarVisible;
    }

    /**
     * @param botonActualizarVisible the botonActualizarVisible to set
     */
    public void setBotonActualizarVisible(Boolean botonActualizarVisible) {
        this.botonActualizarVisible = botonActualizarVisible;
    }

    /**
     * @return the banderaPanelRucVisible
     */
    public Boolean getBanderaPanelRucVisible() {
        return banderaPanelRucVisible;
    }

    /**
     * @param banderaPanelRucVisible the banderaPanelRucVisible to set
     */
    public void setBanderaPanelRucVisible(Boolean banderaPanelRucVisible) {
        this.banderaPanelRucVisible = banderaPanelRucVisible;
    }

    /**
     * @return the mascaraNumDocumento
     */
    public String getMascaraNumDocumento() {
        return mascaraNumDocumento;
    }

    /**
     * @param mascaraNumDocumento the mascaraNumDocumento to set
     */
    public void setMascaraNumDocumento(String mascaraNumDocumento) {
        this.mascaraNumDocumento = mascaraNumDocumento;
    }

    /**
     * @return the usuario
     */
    public Usuario getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the categoria
     */
    public Categoria getCategoria() {
        return categoria;
    }

    /**
     * @param categoria the categoria to set
     */
    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    /**
     * @return the listaCategorias
     */
    public List<Categoria> getListaCategorias() {
        return listaCategorias;
    }

    /**
     * @param listaCategorias the listaCategorias to set
     */
    public void setListaCategorias(List<Categoria> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the maximoStock
     */
    public Integer getMaximoStock() {
        return maximoStock;
    }

    /**
     * @param maximoStock the maximoStock to set
     */
    public void setMaximoStock(Integer maximoStock) {
        this.maximoStock = maximoStock;
    }

    /**
     * @return the idProducto
     */
    public Integer getIdProducto() {
        return idProducto;
    }

    /**
     * @param idProducto the idProducto to set
     */
    public void setIdProducto(Integer idProducto) {
        this.idProducto = idProducto;
    }

    /**
     * @return the listaProductos
     */
    public List<SelectItem> getListaProductos() {
        return listaProductos;
    }

    /**
     * @param listaProductos the listaProductos to set
     */
    public void setListaProductos(List<SelectItem> listaProductos) {
        this.listaProductos = listaProductos;
    }

    /**
     * @return the operacion
     */
    public Operacion getOperacion() {
        return operacion;
    }

    /**
     * @param operacion the operacion to set
     */
    public void setOperacion(Operacion operacion) {
        this.operacion = operacion;
    }

    /**
     * @return the listaDetalles
     */
    public List<DetalleProductoDto> getListaDetalles() {
        return listaDetalles;
    }

    /**
     * @param listaDetalles the listaDetalles to set
     */
    public void setListaDetalles(List<DetalleProductoDto> listaDetalles) {
        this.listaDetalles = listaDetalles;
    }

    /**
     * @return the subtotal
     */
    public BigDecimal getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(BigDecimal subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the iva
     */
    public BigDecimal getIva() {
        return iva;
    }

    /**
     * @param iva the iva to set
     */
    public void setIva(BigDecimal iva) {
        this.iva = iva;
    }

    /**
     * @return the total
     */
    public BigDecimal getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(BigDecimal total) {
        this.total = total;
    }

}
