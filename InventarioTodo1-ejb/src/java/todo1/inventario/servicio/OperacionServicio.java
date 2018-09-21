/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import todo1.inventario.dao.OperacionDao;
import todo1.inventario.modelo.Operacion;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class OperacionServicio {

    @EJB
    private OperacionDao operacionDao;

    public Operacion obtenerOperacionPorId(Integer idOperacion) {
        return operacionDao.find(idOperacion);
    }

}
