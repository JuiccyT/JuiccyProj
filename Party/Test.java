import java.util.Scanner;
import java.util.ArrayList;
public class Test{

   public static void main(String[] args){
      ArrayList<GuestFinal> guestInfo = new ArrayList<GuestFinal>();
      guestInfo.add(new GuestFinal("Daniel","male",20));
      System.out.println("guestInfo: " + guestInfo);
      ArrayList<GuestFinal> newGuests = new ArrayList<GuestFinal>();
      newGuests.add(new GuestFinal("Gavin","male",24));
      System.out.println("newGuests: " + newGuests);
      guestInfo.addAll(newGuests);
      System.out.println("guestInfo + newGuests: " + guestInfo);
      //System.out.println(guestInfo.get(1));
      
   }
}