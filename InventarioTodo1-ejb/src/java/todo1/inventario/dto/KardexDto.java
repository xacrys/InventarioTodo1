/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.dto;

import java.math.BigDecimal;
import java.util.Date;

/**
 *
 * @author Xacrys10
 */
public class KardexDto {

    private Date fecha_transaccion;
    private String detalle;
    private Integer cantidadEntrada;
    private BigDecimal valorUnitarioEntrada;
    private BigDecimal valorTotalEntrada;
    private Integer cantidadSalida;
    private BigDecimal valorUnitarioSalida;
    private BigDecimal valorTotalSalida;
    private Integer cantidadExistencia;
    private BigDecimal valorUnitarioExistencia;
    private BigDecimal valorTotalExistencia;

    public KardexDto() {
    }

    public KardexDto(Date fecha_transaccion, String detalle, Integer cantidadEntrada, BigDecimal valorUnitarioEntrada, BigDecimal valorTotalEntrada, Integer cantidadSalida, BigDecimal valorUnitarioSalida, BigDecimal valorTotalSalida, Integer cantidadExistencia, BigDecimal valorUnitarioExistencia, BigDecimal valorTotalExistencia) {
        this.fecha_transaccion = fecha_transaccion;
        this.detalle = detalle;
        this.cantidadEntrada = cantidadEntrada;
        this.valorUnitarioEntrada = valorUnitarioEntrada;
        this.valorTotalEntrada = valorTotalEntrada;
        this.cantidadSalida = cantidadSalida;
        this.valorUnitarioSalida = valorUnitarioSalida;
        this.valorTotalSalida = valorTotalSalida;
        this.cantidadExistencia = cantidadExistencia;
        this.valorUnitarioExistencia = valorUnitarioExistencia;
        this.valorTotalExistencia = valorTotalExistencia;
    }

    /**
     * @return the fecha_transaccion
     */
    public Date getFecha_transaccion() {
        return fecha_transaccion;
    }

    /**
     * @param fecha_transaccion the fecha_transaccion to set
     */
    public void setFecha_transaccion(Date fecha_transaccion) {
        this.fecha_transaccion = fecha_transaccion;
    }

    /**
     * @return the detalle
     */
    public String getDetalle() {
        return detalle;
    }

    /**
     * @param detalle the detalle to set
     */
    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    /**
     * @return the cantidadEntrada
     */
    public Integer getCantidadEntrada() {
        return cantidadEntrada;
    }

    /**
     * @param cantidadEntrada the cantidadEntrada to set
     */
    public void setCantidadEntrada(Integer cantidadEntrada) {
        this.cantidadEntrada = cantidadEntrada;
    }

    /**
     * @return the valorUnitarioEntrada
     */
    public BigDecimal getValorUnitarioEntrada() {
        return valorUnitarioEntrada;
    }

    /**
     * @param valorUnitarioEntrada the valorUnitarioEntrada to set
     */
    public void setValorUnitarioEntrada(BigDecimal valorUnitarioEntrada) {
        this.valorUnitarioEntrada = valorUnitarioEntrada;
    }

    /**
     * @return the valorTotalEntrada
     */
    public BigDecimal getValorTotalEntrada() {
        return valorTotalEntrada;
    }

    /**
     * @param valorTotalEntrada the valorTotalEntrada to set
     */
    public void setValorTotalEntrada(BigDecimal valorTotalEntrada) {
        this.valorTotalEntrada = valorTotalEntrada;
    }

    /**
     * @return the cantidadSalida
     */
    public Integer getCantidadSalida() {
        return cantidadSalida;
    }

    /**
     * @param cantidadSalida the cantidadSalida to set
     */
    public void setCantidadSalida(Integer cantidadSalida) {
        this.cantidadSalida = cantidadSalida;
    }

    /**
     * @return the valorUnitarioSalida
     */
    public BigDecimal getValorUnitarioSalida() {
        return valorUnitarioSalida;
    }

    /**
     * @param valorUnitarioSalida the valorUnitarioSalida to set
     */
    public void setValorUnitarioSalida(BigDecimal valorUnitarioSalida) {
        this.valorUnitarioSalida = valorUnitarioSalida;
    }

    /**
     * @return the valorTotalSalida
     */
    public BigDecimal getValorTotalSalida() {
        return valorTotalSalida;
    }

    /**
     * @param valorTotalSalida the valorTotalSalida to set
     */
    public void setValorTotalSalida(BigDecimal valorTotalSalida) {
        this.valorTotalSalida = valorTotalSalida;
    }

    /**
     * @return the cantidadExistencia
     */
    public Integer getCantidadExistencia() {
        return cantidadExistencia;
    }

    /**
     * @param cantidadExistencia the cantidadExistencia to set
     */
    public void setCantidadExistencia(Integer cantidadExistencia) {
        this.cantidadExistencia = cantidadExistencia;
    }

    /**
     * @return the valorUnitarioExistencia
     */
    public BigDecimal getValorUnitarioExistencia() {
        return valorUnitarioExistencia;
    }

    /**
     * @param valorUnitarioExistencia the valorUnitarioExistencia to set
     */
    public void setValorUnitarioExistencia(BigDecimal valorUnitarioExistencia) {
        this.valorUnitarioExistencia = valorUnitarioExistencia;
    }

    /**
     * @return the valorTotalExistencia
     */
    public BigDecimal getValorTotalExistencia() {
        return valorTotalExistencia;
    }

    /**
     * @param valorTotalExistencia the valorTotalExistencia to set
     */
    public void setValorTotalExistencia(BigDecimal valorTotalExistencia) {
        this.valorTotalExistencia = valorTotalExistencia;
    }
    
 
}
