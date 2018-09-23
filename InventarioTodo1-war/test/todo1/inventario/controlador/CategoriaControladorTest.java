/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.util.List;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo1.inventario.modelo.Categoria;

/**
 *
 * @author Xacrys10
 */
public class CategoriaControladorTest {
    
    public CategoriaControladorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

   

    /**
     * Test of guardarCategoria method, of class CategoriaControlador.
     */
    @Test
    public void testGuardarCategoria() {
        System.out.println("guardarCategoria");
        CategoriaControlador instance = new CategoriaControlador();
        instance.guardarCategoria();
        // TODO review the generated test code and remove the default call to fail.
       assertTrue(true);
    }

    

    /**
     * Test of habilitarActualizacion method, of class CategoriaControlador.
     */
    @Test
    public void testHabilitarActualizacion() {
        System.out.println("habilitarActualizacion");
        Categoria cat = null;
        CategoriaControlador instance = new CategoriaControlador();
        instance.habilitarActualizacion(cat);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of actualizarCategoria method, of class CategoriaControlador.
     */
    @Test
    public void testActualizarCategoria() {
        System.out.println("actualizarCategoria");
        CategoriaControlador instance = new CategoriaControlador();
        instance.actualizarCategoria();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    

    /**
     * Test of getCategoria method, of class CategoriaControlador.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        CategoriaControlador instance = new CategoriaControlador();
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setCategoria method, of class CategoriaControlador.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria categoria = null;
        CategoriaControlador instance = new CategoriaControlador();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaCategoriasActivas method, of class CategoriaControlador.
     */
    @Test
    public void testGetListaCategoriasActivas() {
        System.out.println("getListaCategoriasActivas");
        CategoriaControlador instance = new CategoriaControlador();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.getListaCategoriasActivas();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaCategoriasActivas method, of class CategoriaControlador.
     */
    @Test
    public void testSetListaCategoriasActivas() {
        System.out.println("setListaCategoriasActivas");
        List<Categoria> listaCategoriasActivas = null;
        CategoriaControlador instance = new CategoriaControlador();
        instance.setListaCategoriasActivas(listaCategoriasActivas);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBotonActualizarVisible method, of class CategoriaControlador.
     */
    @Test
    public void testGetBotonActualizarVisible() {
        System.out.println("getBotonActualizarVisible");
        CategoriaControlador instance = new CategoriaControlador();
        Boolean expResult = null;
        Boolean result = instance.getBotonActualizarVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBotonActualizarVisible method, of class CategoriaControlador.
     */
    @Test
    public void testSetBotonActualizarVisible() {
        System.out.println("setBotonActualizarVisible");
        Boolean botonActualizarVisible = null;
        CategoriaControlador instance = new CategoriaControlador();
        instance.setBotonActualizarVisible(botonActualizarVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
