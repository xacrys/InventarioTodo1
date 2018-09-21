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
import todo1.inventario.modelo.Usuario;
import todo1.inventario.servicio.CategoriaServicio;
import todo1.inventario.servicio.ProductoServicio;
import todo1.inventario.servicio.UsuarioServicio;
import todo1.inventario.servicio.UsuarioTipoUsuarioServicio;
import todo1.inventario.utilitarios.Utilitarios;

/**
 *
 * @author Cristian
 */
@ManagedBean
@ViewScoped
public class ClienteControlador extends Utilitarios {

    @EJB
    private UsuarioServicio usuarioServicio;

    private Integer idTipoDocumento;
    private Boolean botonActualizarVisible;
    private Boolean banderaPanelRucVisible;
    private Boolean camposHabilitados;
    private String mascaraNumDocumento;
    private Usuario usuario;

    @PostConstruct
    public void inicio() {
        setIdTipoDocumento(1);
        setBanderaPanelRucVisible(false);
        setBotonActualizarVisible(false);
        setCamposHabilitados(false);
        setMascaraNumDocumento("9999999999");
        setUsuario(new Usuario());

    }

    public void cambiarModelo() {
        setBanderaPanelRucVisible(idTipoDocumento != 1);
        setMascaraNumDocumento(idTipoDocumento != 1 ? "9999999999999" : "9999999999");
        setUsuario(new Usuario());
        setBotonActualizarVisible(false);
        setCamposHabilitados(false);
    }

    public void buscarCliente() {
        Usuario usuarioExiste = usuarioServicio.buscarUsuarioCliente(usuario.getNumDocUsuario(), 1);
        if (usuarioExiste != null) {
            usuario = usuarioExiste;
            setBotonActualizarVisible(true);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El cliente ya existe puede modificarlo."));
        }else{
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El cliente no existe puede registralo."));
        }
        setCamposHabilitados(true);

    }

//    public void guardarProducto() {
//
//        if (productoServicio.buscarCategoriaPorNombre(getProducto().getNombreProducto()) == null) {
//            getProducto().setIdCategoria(categoriaServicio.buscarCategoriaPorId(idCategoria));
//            getProducto().setStock(0);
//            getProducto().setEstadoProducto(true);
//            Boolean productoExiste = productoServicio.guardarProducto(getProducto());
//            if (productoExiste) {
//                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido almacenado exitosamente."));
//            } else {
//                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido almacenado."));
//            }
//            inicio();
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El producto ingresada ya existe."));
//        }
//
//    }
//
    public void limpiarCliente() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmCliente");
    }
//
//    public void habilitarActualizacion(Producto prod) {
//        setProducto(prod);
//        setBotonActualizarVisible((Boolean) true);
//    }
//
//    public void actualizarProducto() {
//        setBotonActualizarVisible((Boolean) false);
//        getProducto().setIdCategoria(categoriaServicio.buscarCategoriaPorId(idCategoria));
//        Boolean productoExiste = productoServicio.guardarProducto(getProducto());
//        if (productoExiste) {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido actualizado exitosamente."));
//        } else {
//            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido actualizado."));
//        }
//        inicio();
//    }
//
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
     * @return the camposHabilitados
     */
    public Boolean getCamposHabilitados() {
        return camposHabilitados;
    }

    /**
     * @param camposHabilitados the camposHabilitados to set
     */
    public void setCamposHabilitados(Boolean camposHabilitados) {
        this.camposHabilitados = camposHabilitados;
    }

}
