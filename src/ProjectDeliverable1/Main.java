package ProjectDeliverable1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * A class to handle the user interaction for the Card project. Contains a main
 * method that generates a card hand .
 *
 * @author Muskan Bholewalia
 * @author Bipandeep Kaur
 * @author Daljeet Kaur
 * @author Yuvraj Singh Riar
 */
/* In all of the classes we have actually tried to make it loosely coupled and highly cohesive
   we have used ArrayList and enums instead of using just Arrays
   We have tried to  make the users interactions as much as possible by taking values from them
   we have made three abstract classes as mentioned in the base code
   To make it following OOP principles we have tried to use Inheritance ,Abstraction.
   We have even try to make Unique UserName by throwing Exception
   we have met with all the requirements as mentioned in group deliverable 1
  In Total we have used three abstract classes:Game.java,Player.java,AbstractCard.java
           we have used one executable class: Main.java class
           we have used three concrete classes other than Main Class:GroupOfCards.java,Card.java,Cardhand.java
  

 */
public class Main {

    public static void main(String[] args) throws Exception {

        try {
            System.out.println("                    Welcome to the World of luck\n *---------------------************************--------------------");
            System.out.println(" In this game both the players will create a  random deck of specific length altogether as we asked them to prompt in the randomList size.\n Each player will have to choose three cards from the deck of 52 cards.\n The player who got the maximum number of matches with the 'Random deck'will win this luckyHand game"
                    + "\n------------------------*********************--------------------------");
            GroupOfCards CardObject = new GroupOfCards();

            ArrayList<String> nameList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                int n = i + 1;
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the UserName for Player" + n);
                nameList.add(sc.next());

            }
            if (nameList.get(0).equals(nameList.get(1))) {
                throw new UniqueNameException();
            }
            System.out.print("The Game war: ");
            CardObject.setName(nameList.get(0));
            System.out.print(CardObject.getName());
            System.out.print(" Vs ");

            CardObject.setName(nameList.get(1));
            System.out.println(CardObject.getName());
             
        QuizPart quizpart = new QuizPart();
        quizpart.play();
        generateDeck gd = new generateDeck();
        gd.generating();
        }
  catch(UniqueNameException e)
    {
        System.out.println(e.getMessage());
    }
catch(Exception e)
                 {
                     System.out.println("The suit number cannot be greater than 4");
                 }     
    
}



}
                
              
           
               
	

        

