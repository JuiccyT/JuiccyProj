//*******************************************************************
//  Project: BoxCars2
//  Author: Corey Ramirez
//  Period: 5
//  Date: 11/15
//  Description: Follows instructions given on west ranch website
//*******************************************************************
public class BoxCars2 {
    public static void main (String[]args) {
        final int ROLLS = 1000;
        int boxcars = 0;
        PairOfDice2 dice = new PairOfDice2();        
        for (int i = 0; i < ROLLS; i++) {
            dice.roll();
            if (dice.getDie21() == 6 && dice.getDie22() == 6) boxcars++;            
        }
        System.out.println (ROLLS + " total rolls, " + boxcars + " boxcars.");
    }
}