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
import todo1.inventario.modelo.TipoUsuario;

/**
 *
 * @author Cristian
 */
@Stateless
public class TipoUsuarioDao extends Generico<TipoUsuario> {


    public TipoUsuarioDao() {
        super(TipoUsuario.class);
    }
    
    
    public TipoUsuario obtenerTipoUsuarioPorIdDao(Integer idTipoUsuario){
    try {
            List<TipoUsuario> resultado = new ArrayList<>();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT t FROM TipoUsuario t WHERE t.idTipoUsuario = :idTipoUsuario");
            Query query;
            query = getEntityManager().createQuery(sql.toString()).setParameter("idTipoUsuario", idTipoUsuario);
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
