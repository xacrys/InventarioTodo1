/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
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
import todo1.inventario.modelo.Operacion;
import todo1.inventario.modelo.Producto;
import todo1.inventario.modelo.TipoUsuario;
import todo1.inventario.modelo.Usuario;
import todo1.inventario.modelo.UsuarioTipoUsuario;
import todo1.inventario.servicio.CategoriaServicio;
import todo1.inventario.servicio.OperacionServicio;
import todo1.inventario.servicio.ProductoServicio;
import todo1.inventario.servicio.TipoUsuarioServicio;
import todo1.inventario.servicio.UsuarioServicio;
import todo1.inventario.servicio.UsuarioTipoUsuarioServicio;
import todo1.inventario.utilitarios.Utilitarios;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class VentaControlador extends Utilitarios {

   

   

    @EJB
    private UsuarioServicio usuarioServicio;

    @EJB
    private UsuarioTipoUsuarioServicio usuarioTipoUsuarioServicio;

    @EJB
    private TipoUsuarioServicio tipoUsuarioServicio;

    @EJB
    private CategoriaServicio categoriaServicio;

    @EJB
    private ProductoServicio productoServicio;
    
     @EJB
    private OperacionServicio operacionServicio;

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
        setBanderaPanelRucVisible(idTipoDocumento != 1);
        setMascaraNumDocumento(idTipoDocumento != 1 ? "9999999999999" : "9999999999");
        setUsuario(new Usuario());
        //setBotonActualizarVisible(false);
    }

    public void buscarCliente() {
        if (usuario.getNumDocUsuario() != null && (usuario.getNumDocUsuario().length() == 10 || usuario.getNumDocUsuario().length() == 13)) {
            Usuario usuarioExiste = usuarioServicio.buscarUsuarioCliente(usuario.getNumDocUsuario(), 1);
            if (usuarioExiste != null) {
                usuario = usuarioExiste;
                setBotonActualizarVisible(true);
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El cliente no existe debe registrarlo."));
            }

        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Verifique la cantidad de dìgitos del número de documento."));
        }
    }

    public void guardarCliente() {
        try {
            usuario.setEstadoUsuario(true);
            usuario.setTipoDocUsuario(idTipoDocumento);
            Usuario clienteExiste = usuarioServicio.obtenerUsuarioPorCedula(usuario.getNumDocUsuario());
            Usuario clienteGuardado = null;
            if (clienteExiste != null) {
                getUsuario().setIdUsuario(clienteExiste.getIdUsuario());
            }
            clienteGuardado = usuarioServicio.guardarUsuario(getUsuario());
            TipoUsuario tipoUsuario = tipoUsuarioServicio.obtenerTipoUsuarioPorId(1);
            UsuarioTipoUsuario usuarioTipoUsuario = new UsuarioTipoUsuario();
            usuarioTipoUsuario.setIdUsuario(clienteGuardado);
            usuarioTipoUsuario.setIdTipoUsuario(tipoUsuario);
            usuarioTipoUsuarioServicio.guardarUsuarioTipoUsuario(usuarioTipoUsuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido almacenado exitosamente."));
            inicio();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido registrado."));
        }

    }

    public void obtenerMaximo() {
        producto = productoServicio.buscarProductoPorId(idProducto);
        maximoStock = producto.getStock(); 
    }
    
    public void agregarDetalle(){
        BigDecimal monto = producto.getPreciouProducto().multiply(new BigDecimal(cantidad));
        DetalleProductoDto detalle = new DetalleProductoDto(producto, producto.getPreciouProducto(), cantidad, monto);
        listaDetalles.add(detalle);
    }

    public void listarProductos() {
        setListaProductos(productoServicio.obtenerListaProductosActivosPorCategoria(categoria));
    }

    public void limpiarCliente() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmCliente");
    }

    public void actualizarCliente() {
        Usuario clienteGuardado = usuarioServicio.guardarUsuario(getUsuario());
        if (clienteGuardado != null) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido actualizado exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido actualizado."));
        }
        inicio();
    }

//    public void eliminarProducto(Producto pro) {
//        pro.setEstadoProducto(false);
//        Boolean productoExiste = productoServicio.guardarProducto(pro);
//        if (productoExiste) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido eliminado exitosamente."));
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido eliminado."));
//        }
//        inicio();
//
//    }
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

}
