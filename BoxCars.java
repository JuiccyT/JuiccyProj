//*******************************************************************
//  Project: BoxCars
//  Author: Corey Ramirez
//  Period: 5
//  Date: 11/9
//  Description: Follows rules specified in textbook page 251 problem 4.4
//*******************************************************************
public class BoxCars {
    public static void main (String[]args) {
        final int ROLLS = 1000;
        int boxcars = 0;
        PairOfDice dice = new PairOfDice();        
        for (int i = 0; i < ROLLS; i++) {
            dice.roll();
            if (dice.getTotal() == 12) boxcars++;            
        }
        System.out.println (ROLLS + " total rolls, " + boxcars + " boxcars.");
    }
}