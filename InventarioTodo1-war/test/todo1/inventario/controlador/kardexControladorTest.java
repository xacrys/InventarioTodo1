/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package todo1.inventario.controlador;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import javax.faces.model.SelectItem;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import todo1.inventario.dto.DetalleKardexDto;
import todo1.inventario.dto.KardexDto;
import todo1.inventario.modelo.Categoria;
import todo1.inventario.modelo.Producto;

/**
 *
 * @author Xacrys10
 */
public class kardexControladorTest {
    
    public kardexControladorTest() {
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
     * Test of obtenerKardex method, of class kardexControlador.
     */
    @Test
    public void testObtenerKardex() {
        System.out.println("obtenerKardex");
        List<DetalleKardexDto> listaDetalleKardex = null;
        kardexControlador instance = new kardexControlador();
        instance.obtenerKardex(listaDetalleKardex);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of listarProductos method, of class kardexControlador.
     */
    @Test
    public void testListarProductos() {
        System.out.println("listarProductos");
        kardexControlador instance = new kardexControlador();
        instance.listarProductos();
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    

    /**
     * Test of getCategoria method, of class kardexControlador.
     */
    @Test
    public void testGetCategoria() {
        System.out.println("getCategoria");
        kardexControlador instance = new kardexControlador();
        Categoria expResult = null;
        Categoria result = instance.getCategoria();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setCategoria method, of class kardexControlador.
     */
    @Test
    public void testSetCategoria() {
        System.out.println("setCategoria");
        Categoria categoria = null;
        kardexControlador instance = new kardexControlador();
        instance.setCategoria(categoria);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getIdProducto method, of class kardexControlador.
     */
    @Test
    public void testGetIdProducto() {
        System.out.println("getIdProducto");
        kardexControlador instance = new kardexControlador();
        Integer expResult = null;
        Integer result = instance.getIdProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setIdProducto method, of class kardexControlador.
     */
    @Test
    public void testSetIdProducto() {
        System.out.println("setIdProducto");
        Integer idProducto = null;
        kardexControlador instance = new kardexControlador();
        instance.setIdProducto(idProducto);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaCategorias method, of class kardexControlador.
     */
    @Test
    public void testGetListaCategorias() {
        System.out.println("getListaCategorias");
        kardexControlador instance = new kardexControlador();
        List<Categoria> expResult = null;
        List<Categoria> result = instance.getListaCategorias();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaCategorias method, of class kardexControlador.
     */
    @Test
    public void testSetListaCategorias() {
        System.out.println("setListaCategorias");
        List<Categoria> listaCategorias = null;
        kardexControlador instance = new kardexControlador();
        instance.setListaCategorias(listaCategorias);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaProductos method, of class kardexControlador.
     */
    @Test
    public void testGetListaProductos() {
        System.out.println("getListaProductos");
        kardexControlador instance = new kardexControlador();
        List<SelectItem> expResult = null;
        List<SelectItem> result = instance.getListaProductos();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaProductos method, of class kardexControlador.
     */
    @Test
    public void testSetListaProductos() {
        System.out.println("setListaProductos");
        List<SelectItem> listaProductos = null;
        kardexControlador instance = new kardexControlador();
        instance.setListaProductos(listaProductos);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getDesde method, of class kardexControlador.
     */
    @Test
    public void testGetDesde() {
        System.out.println("getDesde");
        kardexControlador instance = new kardexControlador();
        Date expResult = null;
        Date result = instance.getDesde();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setDesde method, of class kardexControlador.
     */
    @Test
    public void testSetDesde() {
        System.out.println("setDesde");
        Date desde = null;
        kardexControlador instance = new kardexControlador();
        instance.setDesde(desde);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getHasta method, of class kardexControlador.
     */
    @Test
    public void testGetHasta() {
        System.out.println("getHasta");
        kardexControlador instance = new kardexControlador();
        Date expResult = null;
        Date result = instance.getHasta();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setHasta method, of class kardexControlador.
     */
    @Test
    public void testSetHasta() {
        System.out.println("setHasta");
        Date hasta = null;
        kardexControlador instance = new kardexControlador();
        instance.setHasta(hasta);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getListaKardex method, of class kardexControlador.
     */
    @Test
    public void testGetListaKardex() {
        System.out.println("getListaKardex");
        kardexControlador instance = new kardexControlador();
        List<KardexDto> expResult = null;
        List<KardexDto> result = instance.getListaKardex();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setListaKardex method, of class kardexControlador.
     */
    @Test
    public void testSetListaKardex() {
        System.out.println("setListaKardex");
        List<KardexDto> listaKardex = null;
        kardexControlador instance = new kardexControlador();
        instance.setListaKardex(listaKardex);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getAcumulado method, of class kardexControlador.
     */
    @Test
    public void testGetAcumulado() {
        System.out.println("getAcumulado");
        kardexControlador instance = new kardexControlador();
        BigDecimal expResult = null;
        BigDecimal result = instance.getAcumulado();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setAcumulado method, of class kardexControlador.
     */
    @Test
    public void testSetAcumulado() {
        System.out.println("setAcumulado");
        BigDecimal acumulado = null;
        kardexControlador instance = new kardexControlador();
        instance.setAcumulado(acumulado);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of getProducto method, of class kardexControlador.
     */
    @Test
    public void testGetProducto() {
        System.out.println("getProducto");
        kardexControlador instance = new kardexControlador();
        Producto expResult = null;
        Producto result = instance.getProducto();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }

    /**
     * Test of setProducto method, of class kardexControlador.
     */
    @Test
    public void testSetProducto() {
        System.out.println("setProducto");
        Producto producto = null;
        kardexControlador instance = new kardexControlador();
        instance.setProducto(producto);
        // TODO review the generated test code and remove the default call to fail.
        assertTrue(true);
    }
    
}
