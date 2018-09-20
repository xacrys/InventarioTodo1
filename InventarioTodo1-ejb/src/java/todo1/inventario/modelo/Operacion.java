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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "operacion", schema="todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Operacion.findAll", query = "SELECT o FROM Operacion o")
    , @NamedQuery(name = "Operacion.findByIdOperacion", query = "SELECT o FROM Operacion o WHERE o.idOperacion = :idOperacion")
    , @NamedQuery(name = "Operacion.findByDescripcionOperacion", query = "SELECT o FROM Operacion o WHERE o.descripcionOperacion = :descripcionOperacion")
    , @NamedQuery(name = "Operacion.findByEstadoOperacion", query = "SELECT o FROM Operacion o WHERE o.estadoOperacion = :estadoOperacion")})
public class Operacion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_operacion")
    private Integer idOperacion;
    @Size(max = 100)
    @Column(name = "descripcion_operacion")
    private String descripcionOperacion;
    @Column(name = "estado_operacion")
    private Short estadoOperacion;
    @JoinColumn(name = "id_transaccion", referencedColumnName = "id_transaccion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Transaccion idTransaccion;

    public Operacion() {
    }

    public Operacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public Integer getIdOperacion() {
        return idOperacion;
    }

    public void setIdOperacion(Integer idOperacion) {
        this.idOperacion = idOperacion;
    }

    public String getDescripcionOperacion() {
        return descripcionOperacion;
    }

    public void setDescripcionOperacion(String descripcionOperacion) {
        this.descripcionOperacion = descripcionOperacion;
    }

    public Short getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(Short estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public Transaccion getIdTransaccion() {
        return idTransaccion;
    }

    public void setIdTransaccion(Transaccion idTransaccion) {
        this.idTransaccion = idTransaccion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idOperacion != null ? idOperacion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Operacion)) {
            return false;
        }
        Operacion other = (Operacion) object;
        if ((this.idOperacion == null && other.idOperacion != null) || (this.idOperacion != null && !this.idOperacion.equals(other.idOperacion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.Operacion[ idOperacion=" + idOperacion + " ]";
    }
    
}
