/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import logicaProvedor.Menus;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Usuario
 */
public class MenusTest {
    
    public MenusTest() {
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
     * Test of verMenu method, of class Menus.
     */
    @Test
    public void testVerMenu_int() {
        System.out.println("verMenu");
        int semana = 0;
        Menus instance = new Menus();
        String expResult = "";
        String result = instance.verMenu(semana);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of verMenu method, of class Menus.
     */
    @Test
    public void testVerMenu_0args() {
        System.out.println("verMenu");
        Menus instance = new Menus();
        String expResult = "";
        String result = instance.verMenu();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of agregarMenu method, of class Menus.
     */
    @Test
    public void testAgregarMenu() {
        System.out.println("agregarMenu");
        String lunes = "";
        String martes = "";
        String miercoles = "";
        String jueves = "";
        String viernes = "";
        Menus instance = new Menus();
        boolean expResult = false;
        boolean result = instance.agregarMenu(lunes, martes, miercoles, jueves, viernes);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
