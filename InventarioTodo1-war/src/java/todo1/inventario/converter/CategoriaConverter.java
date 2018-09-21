/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.converter;

import javax.ejb.EJB;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.convert.Converter;
import javax.faces.convert.ConverterException;
import javax.faces.convert.FacesConverter;
import todo1.inventario.modelo.Categoria;
import todo1.inventario.servicio.CategoriaServicio;

/**
 *
 * @author Cristian
 */

@FacesConverter("categoriaConverter")
public class CategoriaConverter implements Converter{
    
    @EJB 
    private CategoriaServicio categoriaServicio;
  
    
    public Object getAsObject(FacesContext fc, UIComponent uic, String value) {
        if(value != null && value.trim().length() > 0) {
            try {
                return categoriaServicio.buscarCategoriaPorId(Integer.parseInt(value));
            } catch(NumberFormatException e) {
                throw new ConverterException(new FacesMessage(FacesMessage.SEVERITY_ERROR, "Conversion Error", "Not a valid theme."));
            }
        }
        else {
            return null;
        }
    }
 
    public String getAsString(FacesContext fc, UIComponent uic, Object object) {
        if(object != null) {
            return String.valueOf(((Categoria) object).getIdCategoria());
        }
        else {
            return null;
        }
    }
    
}
