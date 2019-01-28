import java.util.ArrayList;
public class Party3{

   private ArrayList<Guest> guestInfo = new ArrayList<Guest>();
   private int maxGuests;
   private int guestCount = 0;
   private int minAge;
   private int maxAge;
   private int maleCount;
   private int femaleCount;
      
   public Party3(){
      maxGuests = 10;
      maxAge = 30;
      minAge = 18;
   }
   
   public Party3(int maxGuests, int minAge, int maxAge){
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
                  guestInfo.add(new Guest(nameInput, genderInput, ageInput));
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
      else System.out.println("Age not between or equal to 18 and 35: " + nameInput);
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
   
   public void listGuests(){
      System.out.println(guestInfo);
      System.out.println("guestCount: " + guestCount + ", " + "maleCount: " + maleCount + ", " + "femaleCount: " + femaleCount);
   }
}