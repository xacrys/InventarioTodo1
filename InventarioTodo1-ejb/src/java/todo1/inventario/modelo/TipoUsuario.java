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
 * @author Cristian
 */
@Entity
@Table(name = "tipo_usuario", schema = "todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "TipoUsuario.findAll", query = "SELECT t FROM TipoUsuario t")
    , @NamedQuery(name = "TipoUsuario.findByIdTipoUsuario", query = "SELECT t FROM TipoUsuario t WHERE t.idTipoUsuario = :idTipoUsuario")
    , @NamedQuery(name = "TipoUsuario.findByDescripcionTipoUsuario", query = "SELECT t FROM TipoUsuario t WHERE t.descripcionTipoUsuario = :descripcionTipoUsuario")
    , @NamedQuery(name = "TipoUsuario.findByEstadoTipoUsuario", query = "SELECT t FROM TipoUsuario t WHERE t.estadoTipoUsuario = :estadoTipoUsuario")})
public class TipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_tipo_usuario")
    private Integer idTipoUsuario;
    @Size(max = 100)
    @Column(name = "descripcion_tipo_usuario")
    private String descripcionTipoUsuario;
    @Column(name = "estado_tipo_usuario")
    private Boolean estadoTipoUsuario;
    @OneToMany(mappedBy = "idTipoUsuario", fetch = FetchType.LAZY)
    private List<UsuarioTipoUsuario> usuarioTipoUsuarioList;

    public TipoUsuario() {
    }

    public TipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Integer getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(Integer idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public String getDescripcionTipoUsuario() {
        return descripcionTipoUsuario;
    }

    public void setDescripcionTipoUsuario(String descripcionTipoUsuario) {
        this.descripcionTipoUsuario = descripcionTipoUsuario;
    }

    public Boolean getEstadoTipoUsuario() {
        return estadoTipoUsuario;
    }

    public void setEstadoTipoUsuario(Boolean estadoTipoUsuario) {
        this.estadoTipoUsuario = estadoTipoUsuario;
    }

    @XmlTransient
    public List<UsuarioTipoUsuario> getUsuarioTipoUsuarioList() {
        return usuarioTipoUsuarioList;
    }

    public void setUsuarioTipoUsuarioList(List<UsuarioTipoUsuario> usuarioTipoUsuarioList) {
        this.usuarioTipoUsuarioList = usuarioTipoUsuarioList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idTipoUsuario != null ? idTipoUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof TipoUsuario)) {
            return false;
        }
        TipoUsuario other = (TipoUsuario) object;
        if ((this.idTipoUsuario == null && other.idTipoUsuario != null) || (this.idTipoUsuario != null && !this.idTipoUsuario.equals(other.idTipoUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.TipoUsuario[ idTipoUsuario=" + idTipoUsuario + " ]";
    }
    
}
