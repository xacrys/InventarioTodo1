/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.math.BigDecimal;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;
import org.primefaces.context.RequestContext;
import todo1.inventario.modelo.Producto;
import todo1.inventario.servicio.CategoriaServicio;
import todo1.inventario.servicio.ProductoServicio;
import todo1.inventario.utilitarios.Utilitarios;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class ProductoControlador extends Utilitarios {

    @EJB
    private CategoriaServicio categoriaServicio;
    
    @EJB
    private ProductoServicio productoServicio;

    
    private List<SelectItem> listaCategorias;
    private List<Producto> listaProductosActivos;
    private Producto producto;
    private Integer idCategoria;
    private Boolean botonActualizarVisible;

    @PostConstruct
    public void inicio() {
        setProducto(new Producto());
        setIdCategoria(null);
        getProducto().setPreciouProducto(new BigDecimal("0.00"));
        getProducto().setPreciocProducto(new BigDecimal("0.00"));
        setListaCategorias(categoriaServicio.obtenerListaItemCategorias());
        setListaProductosActivos(productoServicio.obtenerListaProductosActivos());
        setBotonActualizarVisible((Boolean) false);

    }

    public void guardarProducto() {

        if (productoServicio.buscarCategoriaPorNombre(getProducto().getNombreProducto()) == null) {
            getProducto().setIdCategoria(categoriaServicio.buscarCategoriaPorId(idCategoria));
            getProducto().setStock(0);
            getProducto().setEstadoProducto(true);
            Boolean productoExiste = productoServicio.guardarProducto(getProducto());
            if (productoExiste) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido almacenado exitosamente."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido almacenado."));
            }
            inicio();
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El producto ingresada ya existe."));
        }

    }

    public void limpiarProducto() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmProducto");
    }

    public void habilitarActualizacion(Producto prod) {
        setProducto(prod);
        setBotonActualizarVisible((Boolean) true);
    }

    public void actualizarProducto() {
        setBotonActualizarVisible((Boolean) false);
        getProducto().setIdCategoria(categoriaServicio.buscarCategoriaPorId(idCategoria));
        Boolean productoExiste = productoServicio.guardarProducto(getProducto());
        if (productoExiste) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido actualizado exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido actualizado."));
        }
        inicio();
    }

    public void eliminarProducto(Producto pro) {
        pro.setEstadoProducto(false);
        Boolean productoExiste = productoServicio.guardarProducto(pro);
        if (productoExiste) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido eliminado exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido eliminado."));
        }
        inicio();

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
     * @return the listaCategorias
     */
    public List<SelectItem> getListaCategorias() {
        return listaCategorias;
    }

    /**
     * @param listaCategorias the listaCategorias to set
     */
    public void setListaCategorias(List<SelectItem> listaCategorias) {
        this.listaCategorias = listaCategorias;
    }

    /**
     * @return the idCategoria
     */
    public Integer getIdCategoria() {
        return idCategoria;
    }

    /**
     * @param idCategoria the idCategoria to set
     */
    public void setIdCategoria(Integer idCategoria) {
        this.idCategoria = idCategoria;
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

    /**
     * @return the listaProductosActivos
     */
    public List<Producto> getListaProductosActivos() {
        return listaProductosActivos;
    }

    /**
     * @param listaProductosActivos the listaProductosActivos to set
     */
    public void setListaProductosActivos(List<Producto> listaProductosActivos) {
        this.listaProductosActivos = listaProductosActivos;
    }

}
