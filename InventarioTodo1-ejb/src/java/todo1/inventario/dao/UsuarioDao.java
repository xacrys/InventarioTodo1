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
import todo1.inventario.generico.Generico;
import todo1.inventario.modelo.Usuario;

/**
 *
 * @author Cristian
 */
@Stateless
public class UsuarioDao extends Generico<Usuario> {

  

    public UsuarioDao() {
        super(Usuario.class);
    }
    
     public Usuario buscarUsuarioClienteDao(String cedula, Integer codTipoUsuario) {
        try {
            List<Usuario> resultado = new ArrayList<>();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT u.nombre_usuario, u.id_usuario,u.tipo_doc_usuario,u.num_doc_usuario,u.direccion_usuario,u.telefono_usuario,");
            sql.append("u.mail_usuario,u.razons_usuario,u.direccion_rs_usuario,u.fono_rs_usuario,u.mail_rs_usuario,u.estado_usuario");
            sql.append(" FROM todo1.usuario u INNER JOIN todo1.usuario_tipo_usuario  utu ON utu.id_usuario = u.id_usuario");
            sql.append(" INNER JOIN todo1.tipo_usuario tu ON utu.id_tipo_usuario = tu.id_tipo_usuario WHERE u.num_doc_usuario='").append(cedula).append("'");
            sql.append(" AND tu.id_tipo_usuario = ").append(codTipoUsuario).append(" AND u.estado_usuario = TRUE");
            Query query;
            query = getEntityManager().createNativeQuery(sql.toString(),Usuario.class);
            resultado = query.getResultList();
            if (resultado != null && !resultado.isEmpty()) {
                return resultado.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
     }
     
     public Usuario obtenerUsuarioPorCedulaDao(String cedula) {
        try {
            List<Usuario> resultado = new ArrayList<>();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT u FROM Usuario u WHERE u.numDocUsuario = :numDocUsuario");
            Query query;
            query = getEntityManager().createQuery(sql.toString()).setParameter("numDocUsuario", cedula);
            resultado = query.getResultList();
            if (resultado != null && !resultado.isEmpty()) {
                return resultado.get(0);
            } else {
                return null;
            }
        } catch (Exception e) {
            return null;
        }
     }
     
     
    
    
}
