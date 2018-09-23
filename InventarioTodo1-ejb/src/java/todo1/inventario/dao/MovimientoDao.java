/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.dao;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import todo1.inventario.dto.DetalleKardexDto;
import todo1.inventario.generico.Generico;
import todo1.inventario.modelo.Movimiento;

/**
 *
 * @author Cristian
 */
@Stateless
public class MovimientoDao extends Generico<Movimiento> {


    public MovimientoDao() {
        super(Movimiento.class);
    }
    
    public List<DetalleKardexDto> obtenerListaMovimientosKardexDao(Integer idProducto) {
        try {
            List<DetalleKardexDto> resultado;
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT ROW_NUMBER () OVER (Order by tr.fecha_transaccion) as id,tr.fecha_transaccion,CASE WHEN tr.id_operacion = 1 THEN 'compra' WHEN tr.id_operacion = 2 THEN 'venta'");
            sql.append("END as descripcion,tr.id_transaccion,tr.id_operacion,u.num_doc_usuario,mo.cantidad,mo.valor_unitario,mo.valor_total,mo.stock_actual");
            sql.append(" FROM todo1.movimiento mo INNER JOIN todo1.detalle_transaccion  dt ON mo.id_detalle_transaccion = dt.id_detalle_transaccion");
            sql.append(" INNER JOIN todo1.transaccion  tr ON dt.id_transaccion = tr.id_transaccion INNER JOIN todo1.usuario u ON tr.id_usuario = u.id_usuario");
            sql.append(" INNER JOIN todo1.producto pr ON mo.id_producto = pr.id_producto AND dt.id_producto = pr.id_producto");
            sql.append(" WHERE pr.id_producto =").append(idProducto);
            sql.append(" ORDER BY 1 ASC");
            Query query;
            query = getEntityManager().createNativeQuery(sql.toString(), DetalleKardexDto.class);
            resultado = query.getResultList();
            if (resultado != null && !resultado.isEmpty()) {
                return resultado;
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
    }
    
}
