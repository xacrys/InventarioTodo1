/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.dto;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Temporal;

/**
 *
 * @author Xacrys10
 */
@Entity
public class DetalleKardexDto {
    
    @Id
    private Integer id;
    @Temporal(javax.persistence.TemporalType.DATE)
    private Date fecha_transaccion;
    private String descripcion;
    private Integer id_transaccion;
    private Integer id_operacion;
    private String num_doc_usuario;
    private Integer cantidad;
    private BigDecimal valor_unitario;
    private BigDecimal valor_total;
    private Integer stock_actual;

    public DetalleKardexDto() {
    }

    public DetalleKardexDto(Integer id, Date fecha_transaccion, String descripcion, Integer id_transaccion, Integer id_operacion, String num_doc_usuario, Integer cantidad, BigDecimal valor_unitario, BigDecimal valor_total, Integer stock_actual) {
        this.id = id;
        this.fecha_transaccion = fecha_transaccion;
        this.descripcion = descripcion;
        this.id_transaccion = id_transaccion;
        this.id_operacion = id_operacion;
        this.num_doc_usuario = num_doc_usuario;
        this.cantidad = cantidad;
        this.valor_unitario = valor_unitario;
        this.valor_total = valor_total;
        this.stock_actual = stock_actual;
    }

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
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
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the id_transaccion
     */
    public Integer getId_transaccion() {
        return id_transaccion;
    }

    /**
     * @param id_transaccion the id_transaccion to set
     */
    public void setId_transaccion(Integer id_transaccion) {
        this.id_transaccion = id_transaccion;
    }

    /**
     * @return the id_operacion
     */
    public Integer getId_operacion() {
        return id_operacion;
    }

    /**
     * @param id_operacion the id_operacion to set
     */
    public void setId_operacion(Integer id_operacion) {
        this.id_operacion = id_operacion;
    }

    /**
     * @return the num_doc_usuario
     */
    public String getNum_doc_usuario() {
        return num_doc_usuario;
    }

    /**
     * @param num_doc_usuario the num_doc_usuario to set
     */
    public void setNum_doc_usuario(String num_doc_usuario) {
        this.num_doc_usuario = num_doc_usuario;
    }

    /**
     * @return the cantidad
     */
    public Integer getCantidad() {
        return cantidad;
    }

    /**
     * @param cantidad the cantidad to set
     */
    public void setCantidad(Integer cantidad) {
        this.cantidad = cantidad;
    }

    /**
     * @return the valor_unitario
     */
    public BigDecimal getValor_unitario() {
        return valor_unitario;
    }

    /**
     * @param valor_unitario the valor_unitario to set
     */
    public void setValor_unitario(BigDecimal valor_unitario) {
        this.valor_unitario = valor_unitario;
    }

    /**
     * @return the valor_total
     */
    public BigDecimal getValor_total() {
        return valor_total;
    }

    /**
     * @param valor_total the valor_total to set
     */
    public void setValor_total(BigDecimal valor_total) {
        this.valor_total = valor_total;
    }

    /**
     * @return the stock_actual
     */
    public Integer getStock_actual() {
        return stock_actual;
    }

    /**
     * @param stock_actual the stock_actual to set
     */
    public void setStock_actual(Integer stock_actual) {
        this.stock_actual = stock_actual;
    }

    

    
    
}
