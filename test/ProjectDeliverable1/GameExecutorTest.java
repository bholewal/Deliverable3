/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ProjectDeliverable1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hp
 */
public class GameExecutorTest {
    
    public GameExecutorTest() {
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
     * Test of getCount method, of class GameExecutor.
     */
    @Test
    public void testGetCountGood1() {
        System.out.println("getCount");
        GameExecutor instance = new GameExecutor();
        int expResult = 0;
        int result = instance.getCount();
        assertEquals(expResult, result);
        
    }
    /**
     * Test of getCount method, of class GameExecutor.
     */
    @Test
    public void testGetCountGood2() {
        System.out.println("getCount");
        GameExecutor variable = new GameExecutor();
        int expResult = 0;
        int result = variable.getCount();
        assertEquals(expResult, result);
        
    }
     /**
     * Test of getCount method, of class GameExecutor.
     */
    @Test
    public void testGetCountGood3() {
        System.out.println("getCount");
        GameExecutor variance = new GameExecutor();
        int expResult = 0;
        int result = variance.getCount();
        assertEquals(expResult, result);
        
    }

   

   
    
}
