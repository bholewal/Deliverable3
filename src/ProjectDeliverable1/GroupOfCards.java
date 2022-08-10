package ProjectDeliverable1;

import java.util.ArrayList;
import java.util.Scanner;


/**
 * A concrete class that represents any grouping of cards for a Game. Here group
 * of cards are actually represent by Player1 and Player2 methods. These both
 * methods generate a group of cards and store their value in ArrayList
 *
 * @author Muskan Bholewalia
 * @author Bipandeep Kaur
 * @author Daljeet Kaur
 * @author Yuvraj Singh Riar
 */
public class GroupOfCards extends Player {

    Card.Value values[] = Card.Value.values();
    Card.Suit suits[] = Card.Suit.values();
    //The group of cards, stored in an ArrayList
    private String name;
    public ArrayList<Card> player1 = new ArrayList();

    public ArrayList<Card> player2 = new ArrayList();
    public ArrayList<String> print1 = new ArrayList();
    public ArrayList<String> print2 = new ArrayList();

    Scanner sc = new Scanner(System.in);

    /**
     * here we have created a Play method, this method enhance the OOP principle
     * as it just storing the values in ArrayList, nothing else. it is making
     * the cohesion high.
     *
     */
    public void play() {
        try {
            System.out.println("Enter the Player 1 card Details.");
            for (int a = 0; a < 2; a++) {
                for (int i = 1; i <= 3; i++) {
                    if (a == 0) {

                        System.out.println("Enter the Card Number " + i + " attempt :");
                        int pick = sc.nextInt();
                        System.out.println("Enter the Suit Number");
                        int pick2 = sc.nextInt();
                        Card.Value m1 = values[pick - 1];
                        Card.Suit n1 = suits[pick2 - 1];
                        System.out.println("The Card is " + m1 + " of " + n1);
                        print1.add("The Card is " + m1 + " of " + n1);
                        Card c = new Card(n1, m1);
                        player1.add(c);

                    } else {

                        System.out.println("--------------**************-------------");
                        System.out.println("Now its turn for player 2");
                        System.out.println("--------------**************-------------");

                        System.out.println("Enter the Player 2 card Details.");
                        System.out.println("Enter the Card Number  " + i + " attempt :");
                        int pick = sc.nextInt();
                        System.out.println("Enter the Suit Number");
                        int pick2 = sc.nextInt();

                        Card.Value m2 = values[pick - 1];
                        Card.Suit n2 = suits[pick2 - 1];

                        System.out.println("The Card is " + m2 + " of " + n2);
                        print2.add("The Card is " + m2 + " of " + n2);

                        player2.add(new Card(n2, m2));
                    }

                }
                for (int e = 0; e <= 2; e++) {
                    for (int b = 0; b <= 1; b++) {
                        if (player1.get(b).getSuit() == player1.get(b + 1).getSuit() && player1.get(b).getValue() == player1.get(b + 1).getValue()) {
                            throw new UniqueCard();

                        }

                    }
                }

            }
            for (int e = 0; e <= 2; e++) {
                for (int b = 0; b <= 1; b++) {

                    if (player2.get(b).getSuit() == player2.get(b + 1).getSuit() && player2.get(b).getValue() == player2.get(b + 1).getValue()) {
                        
                        throw new UniqueCard();
                       
                    } else if (player1.get(b).getSuit() == player2.get(b).getSuit() && player1.get(b).getValue() == player2.get(b).getValue()) {
                        throw new UniqueCard();
                    }

                }
            }

        } catch (UniqueCard e) {
            System.err.println(e.getMessage());

        }
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return this.name;
    }

}
