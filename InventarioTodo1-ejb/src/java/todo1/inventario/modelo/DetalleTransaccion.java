/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;
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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Cristian
 */
@Entity
@Table(name = "detalle_transaccion", schema="todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "DetalleTransaccion.findAll", query = "SELECT d FROM DetalleTransaccion d")
    , @NamedQuery(name = "DetalleTransaccion.findByIdDetalleTransaccion", query = "SELECT d FROM DetalleTransaccion d WHERE d.idDetalleTransaccion = :idDetalleTransaccion")
    , @NamedQuery(name = "DetalleTransaccion.findByCantidadDetalleTransaccion", query = "SELECT d FROM DetalleTransaccion d WHERE d.cantidadDetalleTransaccion = :cantidadDetalleTransaccion")
    , @NamedQuery(name = "DetalleTransaccion.findByPreciouDetalleTransaccion", query = "SELECT d FROM DetalleTransaccion d WHERE d.preciouDetalleTransaccion = :preciouDetalleTransaccion")
    , @NamedQuery(name = "DetalleTransaccion.findByMontoDetalleTransaccion", query = "SELECT d FROM DetalleTransaccion d WHERE d.montoDetalleTransaccion = :montoDetalleTransaccion")})
public class DetalleTransaccion implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_detalle_transaccion")
    private Integer idDetalleTransaccion;
    @Column(name = "cantidad_detalle_transaccion")
    private Integer cantidadDetalleTransaccion;
    @Column(name = "preciou_detalle_transaccion")
    private Long preciouDetalleTransaccion;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "monto_detalle_transaccion")
    private BigDecimal montoDetalleTransaccion;
    @OneToMany(mappedBy = "idDetalleTransaccion", fetch = FetchType.LAZY)
    private List<Movimiento> movimientoList;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idProducto;
    @JoinColumn(name = "id_transaccion", referencedColumnName = "id_transaccion")
    @ManyToOne(fetch = FetchType.LAZY)
    private Transaccion idTransaccion;

    public DetalleTransaccion() {
    }

    public DetalleTransaccion(Integer idDetalleTransaccion) {
        this.idDetalleTransaccion = idDetalleTransaccion;
    }

    public Integer getIdDetalleTransaccion() {
        return idDetalleTransaccion;
    }

    public void setIdDetalleTransaccion(Integer idDetalleTransaccion) {
        this.idDetalleTransaccion = idDetalleTransaccion;
    }

    public Integer getCantidadDetalleTransaccion() {
        return cantidadDetalleTransaccion;
    }

    public void setCantidadDetalleTransaccion(Integer cantidadDetalleTransaccion) {
        this.cantidadDetalleTransaccion = cantidadDetalleTransaccion;
    }

    public Long getPreciouDetalleTransaccion() {
        return preciouDetalleTransaccion;
    }

    public void setPreciouDetalleTransaccion(Long preciouDetalleTransaccion) {
        this.preciouDetalleTransaccion = preciouDetalleTransaccion;
    }

    public BigDecimal getMontoDetalleTransaccion() {
        return montoDetalleTransaccion;
    }

    public void setMontoDetalleTransaccion(BigDecimal montoDetalleTransaccion) {
        this.montoDetalleTransaccion = montoDetalleTransaccion;
    }

    @XmlTransient
    public List<Movimiento> getMovimientoList() {
        return movimientoList;
    }

    public void setMovimientoList(List<Movimiento> movimientoList) {
        this.movimientoList = movimientoList;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
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
        hash += (idDetalleTransaccion != null ? idDetalleTransaccion.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof DetalleTransaccion)) {
            return false;
        }
        DetalleTransaccion other = (DetalleTransaccion) object;
        if ((this.idDetalleTransaccion == null && other.idDetalleTransaccion != null) || (this.idDetalleTransaccion != null && !this.idDetalleTransaccion.equals(other.idDetalleTransaccion))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.DetalleTransaccion[ idDetalleTransaccion=" + idDetalleTransaccion + " ]";
    }
    
}
