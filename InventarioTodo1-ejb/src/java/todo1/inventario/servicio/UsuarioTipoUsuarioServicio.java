/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import todo1.inventario.dao.UsuarioTipoUsuarioDao;
import todo1.inventario.modelo.UsuarioTipoUsuario;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class UsuarioTipoUsuarioServicio {
    
    @EJB
    private UsuarioTipoUsuarioDao usuarioTipoUsuarioDao;
    
    public void guardarUsuarioTipoUsuario(UsuarioTipoUsuario usuarioTipoUsuario) {
        usuarioTipoUsuarioDao.edit(usuarioTipoUsuario);
    }
    
}
