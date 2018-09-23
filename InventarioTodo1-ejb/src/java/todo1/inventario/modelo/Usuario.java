/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Xacrys10
 */
@Entity
@Table(name = "usuario", schema = "todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u")
    , @NamedQuery(name = "Usuario.findByIdUsuario", query = "SELECT u FROM Usuario u WHERE u.idUsuario = :idUsuario")
    , @NamedQuery(name = "Usuario.findByTipoDocUsuario", query = "SELECT u FROM Usuario u WHERE u.tipoDocUsuario = :tipoDocUsuario")
    , @NamedQuery(name = "Usuario.findByNumDocUsuario", query = "SELECT u FROM Usuario u WHERE u.numDocUsuario = :numDocUsuario")
    , @NamedQuery(name = "Usuario.findByNombreUsuario", query = "SELECT u FROM Usuario u WHERE u.nombreUsuario = :nombreUsuario")
    , @NamedQuery(name = "Usuario.findByDireccionUsuario", query = "SELECT u FROM Usuario u WHERE u.direccionUsuario = :direccionUsuario")
    , @NamedQuery(name = "Usuario.findByTelefonoUsuario", query = "SELECT u FROM Usuario u WHERE u.telefonoUsuario = :telefonoUsuario")
    , @NamedQuery(name = "Usuario.findByMailUsuario", query = "SELECT u FROM Usuario u WHERE u.mailUsuario = :mailUsuario")
    , @NamedQuery(name = "Usuario.findByRazonsUsuario", query = "SELECT u FROM Usuario u WHERE u.razonsUsuario = :razonsUsuario")
    , @NamedQuery(name = "Usuario.findByDireccionRsUsuario", query = "SELECT u FROM Usuario u WHERE u.direccionRsUsuario = :direccionRsUsuario")
    , @NamedQuery(name = "Usuario.findByFonoRsUsuario", query = "SELECT u FROM Usuario u WHERE u.fonoRsUsuario = :fonoRsUsuario")
    , @NamedQuery(name = "Usuario.findByMailRsUsuario", query = "SELECT u FROM Usuario u WHERE u.mailRsUsuario = :mailRsUsuario")
    , @NamedQuery(name = "Usuario.findByEstadoUsuario", query = "SELECT u FROM Usuario u WHERE u.estadoUsuario = :estadoUsuario")})
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usuario")
    private Integer idUsuario;
    @Column(name = "tipo_doc_usuario")
    private Integer tipoDocUsuario;
    @Size(max = 13)
    @Column(name = "num_doc_usuario")
    private String numDocUsuario;
    @Size(max = 200)
    @Column(name = "nombre_usuario")
    private String nombreUsuario;
    @Size(max = 200)
    @Column(name = "direccion_usuario")
    private String direccionUsuario;
    @Size(max = 10)
    @Column(name = "telefono_usuario")
    private String telefonoUsuario;
    @Size(max = 50)
    @Column(name = "mail_usuario")
    private String mailUsuario;
    @Size(max = 200)
    @Column(name = "razons_usuario")
    private String razonsUsuario;
    @Size(max = 200)
    @Column(name = "direccion_rs_usuario")
    private String direccionRsUsuario;
    @Size(max = 10)
    @Column(name = "fono_rs_usuario")
    private String fonoRsUsuario;
    @Size(max = 100)
    @Column(name = "mail_rs_usuario")
    private String mailRsUsuario;
    @Column(name = "estado_usuario")
    private Boolean estadoUsuario;
    @OneToMany(mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<UsuarioTipoUsuario> usuarioTipoUsuarioList;
    @OneToMany(mappedBy = "idUsuario", fetch = FetchType.LAZY)
    private List<Transaccion> transaccionList;

    public Usuario() {
    }

    public Usuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Integer idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Integer getTipoDocUsuario() {
        return tipoDocUsuario;
    }

    public void setTipoDocUsuario(Integer tipoDocUsuario) {
        this.tipoDocUsuario = tipoDocUsuario;
    }

    public String getNumDocUsuario() {
        return numDocUsuario;
    }

    public void setNumDocUsuario(String numDocUsuario) {
        this.numDocUsuario = numDocUsuario;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getDireccionUsuario() {
        return direccionUsuario;
    }

    public void setDireccionUsuario(String direccionUsuario) {
        this.direccionUsuario = direccionUsuario;
    }

    public String getTelefonoUsuario() {
        return telefonoUsuario;
    }

    public void setTelefonoUsuario(String telefonoUsuario) {
        this.telefonoUsuario = telefonoUsuario;
    }

    public String getMailUsuario() {
        return mailUsuario;
    }

    public void setMailUsuario(String mailUsuario) {
        this.mailUsuario = mailUsuario;
    }

    public String getRazonsUsuario() {
        return razonsUsuario;
    }

    public void setRazonsUsuario(String razonsUsuario) {
        this.razonsUsuario = razonsUsuario;
    }

    public String getDireccionRsUsuario() {
        return direccionRsUsuario;
    }

    public void setDireccionRsUsuario(String direccionRsUsuario) {
        this.direccionRsUsuario = direccionRsUsuario;
    }

    public String getFonoRsUsuario() {
        return fonoRsUsuario;
    }

    public void setFonoRsUsuario(String fonoRsUsuario) {
        this.fonoRsUsuario = fonoRsUsuario;
    }

    public String getMailRsUsuario() {
        return mailRsUsuario;
    }

    public void setMailRsUsuario(String mailRsUsuario) {
        this.mailRsUsuario = mailRsUsuario;
    }

    public Boolean getEstadoUsuario() {
        return estadoUsuario;
    }

    public void setEstadoUsuario(Boolean estadoUsuario) {
        this.estadoUsuario = estadoUsuario;
    }

    @XmlTransient
    public List<UsuarioTipoUsuario> getUsuarioTipoUsuarioList() {
        return usuarioTipoUsuarioList;
    }

    public void setUsuarioTipoUsuarioList(List<UsuarioTipoUsuario> usuarioTipoUsuarioList) {
        this.usuarioTipoUsuarioList = usuarioTipoUsuarioList;
    }

    @XmlTransient
    public List<Transaccion> getTransaccionList() {
        return transaccionList;
    }

    public void setTransaccionList(List<Transaccion> transaccionList) {
        this.transaccionList = transaccionList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuario != null ? idUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.idUsuario == null && other.idUsuario != null) || (this.idUsuario != null && !this.idUsuario.equals(other.idUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.Usuario[ idUsuario=" + idUsuario + " ]";
    }
    
}
