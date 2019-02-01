import java.util.ArrayList;
public class PartyFinalDriver{
   public static void main(String args[]){
   
      PartyFinal party = new PartyFinal(6,18,25);
   
      ArrayList<GuestFinal> newGuests = new ArrayList<GuestFinal>();
      newGuests.add(new GuestFinal("Gavin","male",24));
      newGuests.add(new GuestFinal("Daniel1","male",23));
      newGuests.add(new GuestFinal("Daniel2","male",23));
      newGuests.add(new GuestFinal("Daniel3","male",23));
      newGuests.add(new GuestFinal("Daniel4","male",23));
      System.out.println(newGuests);
      party.add(newGuests);
      party.listGuests();
      
   
   
   }
}