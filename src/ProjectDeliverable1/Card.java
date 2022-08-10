package ProjectDeliverable1;
/**
 * Starter code for the Card class.
 * 
 * @author Muskan Bholewalia
 * @author Bipandeep Kaur
 * @author Daljeet Kaur
 * @author Yuvraj Singh Riar
 */
public class Card extends AbstractCard {

   

   

    
  
        public enum Suit {SPADE,CLUBS,DIAMONDS,HEARTS};
        public enum Value{ONE,TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE,TEN,JACK,QUEEN,KING};
        private final Suit suit;
        private final Value value;
        private String NoOfPlayers;
        public Card(Suit s, Value gVal)
        {
           suit =s;
           value= gVal;
        }
      
     
    
	public Value getValue() {
		return this.value;
	}
        

	
	public Suit getSuit() {
		return this.suit;
        }
        @Override
        public String toString()
        { 
          return this.NoOfPlayers="2";
        }
 
   
  
    
    
  
   
}