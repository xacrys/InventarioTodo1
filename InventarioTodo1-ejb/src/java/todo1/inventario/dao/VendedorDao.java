/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.dao;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.Query;
import todo1.inventario.generico.Generico;
import todo1.inventario.modelo.Vendedor;

/**
 *
 * @author Cristian
 */
@Stateless
public class VendedorDao extends Generico<Vendedor> {

    

    public VendedorDao() {
        super(Vendedor.class);
    }
    
    public Vendedor obtenerVendedorPorCedulaDao(String cedula){
     try {
            List<Vendedor> resultado ;
            StringBuilder sql = new StringBuilder();
            sql.append("SELECT v FROM Vendedor v WHERE v.cedulaVendedor = :cedulaVendedor");
            Query query;
            query = getEntityManager().createQuery(sql.toString()).setParameter("cedulaVendedor", cedula);
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
