import java.util.ArrayList;
public class PartyFinal{

   private ArrayList<GuestFinal> guestInfo = new ArrayList<GuestFinal>();
   private int maxGuests;
   private int guestCount = 0;
   private int minAge;
   private int maxAge;
   private int maleCount;
   private int femaleCount;
      
   public PartyFinal(){
      maxGuests = 10;
      maxAge = 30;
      minAge = 18;
   }
   
   public PartyFinal(int maxGuests, int minAge, int maxAge){
      this.maxGuests = maxGuests;
      this.minAge = minAge;
      this.maxAge = maxAge;
      if(maxGuests % 2 != 0) maxGuests++;
   }
   
   public void add(String nameInput, String genderInput, int ageInput){
      if(ageInput >= minAge && ageInput <= maxAge){
         if(genderInput == "male" || genderInput == "female"){
            if(guestCount < maxGuests){
               if((maleCount - femaleCount < 3 && genderInput.equals("male")) || (femaleCount - maleCount < 3 && genderInput.equals("female"))){
                  guestInfo.add(new GuestFinal(nameInput, genderInput, ageInput));
                  guestCount++;
                  if(genderInput == "male") maleCount++;
                  if(genderInput == "female") femaleCount++;
                  System.out.println(guestInfo.get(guestInfo.size() - 1));
               }
               else System.out.println("Gender count difference cannot be greater than three: " + nameInput);
            }
            else System.out.println("There is no more room for guests: " + nameInput);
         }
         else System.out.println("Incorrect gender input: " + nameInput);
      }
      else System.out.println("Age not within bounds: " + nameInput);
   }
   
   public void add(ArrayList<GuestFinal> newGuests){
      //newGuests.get(i).getGender()
      int count = newGuests.size();
      int boyCount = 0;
      int girlCount = 0;
      boolean meetReq = true;
      for (int i = 0; i < count - 1; i++){
         if(newGuests.get(i).getAge() >= minAge && newGuests.get(i).getAge() <= maxAge){
            if(newGuests.get(i).getGender() == "male" || newGuests.get(i).getGender() == "female"){
               if(guestCount + count <= maxGuests){
                  if((boyCount - girlCount < 3 && newGuests.get(i).getGender().equals("male")) || (girlCount - boyCount < 3 && newGuests.get(i).getGender().equals("female"))){
                     if(newGuests.get(i).getGender() == "male") boyCount++;
                     if(newGuests.get(i).getGender() == "female") girlCount++;
                  }
                  else{
                     System.out.println("Gender count difference cannot be greater than three: " + newGuests.get(i).getName());
                     meetReq = false;
                     break;
                  }
               }
               else{
                  System.out.println("There is no more room for guests: " + newGuests.get(i).getName());
                  meetReq = false;
                  break;
               }
            }
            else{
               System.out.println("Incorrect gender input: " + newGuests.get(i).getName());
               meetReq = false;
               break;
            }
         }
         else{
            System.out.println("Age not within bounds: " + newGuests.get(i).getName());
            meetReq = false;
            break;
         }
      }
      if(meetReq == true){
         System.out.println(meetReq);
         maleCount = maleCount + boyCount;
         femaleCount = femaleCount + girlCount;
         guestCount = guestCount + count;
         guestInfo.addAll(newGuests);
      }
   }
   
   public void remove(String nameInput){
      //guestInfo.get(0).getAge()
      int index = 0;
      while(!(nameInput.equals(guestInfo.get(index).getName())) && index < guestInfo.size() - 1){
         index++;
      }
      if(index == guestInfo.size() - 1 && guestInfo.get(index).getName().equals(nameInput)){
         if (guestInfo.get(index).getGender().equals("male")) maleCount--;
         else femaleCount--;
         guestInfo.remove(index);
         guestCount--;
      }
      else System.out.println("Guest name not found in list");
   }
   
   public void remove(ArrayList<GuestFinal> newGuests){
      //newGuests.get(i).getName()
      ArrayList<Integer> index = new ArrayList<Integer>();
      int count = newGuests.size();
      int boyCount = 0;
      int girlCount = 0;
      boolean meetReq = true;
      for (int i = 0; i < count - 1; i++){
         int index = 0;
         while(!(newGuests.get(i).getName().equals(guestInfo.get(index).getName())) && index < guestInfo.size() - 1){
            index++;
         }
      
      }
   }
   
   public void listGuests(){
      System.out.println(guestInfo);
      System.out.println("guestCount: " + guestCount + ", " + "maleCount: " + maleCount + ", " + "femaleCount: " + femaleCount);
   }
}