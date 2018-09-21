/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.faces.model.SelectItem;
import todo1.inventario.dao.ProductoDao;
import todo1.inventario.modelo.Categoria;
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

    public Producto buscarProductoPorNombre(String nombreProducto) {
        return productoDao.buscarCategoriaPorNombreDao(nombreProducto);
    }

    public Boolean guardarProducto(Producto producto) {
        Producto prod = productoDao.editEntity(producto);
        return prod != null;
    }

    public List<Producto> obtenerListaProductosActivos() {
        return productoDao.obtenerCategoriasActivasDao();
    }

    public List<SelectItem> obtenerListaProductosActivosPorCategoria(Categoria categoria) {
        List<SelectItem> listaSelectItems = new ArrayList<>();
        List<Producto> listaProductos = productoDao.obtenerListaProductosActivosPorCategoriaDao(categoria);
        listaProductos.forEach((pro) -> {
            listaSelectItems.add(new SelectItem(pro.getIdProducto(), pro.getNombreProducto()));
        });
        if (listaSelectItems != null && !listaSelectItems.isEmpty()) {
            return listaSelectItems;
        } else {
            return null;
        }
    }

    public Producto buscarProductoPorId(Integer idProducto) {
        return productoDao.find(idProducto);
    }

}
