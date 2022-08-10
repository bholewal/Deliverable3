/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectDeliverable1;

/**
 *
 * @author Hp
 */
public class generateDeck {
    public void generating(){
     System.out.println("Now lets come to the game of luck");
                System.out.println("Please Enter the number of cards you want to be in a deck of random Card");
            
		CardHand ch = new CardHand();
                GameExecutor executor=new GameExecutor(ch);
                GroupOfCards h=new GroupOfCards();
               
                executor.shuffle();
                System.out.println("----------------------***********---------");
                System.out.println("The UNO deck contains the following cards");
                executor.generateHand();
                
                          
                
                
                System.out.println("--------***********---------");
                System.out.println("Choose any of the card listed above");
                h.play();
           
               
                 System.out.println("The LuckyHand deck contains the following cards");

                 for(Card c: ch.cards2)
                {
                   System.out.println(c.getValue() + " of " + c.getSuit()+ ",");
                }
                 System.out.println("---------------------*******************---------");
           
       int increment=0;
        for( Card RandomNumber:ch.cards2)
        {    
            for(Card c:h.player1)
            if(c.getValue()==RandomNumber.getValue() && c.getSuit().equals (((RandomNumber.getSuit()).toString())))
            {
                increment++;
                
               
            }
        }
           int increment2=0;
          for( Card RandomNumber2:ch.cards2)
        {    
            for(Card c:h.player2)
            {
            if(c.getValue()==RandomNumber2.getValue() && c.getSuit().equals (((RandomNumber2.getSuit()).toString())))
            {
                increment2++;
                
            }
            }
        } 
            System.out.println("The Player 1 cards' are:");
           for (String str : h.print1)
	      { 	      
	           System.out.println(str); 		
	      }
               System.out.println("The Player 2 cards' are:");
           for (String str : h.print2)
	      { 	      
	           System.out.println(str); 		
	      }
         
          
          System.out.println(executor.declareWinner(increment,increment2));
                 }
}

