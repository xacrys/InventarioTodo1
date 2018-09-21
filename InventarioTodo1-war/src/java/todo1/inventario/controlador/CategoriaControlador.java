/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.util.List;
import javax.annotation.PostConstruct;
import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.context.RequestContext;
import todo1.inventario.modelo.Categoria;
import todo1.inventario.servicio.CategoriaServicio;
import todo1.inventario.utilitarios.Utilitarios;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class CategoriaControlador extends Utilitarios {

    @EJB
    private CategoriaServicio categoriaServicio;

    private Categoria categoria;
    private List<Categoria> listaCategoriasActivas;
    private Boolean botonActualizarVisible;

    @PostConstruct
    public void inicio() {
        categoria = new Categoria();
        listaCategoriasActivas = categoriaServicio.obtenerCategoriasActivas();
        setBotonActualizarVisible((Boolean) false);

    }

    public void guardarCategoria() {

        if (categoriaServicio.buscarCategoriaPorNombre(categoria.getNombr()) == null) {
            categoria.setEstadpCategoria(true);
            Boolean categoriaExiste = categoriaServicio.guardarCategoria(categoria);
            if (categoriaExiste) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido almacenado exitosamente."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido almacenado."));
            }
            inicio();
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "La categoría ingresada ya existe."));
        }

    }

    public void limpiarCategoria() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmCategoria");
    }

    public void habilitarActualizacion(Categoria cat) {
        categoria = cat;
        setBotonActualizarVisible((Boolean) true);
    }

    public void actualizarCategoria() {
        setBotonActualizarVisible((Boolean) false);
        Boolean categoriaExiste = categoriaServicio.guardarCategoria(categoria);
        if (categoriaExiste) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido actualizado exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido actualizado."));
        }
        inicio();
    }

    public void eliminarCategoria(Categoria cat) {
        cat.setEstadpCategoria(false);
        Boolean categoriaExiste = categoriaServicio.guardarCategoria(cat);
        if (categoriaExiste) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido eliminado exitosamente."));
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido eliminado."));
        }
        inicio();

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
     * @return the listaCategoriasActivas
     */
    public List<Categoria> getListaCategoriasActivas() {
        return listaCategoriasActivas;
    }

    /**
     * @param listaCategoriasActivas the listaCategoriasActivas to set
     */
    public void setListaCategoriasActivas(List<Categoria> listaCategoriasActivas) {
        this.listaCategoriasActivas = listaCategoriasActivas;
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

}
