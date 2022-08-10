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
public class CardHandTest {
    
    public CardHandTest() {
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
     * Test of generateHand method, of class CardHand.
     */
    @Test
    public void testGenerateHand() {
        System.out.println("generateHand");
        CardHand instance = new CardHand();
        instance.generateHand();
       
    }

   

    /**
     * Test of declareWinner method, of class CardHand.
     */
    @Test
    public void testDeclareWinnerGood() {
        System.out.println("declareWinner");
        int increment = 1;
        int increment2 = 2;
        CardHand instance = new CardHand();
        String expResult = "Player2Wins";
        String result = instance.declareWinner(increment, increment2);
        assertEquals(expResult, result);
      
    }
    /**
     * Test of declareWinner method, of class CardHand.
     */
    @Test
    public void testDeclareWinnerBad() {
        System.out.println("declareWinner");
        int increment = 0;
        int increment2 = 0;
        CardHand instance = new CardHand();
        String expResult = "Nobody wins as either they didn't find any or same match with the aforementioned luckyHand card or the cards were not unique";
        String result = instance.declareWinner(increment, increment2);
        assertEquals(expResult, result);
      
    }
    /**
     * Test of declareWinner method, of class CardHand.
     */
    @Test
    public void testDeclareWinnerBoundary() {
        System.out.println("declareWinner");
        int increment = 2;
        int increment2 = 2;
        CardHand instance = new CardHand();
        String expResult = "Nobody wins as either they didn't find any or same match with the aforementioned luckyHand card or the cards were not unique";
        String result = instance.declareWinner(increment, increment2);
        assertEquals(expResult, result);
      
    }
    
}
