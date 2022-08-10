/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ProjectDeliverable1;

import java.util.Scanner;

/**
 *
 * @author Hp
 */
public class GameExecutor extends Game {
    Game game;
    public GameExecutor(Game game)
    {
       this.game=game; 
    }
    public GameExecutor()
    {
        
    }
     

   
    @Override
    public void generateHand()
    {
        this.game.generateHand();
    }
    
    private int count;
     public int getCount()
       {
           return this.count;
       }

    
    @Override
    public void shuffle()
    {
         this.game.shuffle();
    }
    @Override
    public String declareWinner(int a, int b)
    {
        return this.game.declareWinner(a, b);
    }
}

                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
                 
    
   
    

