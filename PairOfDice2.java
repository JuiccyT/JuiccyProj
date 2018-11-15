//*******************************************************************
//  Project: PairOfDice2
//  Author: Corey Ramirez
//  Period: 5
//  Date: 11/15
//  Description: Follows instructions given on west ranch website and works with BoxCars2
//*******************************************************************
public class PairOfDice2 {
    public int die21, die22;   
    int show2;
    public void roll() {
        die21 = (int)(Math.random()*6) + 1;
        die22 = (int)(Math.random()*10) + 1;
    }
    public int getDie21(){return die21;}
    public int getDie22(){return die22;}
    public int getTotal2(){return(die21+die22);}
}