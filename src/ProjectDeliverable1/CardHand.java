package ProjectDeliverable1;

import ProjectDeliverable1.Card.Suit;
import ProjectDeliverable1.Card.Value;
import java.util.ArrayList;
import java.util.Random;
import java.util.*;



/**
 * a class that models the Card Hand.
 * @author Muskan Bholewalia
 * @author Bipandeep Kaur
 * @author Daljeet Kaur
 * @author Yuvraj Singh Riar
 *
 */

public class CardHand  extends Game{
     private static   int  count;
  
    public CardHand()
    {    
    }
     //   Card[] hand=new Card[7];
        Value values[]=Card.Value.values();
        Suit suits[]=Card.Suit.values();
    /*
       
    So instead of writing handSize=52; we can make it more "loosely coupled". becuase if we make changes in the "Card class" by 
    adding one more card suit or value, then we have to make changes in this class also. In that way they would be "tightly Coupled" but by
    changing the code, now the handsize is independent of the changes we made in the "Card Class" 
     */
    private int handSize = values.length*suits.length;
    /*
     
    It can hold upto 52 objects in it but after making it loosely coupled, its size could be changed automatically
    when we make changes in the "Suit" Or "Value" enums placed in "Card" class.
    */  
      
       public int getCount()
       {  Scanner sc = new Scanner(System.in);

    
       
        this.count=sc.nextInt();
           return this.count;
       }
	public Card[] cards = new Card[handSize];
        public ArrayList <Card> cards2=new ArrayList();

	
        /**
         *
         * Both the methods discussed below are  used to generate a array(cards) of objects holding deck of card with specific length.It could be 60, more or less than that
         * by taking values of the two enums specified in the "Card" class.
         * Two enums that are used:
         * Suit
         * Value
         * Their design principle is to make it highly cohesive. Now They are serving only one purpose which is to create a array. They are not even giving any output or 
         * not even asking for any input.
         * 
         */
        @Override
        public void generateHand()
                
        {   System.out.println("*************************");
            System.out.println("Choose the Card from 1-13 number");
             System.out.println("*************************");
             for(Card.Value v: Card.Value.values())
                  { 
                   
                   System.out.println(v);
                  
                  }
             System.out.println("*************************");
             System.out.println("Choose the Suit number");
             System.out.println("*************************");
                int i=0;
              for(Card.Suit v: Card.Suit.values())
                 {  
                     
                   i++;
                   System.out.println("Select: "+i+"for"+v);
                     
                  }
        }    
        
        @Override
        public void shuffle() // generating randomlist
        {  try
        {
            int number=getCount();
        
            for(int i=0;i<count;i++){
            /**
             Here instead of writing just number, we are making it loosely coupled by writing "values.length" and "suits.length"
             **/
            int pick =new Random().nextInt(values.length);
            int pick2 =new Random().nextInt(suits.length);
           
            Value m=values[pick];
            Suit  n=suits[pick2];
            cards2.add(new Card(n,m));
            }
        }
            catch(NumberFormatException e)
                    {
                    System.out.println("Please enter a numeric value");
                    }
            }
        
    @Override
            public String declareWinner(int increment, int increment2)
            {
                if(increment>increment2)
            {
                return "Player1Wins";
            }
            else if(increment2>increment)
            {
                return "Player2Wins";
            }
            else if(increment2==increment)
            {
                return"Nobody wins as either they didn't find any or same match with the aforementioned luckyHand card or the cards were not unique";
            }
                else
            {
                return "No Valid inputs";
            }
            
            }
        }

