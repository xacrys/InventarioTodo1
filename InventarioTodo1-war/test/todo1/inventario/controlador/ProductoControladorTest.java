/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.util.List;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo1.inventario.modelo.Producto;

/**
 *
 * @author Xacrys10
 */
public class ProductoControladorTest {
    
    public ProductoControladorTest() {
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
     * Test of guardarProducto method, of class ProductoControlador.
     */
    @Test
    public void testGuardarProducto() {
        System.out.println("guardarProducto");
        ProductoControlador instance = new ProductoControlador();
        instance.guardarProducto();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    

    /**
     * Test of habilitarActualizacion method, of class ProductoControlador.
     */
    @Test
    public void testHabilitarActualizacion() {
        System.out.println("habilitarActualizacion");
        Producto prod = null;
        ProductoControlador instance = new ProductoControlador();
        instance.habilitarActualizacion(prod);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of actualizarProducto method, of class ProductoControlador.
     */
    @Test
    public void testActualizarProducto() {
        System.out.println("actualizarProducto");
        ProductoControlador instance = new ProductoControlador();
        instance.actualizarProducto();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of eliminarProducto method, of class ProductoControlador.
     */
    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        Producto pro = null;
        ProductoControlador instance = new ProductoControlador();
        instance.eliminarProducto(pro);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBotonActualizarVisible method, of class ProductoControlador.
     */
    @Test
    public void testGetBotonActualizarVisible() {
        System.out.println("getBotonActualizarVisible");
        ProductoControlador instance = new ProductoControlador();
        Boolean expResult = null;
        Boolean result = instance.getBotonActualizarVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBotonActualizarVisible method, of class ProductoControlador.
     */
    @Test
    public void testSetBotonActualizarVisible() {
        System.out.println("setBotonActualizarVisible");
        Boolean botonActualizarVisible = null;
        ProductoControlador instance = new ProductoControlador();
        instance.setBotonActualizarVisible(botonActualizarVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaCategorias method, of class ProductoControlador.
     */
    @Test
    public void testGetListaCategorias() {
        System.out.println("getListaCategorias");
        ProductoControlador instance = new ProductoControlador();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getListaCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaCategorias method, of class ProductoControlador.
     */
    @Test
    public void testSetListaCategorias() {
        System.out.println("setListaCategorias");
        List<SelectItem> listaCategorias = null;
        ProductoControlador instance = new ProductoControlador();
        instance.setListaCategorias(listaCategorias);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIdCategoria method, of class ProductoControlador.
     */
    @Test
    public void testGetIdCategoria() {
        System.out.println("getIdCategoria");
        ProductoControlador instance = new ProductoControlador();
        Integer expResult = null;
        Integer result = instance.getIdCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIdCategoria method, of class ProductoControlador.
     */
    @Test
    public void testSetIdCategoria() {
        System.out.println("setIdCategoria");
        Integer idCategoria = null;
        ProductoControlador instance = new ProductoControlador();
        instance.setIdCategoria(idCategoria);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getProducto method, of class ProductoControlador.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        ProductoControlador instance = new ProductoControlador();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setProducto method, of class ProductoControlador.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        ProductoControlador instance = new ProductoControlador();
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaProductosActivos method, of class ProductoControlador.
     */
    @Test
    public void testGetListaProductosActivos() {
        System.out.println("getListaProductosActivos");
        ProductoControlador instance = new ProductoControlador();
        List<Producto> expResult = null;
        List<Producto> result = instance.getListaProductosActivos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaProductosActivos method, of class ProductoControlador.
     */
    @Test
    public void testSetListaProductosActivos() {
        System.out.println("setListaProductosActivos");
        List<Producto> listaProductosActivos = null;
        ProductoControlador instance = new ProductoControlador();
        instance.setListaProductosActivos(listaProductosActivos);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
