/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import todo1.inventario.dao.UsuarioDao;
import todo1.inventario.modelo.Usuario;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class UsuarioServicio {

    @EJB
    private UsuarioDao usuarioDao;

    public Usuario buscarUsuarioCliente(String cedula, Integer codTipoUsuario) {
        return usuarioDao.buscarUsuarioClienteDao(cedula, codTipoUsuario);
    }
}
