/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import todo1.inventario.dao.VendedorDao;
import todo1.inventario.modelo.Vendedor;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class VendedorServicio {

    @EJB
    private VendedorDao vendedorDao;

    public Vendedor obtenerVendedorPorCedula(String cedula) {
        return vendedorDao.obtenerVendedorPorCedulaDao(cedula);
    }
}
