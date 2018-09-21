/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.dto;

import java.math.BigDecimal;
import todo1.inventario.modelo.Producto;

/**
 *
 * @author Cristian
 */
public class DetalleProductoDto {
    
    private Producto producto;
    private BigDecimal preciouProducto;
    private Integer cantidad;
     private BigDecimal monto;

    public DetalleProductoDto() {
    }

    public DetalleProductoDto(Producto producto, BigDecimal preciouProducto, Integer cantidad, BigDecimal monto) {
        this.producto = producto;
        this.preciouProducto = preciouProducto;
        this.cantidad = cantidad;
        this.monto = monto;
    }

    /**
     * @return the producto
     */
    public Producto getProducto() {
        return producto;
    }

    /**
     * @return the preciouProducto
     */
    public BigDecimal getPreciouProducto() {
        return preciouProducto;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @return the monto
     */
    public BigDecimal getMonto() {
        return monto;
    }

    /**
     * @param producto the producto to set
     */
    public void setProducto(Producto producto) {
        this.producto = producto;
    }

    /**
     * @param preciouProducto the preciouProducto to set
     */
    public void setPreciouProducto(BigDecimal preciouProducto) {
        this.preciouProducto = preciouProducto;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @param monto the monto to set
     */
    public void setMonto(BigDecimal monto) {
        this.monto = monto;
    }
    
    
    
     
}
