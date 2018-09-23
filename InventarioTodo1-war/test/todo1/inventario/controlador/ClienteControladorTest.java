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
public class ClienteControladorTest {
    
    public ClienteControladorTest() {
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
     * Test of cambiarModelo method, of class ClienteControlador.
     */
    @Test
    public void testCambiarModelo() {
        System.out.println("cambiarModelo");
        ClienteControlador instance = new ClienteControlador();
        instance.cambiarModelo();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of buscarCliente method, of class ClienteControlador.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        ClienteControlador instance = new ClienteControlador();
        instance.buscarCliente();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of guardarCliente method, of class ClienteControlador.
     */
    @Test
    public void testGuardarCliente() {
        System.out.println("guardarCliente");
        ClienteControlador instance = new ClienteControlador();
        instance.guardarCliente();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    

    /**
     * Test of actualizarCliente method, of class ClienteControlador.
     */
    @Test
    public void testActualizarCliente() {
        System.out.println("actualizarCliente");
        ClienteControlador instance = new ClienteControlador();
        instance.actualizarCliente();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIdTipoDocumento method, of class ClienteControlador.
     */
    @Test
    public void testGetIdTipoDocumento() {
        System.out.println("getIdTipoDocumento");
        ClienteControlador instance = new ClienteControlador();
        Integer expResult = null;
        Integer result = instance.getIdTipoDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIdTipoDocumento method, of class ClienteControlador.
     */
    @Test
    public void testSetIdTipoDocumento() {
        System.out.println("setIdTipoDocumento");
        Integer idTipoDocumento = null;
        ClienteControlador instance = new ClienteControlador();
        instance.setIdTipoDocumento(idTipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBotonActualizarVisible method, of class ClienteControlador.
     */
    @Test
    public void testGetBotonActualizarVisible() {
        System.out.println("getBotonActualizarVisible");
        ClienteControlador instance = new ClienteControlador();
        Boolean expResult = null;
        Boolean result = instance.getBotonActualizarVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBotonActualizarVisible method, of class ClienteControlador.
     */
    @Test
    public void testSetBotonActualizarVisible() {
        System.out.println("setBotonActualizarVisible");
        Boolean botonActualizarVisible = null;
        ClienteControlador instance = new ClienteControlador();
        instance.setBotonActualizarVisible(botonActualizarVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBanderaPanelRucVisible method, of class ClienteControlador.
     */
    @Test
    public void testGetBanderaPanelRucVisible() {
        System.out.println("getBanderaPanelRucVisible");
        ClienteControlador instance = new ClienteControlador();
        Boolean expResult = null;
        Boolean result = instance.getBanderaPanelRucVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBanderaPanelRucVisible method, of class ClienteControlador.
     */
    @Test
    public void testSetBanderaPanelRucVisible() {
        System.out.println("setBanderaPanelRucVisible");
        Boolean banderaPanelRucVisible = null;
        ClienteControlador instance = new ClienteControlador();
        instance.setBanderaPanelRucVisible(banderaPanelRucVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }



    /**
     * Test of getUsuario method, of class ClienteControlador.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        ClienteControlador instance = new ClienteControlador();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setUsuario method, of class ClienteControlador.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        ClienteControlador instance = new ClienteControlador();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getCamposHabilitados method, of class ClienteControlador.
     */
    @Test
    public void testGetCamposHabilitados() {
        System.out.println("getCamposHabilitados");
        ClienteControlador instance = new ClienteControlador();
        Boolean expResult = null;
        Boolean result = instance.getCamposHabilitados();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setCamposHabilitados method, of class ClienteControlador.
     */
    @Test
    public void testSetCamposHabilitados() {
        System.out.println("setCamposHabilitados");
        Boolean camposHabilitados = null;
        ClienteControlador instance = new ClienteControlador();
        instance.setCamposHabilitados(camposHabilitados);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
