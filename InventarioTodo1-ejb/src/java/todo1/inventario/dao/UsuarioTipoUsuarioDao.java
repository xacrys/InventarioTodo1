/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.dao;

import javax.ejb.Stateless;
import todo1.inventario.generico.Generico;
import todo1.inventario.modelo.UsuarioTipoUsuario;

/**
 *
 * @author Cristian
 */
@Stateless
public class UsuarioTipoUsuarioDao extends Generico<UsuarioTipoUsuario> {

    

    public UsuarioTipoUsuarioDao() {
        super(UsuarioTipoUsuario.class);
    }
    
}
