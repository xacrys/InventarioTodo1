/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.modelo;

import java.io.Serializable;
import java.math.BigDecimal;
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
 * @author Xacrys10
 */
@Entity
@Table(name = "movimiento", schema = "todo1")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Movimiento.findAll", query = "SELECT m FROM Movimiento m")
    , @NamedQuery(name = "Movimiento.findByIdMovimiento", query = "SELECT m FROM Movimiento m WHERE m.idMovimiento = :idMovimiento")
    , @NamedQuery(name = "Movimiento.findByStockAnterior", query = "SELECT m FROM Movimiento m WHERE m.stockAnterior = :stockAnterior")
    , @NamedQuery(name = "Movimiento.findByStockActual", query = "SELECT m FROM Movimiento m WHERE m.stockActual = :stockActual")
    , @NamedQuery(name = "Movimiento.findByCantidad", query = "SELECT m FROM Movimiento m WHERE m.cantidad = :cantidad")
    , @NamedQuery(name = "Movimiento.findByValorUnitario", query = "SELECT m FROM Movimiento m WHERE m.valorUnitario = :valorUnitario")
    , @NamedQuery(name = "Movimiento.findByValorTotal", query = "SELECT m FROM Movimiento m WHERE m.valorTotal = :valorTotal")})
public class Movimiento implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_movimiento")
    private Integer idMovimiento;
    @Column(name = "stock_anterior")
    private Integer stockAnterior;
    @Column(name = "stock_actual")
    private Integer stockActual;
    @Column(name = "cantidad")
    private Integer cantidad;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "valor_unitario")
    private BigDecimal valorUnitario;
    @Column(name = "valor_total")
    private BigDecimal valorTotal;
    @JoinColumn(name = "id_detalle_transaccion", referencedColumnName = "id_detalle_transaccion")
    @ManyToOne(fetch = FetchType.LAZY)
    private DetalleTransaccion idDetalleTransaccion;
    @JoinColumn(name = "id_producto", referencedColumnName = "id_producto")
    @ManyToOne(fetch = FetchType.LAZY)
    private Producto idProducto;

    public Movimiento() {
    }

    public Movimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Integer getIdMovimiento() {
        return idMovimiento;
    }

    public void setIdMovimiento(Integer idMovimiento) {
        this.idMovimiento = idMovimiento;
    }

    public Integer getStockAnterior() {
        return stockAnterior;
    }

    public void setStockAnterior(Integer stockAnterior) {
        this.stockAnterior = stockAnterior;
    }

    public Integer getStockActual() {
        return stockActual;
    }

    public void setStockActual(Integer stockActual) {
        this.stockActual = stockActual;
    }

    public Integer getCantidad() {
        return cantidad;
    }

    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    public BigDecimal getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(BigDecimal valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public BigDecimal getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(BigDecimal valorTotal) {
        this.valorTotal = valorTotal;
    }

    public DetalleTransaccion getIdDetalleTransaccion() {
        return idDetalleTransaccion;
    }

    public void setIdDetalleTransaccion(DetalleTransaccion idDetalleTransaccion) {
        this.idDetalleTransaccion = idDetalleTransaccion;
    }

    public Producto getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(Producto idProducto) {
        this.idProducto = idProducto;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idMovimiento != null ? idMovimiento.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Movimiento)) {
            return false;
        }
        Movimiento other = (Movimiento) object;
        if ((this.idMovimiento == null && other.idMovimiento != null) || (this.idMovimiento != null && !this.idMovimiento.equals(other.idMovimiento))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "todo1.inventario.modelo.Movimiento[ idMovimiento=" + idMovimiento + " ]";
    }
    
}
