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
public class GroupOfCardsTest {
    
    public GroupOfCardsTest() {
    }
    private String name="Muskan";
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
     * Test of setName method, of class GroupOfCards.
     */
    @Test
    public void testSetNameGood1() {
        System.out.println("setName");
        String name = "Group4";
        GroupOfCards instance = new GroupOfCards();
        instance.setName(name);
       
    }
     /**
     * Test of setName method, of class GroupOfCards.
     */
    @Test
    public void testSetNameGood2() {
        System.out.println("setName");
        String name = "Group5";
        GroupOfCards instance = new GroupOfCards();
        instance.setName(name);
       
    }
    /**
     * Test of setName method, of class GroupOfCards.
     */
    @Test
    public void testSetNameGood3() {
        System.out.println("setName");
        String name = "Group6";
        GroupOfCards instance = new GroupOfCards();
        instance.setName(name);
       
    }

  
    
}
