/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.context.RequestContext;
import todo1.inventario.dto.DetalleKardexDto;
import todo1.inventario.dto.KardexDto;
import todo1.inventario.modelo.Categoria;
import todo1.inventario.modelo.Producto;
import todo1.inventario.servicio.CategoriaServicio;
import todo1.inventario.servicio.MovimientoServicio;
import todo1.inventario.servicio.ProductoServicio;
import todo1.inventario.utilitarios.Utilitarios;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class kardexControlador extends Utilitarios {

    @EJB
    private CategoriaServicio categoriaServicio;

    @EJB
    private ProductoServicio productoServicio;

    @EJB
    private MovimientoServicio movimientoServicio;

    private Categoria categoria;
    private Integer idProducto;
    private List<Categoria> listaCategorias;
    private List<SelectItem> listaProductos;
    private List<KardexDto> listaKardex;
    private Date desde;
    private Date hasta;
    private BigDecimal acumulado;
    private Producto producto;

    @PostConstruct
    public void inicio() {
        setListaCategorias(categoriaServicio.obtenerCategoriasActivas());
        setListaKardex(null);
        setIdProducto(null);
        setCategoria(null);
        setDesde(null);
        setHasta(null);

    }

    public void procesarKardex() {
        try {
            List<DetalleKardexDto> listaDetalleKardex = movimientoServicio.obtenerListaMovimientosKardex(idProducto);
            if (listaDetalleKardex != null && !listaDetalleKardex.isEmpty()) {
                setListaKardex(new ArrayList<>());
                setAcumulado(new BigDecimal("0.00"));
                obtenerKardex(listaDetalleKardex);
                setProducto(productoServicio.buscarProductoPorId(idProducto));
            }
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "No se pudo generar el kardex."));
        }

    }

    public void obtenerKardex(List<DetalleKardexDto> listaDetalleKardex) {
        try {
            BigDecimal valorPromedio = new BigDecimal("0.00");
            for (DetalleKardexDto dtk : listaDetalleKardex) {
                KardexDto kardexDto = new KardexDto();
                kardexDto.setFecha_transaccion(dtk.getFecha_transaccion());
                kardexDto.setDetalle(dtk.getDescripcion() + " cod_trans " + dtk.getId_transaccion());
                if (dtk.getId_operacion() == 1) {
                    kardexDto.setCantidadEntrada(dtk.getCantidad());
                    kardexDto.setValorUnitarioEntrada(dtk.getValor_unitario());
                    kardexDto.setValorTotalEntrada(dtk.getValor_total());
                    acumulado = acumulado.add(dtk.getValor_total());
                } else {
                    kardexDto.setCantidadSalida(dtk.getCantidad());
                    kardexDto.setValorUnitarioSalida(dtk.getValor_unitario());
                    kardexDto.setValorTotalSalida(dtk.getValor_total());
                    acumulado = acumulado.subtract(dtk.getValor_total());
                }
                kardexDto.setCantidadExistencia(dtk.getStock_actual());
                kardexDto.setValorTotalExistencia(acumulado);
                valorPromedio = acumulado.divide(new BigDecimal(kardexDto.getCantidadExistencia()), 2, RoundingMode.HALF_UP);
                kardexDto.setValorUnitarioExistencia(valorPromedio);
                listaKardex.add(kardexDto);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void listarProductos() {
        try {
            setListaProductos(productoServicio.obtenerListaProductosActivosPorCategoria(getCategoria()));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }

    public void limpiarKardex() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmKardex");
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
     * @return the desde
     */
    public Date getDesde() {
        return desde;
    }

    /**
     * @param desde the desde to set
     */
    public void setDesde(Date desde) {
        this.desde = desde;
    }

    /**
     * @return the hasta
     */
    public Date getHasta() {
        return hasta;
    }

    /**
     * @param hasta the hasta to set
     */
    public void setHasta(Date hasta) {
        this.hasta = hasta;
    }

    /**
     * @return the listaKardex
     */
    public List<KardexDto> getListaKardex() {
        return listaKardex;
    }

    /**
     * @param listaKardex the listaKardex to set
     */
    public void setListaKardex(List<KardexDto> listaKardex) {
        this.listaKardex = listaKardex;
    }

    /**
     * @return the acumulado
     */
    public BigDecimal getAcumulado() {
        return acumulado;
    }

    /**
     * @param acumulado the acumulado to set
     */
    public void setAcumulado(BigDecimal acumulado) {
        this.acumulado = acumulado;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

}
