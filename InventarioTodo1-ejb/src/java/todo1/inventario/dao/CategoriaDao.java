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
import todo1.inventario.modelo.Categoria;

/**
 *
 * @author Cristian
 */
@Stateless
public class CategoriaDao extends Generico<Categoria> {

    public CategoriaDao() {
        super(Categoria.class);
    }

    public Categoria buscarCategoriaPorNombreDao(String nombre) {
        try {
            List<Categoria> resultado = new ArrayList<>();
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT c FROM Categoria c WHERE c.nombr = :nombr");
            Query query;
            query = getEntityManager().createQuery(sql.toString()).setParameter("nombr", nombre);
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
