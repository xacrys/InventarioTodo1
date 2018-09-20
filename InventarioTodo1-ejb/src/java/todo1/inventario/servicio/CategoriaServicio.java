/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.servicio;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
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

}
