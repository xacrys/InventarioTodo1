/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import todo1.inventario.dao.ProductoDao;
import todo1.inventario.modelo.Producto;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class ProductoServicio {
    
    @EJB
    private ProductoDao productoDao;
    
    
    public Producto buscarCategoriaPorNombre(String nombreProducto){
        return productoDao.buscarCategoriaPorNombreDao(nombreProducto);
    }
    
    public Boolean guardarProducto(Producto producto) {
        Producto prod = productoDao.editEntity(producto);
        return prod != null;
    }
    
    public List<Producto> obtenerListaProductosActivos(){
        return productoDao.obtenerCategoriasActivasDao();
    }
    
    
    
}
