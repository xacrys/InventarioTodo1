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
@Table(name = "vendedor", schema="todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Vendedor.findAll", query = "SELECT v FROM Vendedor v")
    , @NamedQuery(name = "Vendedor.findByIdVendedor", query = "SELECT v FROM Vendedor v WHERE v.idVendedor = :idVendedor")
    , @NamedQuery(name = "Vendedor.findByCedulaVendedor", query = "SELECT v FROM Vendedor v WHERE v.cedulaVendedor = :cedulaVendedor")
    , @NamedQuery(name = "Vendedor.findByNombreVendedor", query = "SELECT v FROM Vendedor v WHERE v.nombreVendedor = :nombreVendedor")
    , @NamedQuery(name = "Vendedor.findByDireccionVendedor", query = "SELECT v FROM Vendedor v WHERE v.direccionVendedor = :direccionVendedor")
    , @NamedQuery(name = "Vendedor.findByCelularVendedor", query = "SELECT v FROM Vendedor v WHERE v.celularVendedor = :celularVendedor")
    , @NamedQuery(name = "Vendedor.findByEstadoVendedor", query = "SELECT v FROM Vendedor v WHERE v.estadoVendedor = :estadoVendedor")})
public class Vendedor implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_vendedor")
    private Integer idVendedor;
    @Size(max = 10)
    @Column(name = "cedula_vendedor")
    private String cedulaVendedor;
    @Size(max = 200)
    @Column(name = "nombre_vendedor")
    private String nombreVendedor;
    @Size(max = 100)
    @Column(name = "direccion_vendedor")
    private String direccionVendedor;
    @Size(max = 10)
    @Column(name = "celular_vendedor")
    private String celularVendedor;
    @Column(name = "estado_vendedor")
    private Short estadoVendedor;
    @OneToMany(mappedBy = "idVendedor", fetch = FetchType.LAZY)
    private List<Transaccion> transaccionList;

    public Vendedor() {
    }

    public Vendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public Integer getIdVendedor() {
        return idVendedor;
    }

    public void setIdVendedor(Integer idVendedor) {
        this.idVendedor = idVendedor;
    }

    public String getCedulaVendedor() {
        return cedulaVendedor;
    }

    public void setCedulaVendedor(String cedulaVendedor) {
        this.cedulaVendedor = cedulaVendedor;
    }

    public String getNombreVendedor() {
        return nombreVendedor;
    }

    public void setNombreVendedor(String nombreVendedor) {
        this.nombreVendedor = nombreVendedor;
    }

    public String getDireccionVendedor() {
        return direccionVendedor;
    }

    public void setDireccionVendedor(String direccionVendedor) {
        this.direccionVendedor = direccionVendedor;
    }

    public String getCelularVendedor() {
        return celularVendedor;
    }

    public void setCelularVendedor(String celularVendedor) {
        this.celularVendedor = celularVendedor;
    }

    public Short getEstadoVendedor() {
        return estadoVendedor;
    }

    public void setEstadoVendedor(Short estadoVendedor) {
        this.estadoVendedor = estadoVendedor;
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
        hash += (idVendedor != null ? idVendedor.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Vendedor)) {
            return false;
        }
        Vendedor other = (Vendedor) object;
        if ((this.idVendedor == null && other.idVendedor != null) || (this.idVendedor != null && !this.idVendedor.equals(other.idVendedor))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.Vendedor[ idVendedor=" + idVendedor + " ]";
    }
    
}
