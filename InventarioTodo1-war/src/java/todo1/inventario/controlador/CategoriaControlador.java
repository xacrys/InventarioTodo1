/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

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

    @PostConstruct
    public void inicio() {
        categoria = new Categoria();

    }

    public void guardarCategoria() {
        Boolean categoriaExiste = categoriaServicio.guardarCategoria(categoria);
        if (categoriaExiste) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido almacenado exitosamente."));
        }
        else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido almacenado."));
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

}
