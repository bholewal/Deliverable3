/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectDeliverable1;

import java.util.ArrayList;

/**
 *
 * @author Hp
 */
public class QuizPart {
    public void play(){
  
        GroupOfCards CardObject=new GroupOfCards();
                          ArrayList<String> list=new ArrayList();
                ArrayList<String> list2=new ArrayList();
                list.add("How many cards are there in deck?");
                list.add("Which country invented the Cards Game?");
                list.add("There are four card type three of them as follow: Clubs,Hearts,Diamonds and the fourth one is?");
                list2.add("52");
                list2.add("China");
                list2.add("Spades");
                int Random= (int) (Math.random() * 3);
                System.out.println("Lets begin with refereshment knowledge test. Any of the two players can play this kwnowledge testing game");
                System.out.println("Answer the following answer to play the game. Please answer it by capitalize each word");
                System.out.println(list.get(Random));
                String password=CardObject.sc.next();
                if(Random==0)
                {
                    if(password.equals(list2.get(0)))
                    {
                        System.out.println("You guessed it right.");
                        
                    }
                    else
                    {
                        System.out.println("Better luck next time The correct answer is "+list2.get(0));
                       
                    }
                }
                 if(Random==1)
                {
                    if(password.equals(list2.get(1)))
                    {
                        System.out.println("You guessed it right");
                    }
                    else
                    {
                        System.out.println("Better luck next time. The correct answer is"+list2.get(1));
                    }
                }
                  if(Random==2)
                {
                    if(password.equals(list2.get(2)))
                    {
                        System.out.println("You guessed it right");
                    }
                    else
                    {
                        System.out.println("Better luck next time. The correct answer is "+list2.get(2));
                    }
     
                }
    }
}
