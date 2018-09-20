/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "usuario_tipo_usuario", schema = "todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "UsuarioTipoUsuario.findAll", query = "SELECT u FROM UsuarioTipoUsuario u")
    , @NamedQuery(name = "UsuarioTipoUsuario.findByIdUsuTipUsuario", query = "SELECT u FROM UsuarioTipoUsuario u WHERE u.idUsuTipUsuario = :idUsuTipUsuario")})
public class UsuarioTipoUsuario implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_usu_tip_usuario")
    private Integer idUsuTipUsuario;
    @JoinColumn(name = "id_tipo_usuario", referencedColumnName = "id_tipo_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private TipoUsuario idTipoUsuario;
    @JoinColumn(name = "id_usuario", referencedColumnName = "id_usuario")
    @ManyToOne(fetch = FetchType.LAZY)
    private Usuario idUsuario;

    public UsuarioTipoUsuario() {
    }

    public UsuarioTipoUsuario(Integer idUsuTipUsuario) {
        this.idUsuTipUsuario = idUsuTipUsuario;
    }

    public Integer getIdUsuTipUsuario() {
        return idUsuTipUsuario;
    }

    public void setIdUsuTipUsuario(Integer idUsuTipUsuario) {
        this.idUsuTipUsuario = idUsuTipUsuario;
    }

    public TipoUsuario getIdTipoUsuario() {
        return idTipoUsuario;
    }

    public void setIdTipoUsuario(TipoUsuario idTipoUsuario) {
        this.idTipoUsuario = idTipoUsuario;
    }

    public Usuario getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(Usuario idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idUsuTipUsuario != null ? idUsuTipUsuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof UsuarioTipoUsuario)) {
            return false;
        }
        UsuarioTipoUsuario other = (UsuarioTipoUsuario) object;
        if ((this.idUsuTipUsuario == null && other.idUsuTipUsuario != null) || (this.idUsuTipUsuario != null && !this.idUsuTipUsuario.equals(other.idUsuTipUsuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.UsuarioTipoUsuario[ idUsuTipUsuario=" + idUsuTipUsuario + " ]";
    }
    
}
