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
import todo1.inventario.modelo.TipoUsuario;
import todo1.inventario.modelo.Usuario;
import todo1.inventario.modelo.UsuarioTipoUsuario;
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
public class ProveedorControlador extends Utilitarios {

    @EJB
    private UsuarioServicio usuarioServicio;

    @EJB
    private UsuarioTipoUsuarioServicio usuarioTipoUsuarioServicio;

    @EJB
    private TipoUsuarioServicio tipoUsuarioServicio;

    private Integer idTipoDocumento;
    private Boolean botonActualizarVisible;
    private Boolean camposHabilitados;
    private Usuario usuario;

    @PostConstruct
    public void inicio() {
        setIdTipoDocumento(2);
        setBotonActualizarVisible(false);
        setCamposHabilitados(false);
        setUsuario(new Usuario());

    }

    public void buscarProveedor() {
        if (usuario.getNumDocUsuario() != null && usuario.getNumDocUsuario().length() == 13) {
            Usuario usuarioExiste = usuarioServicio.buscarUsuarioCliente(usuario.getNumDocUsuario(), 2);
            if (usuarioExiste != null) {
                usuario = usuarioExiste;
                setBotonActualizarVisible(true);
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El proveedor ya existe puede modificarlo."));
            } else {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El proveedor no existe puede registralo."));
            }
            setCamposHabilitados(true);
        } else {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Verifique la cantidad de dìgitos del número de documento."));
        }
    }

    public void guardarProveedor() {
        try {
            usuario.setEstadoUsuario(true);
            usuario.setTipoDocUsuario(getIdTipoDocumento());
            Usuario proveedorExiste = usuarioServicio.obtenerUsuarioPorCedula(usuario.getNumDocUsuario());
            Usuario proveedorGuardado = null;
            if (proveedorExiste != null) {
               getUsuario().setIdUsuario(proveedorExiste.getIdUsuario());
            }
            proveedorGuardado = usuarioServicio.guardarUsuario(getUsuario());
            TipoUsuario tipoUsuario = tipoUsuarioServicio.obtenerTipoUsuarioPorId(2);
            UsuarioTipoUsuario usuarioTipoUsuario = new UsuarioTipoUsuario();
            usuarioTipoUsuario.setIdUsuario(proveedorGuardado == null ? proveedorExiste : proveedorGuardado);
            usuarioTipoUsuario.setIdTipoUsuario(tipoUsuario);
            usuarioTipoUsuarioServicio.guardarUsuarioTipoUsuario(usuarioTipoUsuario);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Info", "El registro ha sido almacenado exitosamente."));
            inicio();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "El registro no ha sido registrado."));
        }

    }

    public void limpiarProveedor() {
        inicio();
        RequestContext.getCurrentInstance().reset("frmProveedor");
    }

    public void actualizarProveedor() {
        Usuario proveedorGuardado = usuarioServicio.guardarUsuario(getUsuario());
        if (proveedorGuardado != null) {
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
