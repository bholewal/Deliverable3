package ProjectDeliverable1;

/**
 *
 * @author Muskan Bholewalia
 * @author Bipandeep Kaur
 * @author Daljeet Kaur
 * @author Yuvraj Singh Riar
 */
public abstract class Game {

    /**
     * we did something different here as we have declare the Scanner object
     * here and it can be used  anywhere without declaring it again and again in
     * different classes
     */


    /**
     * Play the game. This method will generate a deck of 52 cards from where
     * user will gonna pick three cards for testing his luck.
     */
    public abstract void generateHand();
    /**
     * This variable is storing the length of randomList
     */
    private int count;

    /**
     * During the game , It will generate a deck of cards of specific length which
     * will be decided by the users.
     */
    public abstract void shuffle();
    public abstract String declareWinner(int a, int b);
   

}
