/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import todo1.inventario.dao.MovimientoDao;
import todo1.inventario.dto.DetalleKardexDto;
import todo1.inventario.modelo.Movimiento;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class MovimientoServicio {


 @EJB
 private MovimientoDao movimientoDao;
 
 public Movimiento guardarMovimiento(Movimiento movimiento){
     return movimientoDao.editEntity(movimiento);
 }
 
 public List<DetalleKardexDto> obtenerListaMovimientosKardex(Integer idProducto){
     return movimientoDao.obtenerListaMovimientosKardexDao(idProducto);
 }
    
}
