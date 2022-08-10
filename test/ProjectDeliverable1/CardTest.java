/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package ProjectDeliverable1;

import ProjectDeliverable1.Card.Suit;
import static ProjectDeliverable1.Card.Suit.SPADE;

import ProjectDeliverable1.Card.Value;
import static ProjectDeliverable1.Card.Value.ONE;
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
public class CardTest {
    
    public CardTest() {
    }
    
    
    /**
     * Test of getValue method, of class Card.
     */
    @Test
    public void testGetValueGood() {
        
        System.out.println("getValue");
       Card instance=new Card(SPADE,ONE);
        Card.Value expResult=Value.ONE;
        Card.Value result = instance.getValue();
        assertEquals(expResult, result);
       
    }
     
    
    

    /**
     * Test of getSuit method, of class Card.
     */
    @Test
    public void testGetSuitGood() {
        System.out.println("getSuit");
        Card instance = new Card(SPADE,ONE);
        Card.Suit expResult = Suit.SPADE;
        Card.Suit result = instance.getSuit();
        assertEquals(expResult, result);
       
    }

    
    
}
