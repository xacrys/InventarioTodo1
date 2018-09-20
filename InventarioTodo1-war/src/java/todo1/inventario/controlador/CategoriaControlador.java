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

    @PostConstruct
    public void inicio() {
        categoria = new Categoria();
        listaCategoriasActivas = categoriaServicio.obtenerCategoriasActivas();

    }

    public void guardarCategoria() {

        if (categoriaServicio.buscarCategoriaPorNombre(categoria.getNombr()) == null) {
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

}
