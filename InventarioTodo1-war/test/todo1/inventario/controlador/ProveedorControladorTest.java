/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo1.inventario.modelo.Usuario;

/**
 *
 * @author Xacrys10
 */
public class ProveedorControladorTest {
    
    public ProveedorControladorTest() {
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
     * Test of inicio method, of class ProveedorControlador.
     */
    @Test
    public void testInicio() {
        System.out.println("inicio");
        ProveedorControlador instance = new ProveedorControlador();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of buscarProveedor method, of class ProveedorControlador.
     */
    @Test
    public void testBuscarProveedor() {
        System.out.println("buscarProveedor");
        ProveedorControlador instance = new ProveedorControlador();
        instance.buscarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of guardarProveedor method, of class ProveedorControlador.
     */
    @Test
    public void testGuardarProveedor() {
        System.out.println("guardarProveedor");
        ProveedorControlador instance = new ProveedorControlador();
        instance.guardarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }


    /**
     * Test of actualizarProveedor method, of class ProveedorControlador.
     */
    @Test
    public void testActualizarProveedor() {
        System.out.println("actualizarProveedor");
        ProveedorControlador instance = new ProveedorControlador();
        instance.actualizarProveedor();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIdTipoDocumento method, of class ProveedorControlador.
     */
    @Test
    public void testGetIdTipoDocumento() {
        System.out.println("getIdTipoDocumento");
        ProveedorControlador instance = new ProveedorControlador();
        Integer expResult = null;
        Integer result = instance.getIdTipoDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIdTipoDocumento method, of class ProveedorControlador.
     */
    @Test
    public void testSetIdTipoDocumento() {
        System.out.println("setIdTipoDocumento");
        Integer idTipoDocumento = null;
        ProveedorControlador instance = new ProveedorControlador();
        instance.setIdTipoDocumento(idTipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBotonActualizarVisible method, of class ProveedorControlador.
     */
    @Test
    public void testGetBotonActualizarVisible() {
        System.out.println("getBotonActualizarVisible");
        ProveedorControlador instance = new ProveedorControlador();
        Boolean expResult = null;
        Boolean result = instance.getBotonActualizarVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBotonActualizarVisible method, of class ProveedorControlador.
     */
    @Test
    public void testSetBotonActualizarVisible() {
        System.out.println("setBotonActualizarVisible");
        Boolean botonActualizarVisible = null;
        ProveedorControlador instance = new ProveedorControlador();
        instance.setBotonActualizarVisible(botonActualizarVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getUsuario method, of class ProveedorControlador.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        ProveedorControlador instance = new ProveedorControlador();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setUsuario method, of class ProveedorControlador.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        ProveedorControlador instance = new ProveedorControlador();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getCamposHabilitados method, of class ProveedorControlador.
     */
    @Test
    public void testGetCamposHabilitados() {
        System.out.println("getCamposHabilitados");
        ProveedorControlador instance = new ProveedorControlador();
        Boolean expResult = null;
        Boolean result = instance.getCamposHabilitados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setCamposHabilitados method, of class ProveedorControlador.
     */
    @Test
    public void testSetCamposHabilitados() {
        System.out.println("setCamposHabilitados");
        Boolean camposHabilitados = null;
        ProveedorControlador instance = new ProveedorControlador();
        instance.setCamposHabilitados(camposHabilitados);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
