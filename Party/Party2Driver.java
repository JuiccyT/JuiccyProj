public class Party2Driver{

   public static void main(String args[]){
   
      Party2 party = new Party2();
      
      party.setMaxGuests(10);
   
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
      System.out.println(party.guestName(3));
      
      party.add("Larry");
      party.add("John");
      party.add("James");
      System.out.println(party.find("Larry"));
      System.out.println(party.find("John"));
      System.out.println(party.find("Mark"));
      System.out.println(party.find("James"));*/
      
      party.add("Dan",18,"female");
      party.add("Larry",18,"male");
      party.add("Bob",35,"male");
      party.add("Rob",32,"male");
      party.add("Mike",32,"male");
      party.add("Charlie",32,"male");
      party.add("Leslie",32,"female");
   
   
   //   party.guestInfo(2);
   
   }
}