/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.math.BigDecimal;
import java.util.List;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo1.inventario.dto.DetalleProductoDto;
import todo1.inventario.modelo.Categoria;
import todo1.inventario.modelo.Operacion;
import todo1.inventario.modelo.Producto;
import todo1.inventario.modelo.Usuario;

/**
 *
 * @author Xacrys10
 */
public class CompraControladorTest {
    
    public CompraControladorTest() {
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
     * Test of cambiarModelo method, of class CompraControlador.
     */
    @Test
    public void testCambiarModelo() {
        System.out.println("cambiarModelo");
        CompraControlador instance = new CompraControlador();
        instance.cambiarModelo();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of buscarCliente method, of class CompraControlador.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        CompraControlador instance = new CompraControlador();
        instance.buscarCliente();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }


    /**
     * Test of obtenerMaximo method, of class CompraControlador.
     */
    @Test
    public void testObtenerMaximo() {
        System.out.println("obtenerMaximo");
        CompraControlador instance = new CompraControlador();
        instance.obtenerMaximo();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of agregarDetalle method, of class CompraControlador.
     */
    @Test
    public void testAgregarDetalle() {
        System.out.println("agregarDetalle");
        CompraControlador instance = new CompraControlador();
        instance.agregarDetalle();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of verificarExistencia method, of class CompraControlador.
     */
    @Test
    public void testVerificarExistencia() {
        System.out.println("verificarExistencia");
        Integer idProducto = null;
        List<DetalleProductoDto> listaProductos = null;
        CompraControlador instance = new CompraControlador();
        Boolean expResult = false;
        Boolean result = instance.verificarExistencia(idProducto, listaProductos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of listarProductos method, of class CompraControlador.
     */
    @Test
    public void testListarProductos() {
        System.out.println("listarProductos");
        CompraControlador instance = new CompraControlador();
        instance.listarProductos();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    

    /**
     * Test of eliminarProducto method, of class CompraControlador.
     */
    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        DetalleProductoDto detalleProducto = null;
        CompraControlador instance = new CompraControlador();
        instance.eliminarProducto(detalleProducto);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of actualizarCliente method, of class CompraControlador.
     */
    @Test
    public void testActualizarCliente() {
        System.out.println("actualizarCliente");
        CompraControlador instance = new CompraControlador();
        instance.actualizarCliente();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIdTipoDocumento method, of class CompraControlador.
     */
    @Test
    public void testGetIdTipoDocumento() {
        System.out.println("getIdTipoDocumento");
        CompraControlador instance = new CompraControlador();
        Integer expResult = null;
        Integer result = instance.getIdTipoDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIdTipoDocumento method, of class CompraControlador.
     */
    @Test
    public void testSetIdTipoDocumento() {
        System.out.println("setIdTipoDocumento");
        Integer idTipoDocumento = null;
        CompraControlador instance = new CompraControlador();
        instance.setIdTipoDocumento(idTipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBotonActualizarVisible method, of class CompraControlador.
     */
    @Test
    public void testGetBotonActualizarVisible() {
        System.out.println("getBotonActualizarVisible");
        CompraControlador instance = new CompraControlador();
        Boolean expResult = null;
        Boolean result = instance.getBotonActualizarVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBotonActualizarVisible method, of class CompraControlador.
     */
    @Test
    public void testSetBotonActualizarVisible() {
        System.out.println("setBotonActualizarVisible");
        Boolean botonActualizarVisible = null;
        CompraControlador instance = new CompraControlador();
        instance.setBotonActualizarVisible(botonActualizarVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getBanderaPanelRucVisible method, of class CompraControlador.
     */
    @Test
    public void testGetBanderaPanelRucVisible() {
        System.out.println("getBanderaPanelRucVisible");
        CompraControlador instance = new CompraControlador();
        Boolean expResult = null;
        Boolean result = instance.getBanderaPanelRucVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setBanderaPanelRucVisible method, of class CompraControlador.
     */
    @Test
    public void testSetBanderaPanelRucVisible() {
        System.out.println("setBanderaPanelRucVisible");
        Boolean banderaPanelRucVisible = null;
        CompraControlador instance = new CompraControlador();
        instance.setBanderaPanelRucVisible(banderaPanelRucVisible);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    

    /**
     * Test of setMascaraNumDocumento method, of class CompraControlador.
     */
    @Test
    public void testSetMascaraNumDocumento() {
        System.out.println("setMascaraNumDocumento");
        String mascaraNumDocumento = "";
        CompraControlador instance = new CompraControlador();
        instance.setMascaraNumDocumento(mascaraNumDocumento);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getUsuario method, of class CompraControlador.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        CompraControlador instance = new CompraControlador();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setUsuario method, of class CompraControlador.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        CompraControlador instance = new CompraControlador();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getCategoria method, of class CompraControlador.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        CompraControlador instance = new CompraControlador();
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setCategoria method, of class CompraControlador.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria categoria = null;
        CompraControlador instance = new CompraControlador();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaCategorias method, of class CompraControlador.
     */
    @Test
    public void testGetListaCategorias() {
        System.out.println("getListaCategorias");
        CompraControlador instance = new CompraControlador();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.getListaCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaCategorias method, of class CompraControlador.
     */
    @Test
    public void testSetListaCategorias() {
        System.out.println("setListaCategorias");
        List<Categoria> listaCategorias = null;
        CompraControlador instance = new CompraControlador();
        instance.setListaCategorias(listaCategorias);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getProducto method, of class CompraControlador.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        CompraControlador instance = new CompraControlador();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getCantidad method, of class CompraControlador.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        CompraControlador instance = new CompraControlador();
        Integer expResult = null;
        Integer result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setProducto method, of class CompraControlador.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        CompraControlador instance = new CompraControlador();
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setCantidad method, of class CompraControlador.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        Integer cantidad = null;
        CompraControlador instance = new CompraControlador();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getMaximoStock method, of class CompraControlador.
     */
    @Test
    public void testGetMaximoStock() {
        System.out.println("getMaximoStock");
        CompraControlador instance = new CompraControlador();
        Integer expResult = null;
        Integer result = instance.getMaximoStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setMaximoStock method, of class CompraControlador.
     */
    @Test
    public void testSetMaximoStock() {
        System.out.println("setMaximoStock");
        Integer maximoStock = null;
        CompraControlador instance = new CompraControlador();
        instance.setMaximoStock(maximoStock);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIdProducto method, of class CompraControlador.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        CompraControlador instance = new CompraControlador();
        Integer expResult = null;
        Integer result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIdProducto method, of class CompraControlador.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        Integer idProducto = null;
        CompraControlador instance = new CompraControlador();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaProductos method, of class CompraControlador.
     */
    @Test
    public void testGetListaProductos() {
        System.out.println("getListaProductos");
        CompraControlador instance = new CompraControlador();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getListaProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaProductos method, of class CompraControlador.
     */
    @Test
    public void testSetListaProductos() {
        System.out.println("setListaProductos");
        List<SelectItem> listaProductos = null;
        CompraControlador instance = new CompraControlador();
        instance.setListaProductos(listaProductos);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getOperacion method, of class CompraControlador.
     */
    @Test
    public void testGetOperacion() {
        System.out.println("getOperacion");
        CompraControlador instance = new CompraControlador();
        Operacion expResult = null;
        Operacion result = instance.getOperacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setOperacion method, of class CompraControlador.
     */
    @Test
    public void testSetOperacion() {
        System.out.println("setOperacion");
        Operacion operacion = null;
        CompraControlador instance = new CompraControlador();
        instance.setOperacion(operacion);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaDetalles method, of class CompraControlador.
     */
    @Test
    public void testGetListaDetalles() {
        System.out.println("getListaDetalles");
        CompraControlador instance = new CompraControlador();
        List<DetalleProductoDto> expResult = null;
        List<DetalleProductoDto> result = instance.getListaDetalles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaDetalles method, of class CompraControlador.
     */
    @Test
    public void testSetListaDetalles() {
        System.out.println("setListaDetalles");
        List<DetalleProductoDto> listaDetalles = null;
        CompraControlador instance = new CompraControlador();
        instance.setListaDetalles(listaDetalles);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getSubtotal method, of class CompraControlador.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        CompraControlador instance = new CompraControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getSubtotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setSubtotal method, of class CompraControlador.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        BigDecimal subtotal = null;
        CompraControlador instance = new CompraControlador();
        instance.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIva method, of class CompraControlador.
     */
    @Test
    public void testGetIva() {
        System.out.println("getIva");
        CompraControlador instance = new CompraControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIva method, of class CompraControlador.
     */
    @Test
    public void testSetIva() {
        System.out.println("setIva");
        BigDecimal iva = null;
        CompraControlador instance = new CompraControlador();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getTotal method, of class CompraControlador.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        CompraControlador instance = new CompraControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setTotal method, of class CompraControlador.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        BigDecimal total = null;
        CompraControlador instance = new CompraControlador();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
