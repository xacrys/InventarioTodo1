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
import todo1.inventario.dao.CategoriaDao;
import todo1.inventario.modelo.Categoria;

/**
 *
 * @author Cristian
 */
@LocalBean
@Stateless
public class CategoriaServicio {

    @EJB
    private CategoriaDao categoriaDao;

    public Boolean guardarCategoria(Categoria categoria) {
        Categoria cat = categoriaDao.editEntity(categoria);
        return cat != null;
    }

    public Categoria buscarCategoriaPorNombre(String nombre) {
        return categoriaDao.buscarCategoriaPorNombreDao(nombre);
    }
    
    public Categoria buscarCategoriaPorId(Integer idProducto) {
        return categoriaDao.buscarCategoriaPorIdDao(idProducto);
    }

    public List<Categoria> obtenerCategoriasActivas() {
        return categoriaDao.obtenerCategoriasActivasDao();
    }

    public List<SelectItem> obtenerListaItemCategorias() {
        List<SelectItem> listaSelectItems = new ArrayList<>();
        List<Categoria> listaCategorias = categoriaDao.obtenerCategoriasActivasDao();
        if (listaCategorias != null && !listaCategorias.isEmpty()) {
            for (Categoria categoria : listaCategorias) {
                listaSelectItems.add(new SelectItem(categoria.getIdCategoria(), categoria.getNombr()));
            }
            return listaSelectItems;
        } else {
            return null;
        }

    }

}
