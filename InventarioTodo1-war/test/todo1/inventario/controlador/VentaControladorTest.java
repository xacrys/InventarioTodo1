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
public class VentaControladorTest {
    
    public VentaControladorTest() {
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
     * Test of inicio method, of class VentaControlador.
     */
    @Test
    public void testInicio() {
        System.out.println("inicio");
        VentaControlador instance = new VentaControlador();
        instance.inicio();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of cambiarModelo method, of class VentaControlador.
     */
    @Test
    public void testCambiarModelo() {
        System.out.println("cambiarModelo");
        VentaControlador instance = new VentaControlador();
        instance.cambiarModelo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of buscarCliente method, of class VentaControlador.
     */
    @Test
    public void testBuscarCliente() {
        System.out.println("buscarCliente");
        VentaControlador instance = new VentaControlador();
        instance.buscarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of guardarVenta method, of class VentaControlador.
     */
    @Test
    public void testGuardarVenta() {
        System.out.println("guardarVenta");
        VentaControlador instance = new VentaControlador();
        instance.guardarVenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of obtenerMaximo method, of class VentaControlador.
     */
    @Test
    public void testObtenerMaximo() {
        System.out.println("obtenerMaximo");
        VentaControlador instance = new VentaControlador();
        instance.obtenerMaximo();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarDetalle method, of class VentaControlador.
     */
    @Test
    public void testAgregarDetalle() {
        System.out.println("agregarDetalle");
        VentaControlador instance = new VentaControlador();
        instance.agregarDetalle();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verificarExistencia method, of class VentaControlador.
     */
    @Test
    public void testVerificarExistencia() {
        System.out.println("verificarExistencia");
        Integer idProducto = null;
        List<DetalleProductoDto> listaProductos = null;
        VentaControlador instance = new VentaControlador();
        Boolean expResult = null;
        Boolean result = instance.verificarExistencia(idProducto, listaProductos);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of listarProductos method, of class VentaControlador.
     */
    @Test
    public void testListarProductos() {
        System.out.println("listarProductos");
        VentaControlador instance = new VentaControlador();
        instance.listarProductos();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of limpiarVenta method, of class VentaControlador.
     */
    @Test
    public void testLimpiarVenta() {
        System.out.println("limpiarVenta");
        VentaControlador instance = new VentaControlador();
        instance.limpiarVenta();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of eliminarProducto method, of class VentaControlador.
     */
    @Test
    public void testEliminarProducto() {
        System.out.println("eliminarProducto");
        DetalleProductoDto detalleProducto = null;
        VentaControlador instance = new VentaControlador();
        instance.eliminarProducto(detalleProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of actualizarCliente method, of class VentaControlador.
     */
    @Test
    public void testActualizarCliente() {
        System.out.println("actualizarCliente");
        VentaControlador instance = new VentaControlador();
        instance.actualizarCliente();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdTipoDocumento method, of class VentaControlador.
     */
    @Test
    public void testGetIdTipoDocumento() {
        System.out.println("getIdTipoDocumento");
        VentaControlador instance = new VentaControlador();
        Integer expResult = null;
        Integer result = instance.getIdTipoDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdTipoDocumento method, of class VentaControlador.
     */
    @Test
    public void testSetIdTipoDocumento() {
        System.out.println("setIdTipoDocumento");
        Integer idTipoDocumento = null;
        VentaControlador instance = new VentaControlador();
        instance.setIdTipoDocumento(idTipoDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBotonActualizarVisible method, of class VentaControlador.
     */
    @Test
    public void testGetBotonActualizarVisible() {
        System.out.println("getBotonActualizarVisible");
        VentaControlador instance = new VentaControlador();
        Boolean expResult = null;
        Boolean result = instance.getBotonActualizarVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBotonActualizarVisible method, of class VentaControlador.
     */
    @Test
    public void testSetBotonActualizarVisible() {
        System.out.println("setBotonActualizarVisible");
        Boolean botonActualizarVisible = null;
        VentaControlador instance = new VentaControlador();
        instance.setBotonActualizarVisible(botonActualizarVisible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getBanderaPanelRucVisible method, of class VentaControlador.
     */
    @Test
    public void testGetBanderaPanelRucVisible() {
        System.out.println("getBanderaPanelRucVisible");
        VentaControlador instance = new VentaControlador();
        Boolean expResult = null;
        Boolean result = instance.getBanderaPanelRucVisible();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setBanderaPanelRucVisible method, of class VentaControlador.
     */
    @Test
    public void testSetBanderaPanelRucVisible() {
        System.out.println("setBanderaPanelRucVisible");
        Boolean banderaPanelRucVisible = null;
        VentaControlador instance = new VentaControlador();
        instance.setBanderaPanelRucVisible(banderaPanelRucVisible);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMascaraNumDocumento method, of class VentaControlador.
     */
    @Test
    public void testGetMascaraNumDocumento() {
        System.out.println("getMascaraNumDocumento");
        VentaControlador instance = new VentaControlador();
        String expResult = "";
        String result = instance.getMascaraNumDocumento();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMascaraNumDocumento method, of class VentaControlador.
     */
    @Test
    public void testSetMascaraNumDocumento() {
        System.out.println("setMascaraNumDocumento");
        String mascaraNumDocumento = "";
        VentaControlador instance = new VentaControlador();
        instance.setMascaraNumDocumento(mascaraNumDocumento);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getUsuario method, of class VentaControlador.
     */
    @Test
    public void testGetUsuario() {
        System.out.println("getUsuario");
        VentaControlador instance = new VentaControlador();
        Usuario expResult = null;
        Usuario result = instance.getUsuario();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setUsuario method, of class VentaControlador.
     */
    @Test
    public void testSetUsuario() {
        System.out.println("setUsuario");
        Usuario usuario = null;
        VentaControlador instance = new VentaControlador();
        instance.setUsuario(usuario);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCategoria method, of class VentaControlador.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        VentaControlador instance = new VentaControlador();
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCategoria method, of class VentaControlador.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria categoria = null;
        VentaControlador instance = new VentaControlador();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaCategorias method, of class VentaControlador.
     */
    @Test
    public void testGetListaCategorias() {
        System.out.println("getListaCategorias");
        VentaControlador instance = new VentaControlador();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.getListaCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaCategorias method, of class VentaControlador.
     */
    @Test
    public void testSetListaCategorias() {
        System.out.println("setListaCategorias");
        List<Categoria> listaCategorias = null;
        VentaControlador instance = new VentaControlador();
        instance.setListaCategorias(listaCategorias);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getProducto method, of class VentaControlador.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        VentaControlador instance = new VentaControlador();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getCantidad method, of class VentaControlador.
     */
    @Test
    public void testGetCantidad() {
        System.out.println("getCantidad");
        VentaControlador instance = new VentaControlador();
        Integer expResult = null;
        Integer result = instance.getCantidad();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setProducto method, of class VentaControlador.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        VentaControlador instance = new VentaControlador();
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setCantidad method, of class VentaControlador.
     */
    @Test
    public void testSetCantidad() {
        System.out.println("setCantidad");
        Integer cantidad = null;
        VentaControlador instance = new VentaControlador();
        instance.setCantidad(cantidad);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getMaximoStock method, of class VentaControlador.
     */
    @Test
    public void testGetMaximoStock() {
        System.out.println("getMaximoStock");
        VentaControlador instance = new VentaControlador();
        Integer expResult = null;
        Integer result = instance.getMaximoStock();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setMaximoStock method, of class VentaControlador.
     */
    @Test
    public void testSetMaximoStock() {
        System.out.println("setMaximoStock");
        Integer maximoStock = null;
        VentaControlador instance = new VentaControlador();
        instance.setMaximoStock(maximoStock);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIdProducto method, of class VentaControlador.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        VentaControlador instance = new VentaControlador();
        Integer expResult = null;
        Integer result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIdProducto method, of class VentaControlador.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        Integer idProducto = null;
        VentaControlador instance = new VentaControlador();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaProductos method, of class VentaControlador.
     */
    @Test
    public void testGetListaProductos() {
        System.out.println("getListaProductos");
        VentaControlador instance = new VentaControlador();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getListaProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaProductos method, of class VentaControlador.
     */
    @Test
    public void testSetListaProductos() {
        System.out.println("setListaProductos");
        List<SelectItem> listaProductos = null;
        VentaControlador instance = new VentaControlador();
        instance.setListaProductos(listaProductos);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getOperacion method, of class VentaControlador.
     */
    @Test
    public void testGetOperacion() {
        System.out.println("getOperacion");
        VentaControlador instance = new VentaControlador();
        Operacion expResult = null;
        Operacion result = instance.getOperacion();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setOperacion method, of class VentaControlador.
     */
    @Test
    public void testSetOperacion() {
        System.out.println("setOperacion");
        Operacion operacion = null;
        VentaControlador instance = new VentaControlador();
        instance.setOperacion(operacion);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getListaDetalles method, of class VentaControlador.
     */
    @Test
    public void testGetListaDetalles() {
        System.out.println("getListaDetalles");
        VentaControlador instance = new VentaControlador();
        List<DetalleProductoDto> expResult = null;
        List<DetalleProductoDto> result = instance.getListaDetalles();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setListaDetalles method, of class VentaControlador.
     */
    @Test
    public void testSetListaDetalles() {
        System.out.println("setListaDetalles");
        List<DetalleProductoDto> listaDetalles = null;
        VentaControlador instance = new VentaControlador();
        instance.setListaDetalles(listaDetalles);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getSubtotal method, of class VentaControlador.
     */
    @Test
    public void testGetSubtotal() {
        System.out.println("getSubtotal");
        VentaControlador instance = new VentaControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getSubtotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setSubtotal method, of class VentaControlador.
     */
    @Test
    public void testSetSubtotal() {
        System.out.println("setSubtotal");
        BigDecimal subtotal = null;
        VentaControlador instance = new VentaControlador();
        instance.setSubtotal(subtotal);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getIva method, of class VentaControlador.
     */
    @Test
    public void testGetIva() {
        System.out.println("getIva");
        VentaControlador instance = new VentaControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getIva();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setIva method, of class VentaControlador.
     */
    @Test
    public void testSetIva() {
        System.out.println("setIva");
        BigDecimal iva = null;
        VentaControlador instance = new VentaControlador();
        instance.setIva(iva);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getTotal method, of class VentaControlador.
     */
    @Test
    public void testGetTotal() {
        System.out.println("getTotal");
        VentaControlador instance = new VentaControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getTotal();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setTotal method, of class VentaControlador.
     */
    @Test
    public void testSetTotal() {
        System.out.println("setTotal");
        BigDecimal total = null;
        VentaControlador instance = new VentaControlador();
        instance.setTotal(total);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
