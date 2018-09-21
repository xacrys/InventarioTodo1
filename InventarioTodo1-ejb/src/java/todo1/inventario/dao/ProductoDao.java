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
import todo1.inventario.modelo.Producto;

/**
 *
 * @author Cristian
 */
@Stateless
public class ProductoDao extends Generico<Producto> {

 

    public ProductoDao() {
        super(Producto.class);
    }
    
     public Producto buscarCategoriaPorNombreDao(String nombre) {
        try {
            List<Producto> resultado ;
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT p FROM Producto p WHERE p.nombreProducto = :nombreProducto");
            Query query;
            query = getEntityManager().createQuery(sql.toString()).setParameter("nombreProducto", nombre);
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
     
     public List<Producto> obtenerCategoriasActivasDao() {
        try {
            List<Producto> resultado ;
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT p FROM Producto p WHERE p.estadoProducto = :estadoProducto");
            Query query;
            query = getEntityManager().createQuery(sql.toString()).setParameter("estadoProducto", true);
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
