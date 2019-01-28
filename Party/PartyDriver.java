public class PartyDriver{

   public static void main(String args[]){
   
      Party party = new Party();
      
      party.setMaxGuests(3);
   
      /*System.out.println(party.guestCount());
      System.out.println(party.guestName(1));
      System.out.println(party.guestName(2));
      System.out.println(party.guestName(3));
      party.add("Larry");
      party.add("John");
      party.add("James");
      System.out.println(party.guestCount());
      System.out.println(party.guestName(1));
      System.out.println(party.guestName(2));
      System.out.println(party.guestName(3));
      party.remove("John");
      System.out.println(party.guestCount());
      System.out.println(party.guestName(1));
      System.out.println(party.guestName(2));
      System.out.println(party.guestName(3));*/
      
      party.add("Larry");
      party.add("John");
      party.add("James");
      System.out.println(party.find("Larry"));
      System.out.println(party.find("John"));
      System.out.println(party.find("Mark"));
      System.out.println(party.find("James"));
   }
}