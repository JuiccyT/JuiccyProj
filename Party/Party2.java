public class Party2{

   private int maxGuests;
   private int guestCount;//current amount of guests
   String[] names;
   int[] ages;
   String[] gender;
   boolean lock = true;
   int maleCount = 0;
   int femaleCount = 0;

   public void setMaxGuests(int max){
      if ((max % 2) == 0){
         lock = false;
         maxGuests = max;
         names = new String[max];
         ages = new int[max];
         gender = new String[max];
         for (int i = 0; i < max; i++){
            names[i] = "Empty";
            gender[i] = "Empty"; 
         }
      }
      else System.out.println("Maximum amount of guests must be even");
   }
   
   public void add(String name, int age, String genderInput){
      if (lock == false){
         if(age >= 18 && age <= 35){
            if(genderInput == "male" || genderInput == "female"){
               if(guestCount != maxGuests){
                  if((maleCount - femaleCount < 3 && genderInput.equals("male")) || (femaleCount - maleCount < 3 && genderInput.equals("female"))){
                     names[guestCount] = name;
                     ages[guestCount] = age;
                     gender[guestCount] = genderInput;
                     guestCount++;
                     if(genderInput == "male") maleCount++;
                     if(genderInput == "female") femaleCount++;
                     //System.out.println(name +", " + genderInput + " - " + maleCount + " male, " + femaleCount + " female, ");
                  }
                  else System.out.println("Gender count difference cannot be greater than three: " + name);
               }
               else System.out.println("There is no more room for guests: " + name);
            }
            else System.out.println("Incorrect gender input: " + name);
         }
         else System.out.println("Age not between or equal to 18 and 35: " + name);
      }
   }
   
   public void remove(String name){
      if (lock == false){
         int count = 0;
         while(!(names[count].equals(name)) && (count < maxGuests - 1)){
            count++;
         }
         for (int i = count; i < maxGuests-1; i++){
            names[i] = names[i+1];
            ages[i] = ages[i+1];
            gender[i] = gender[i+1];
         }
         names[maxGuests - 1] = "Empty";
         ages[maxGuests - 1] = 0;
         gender[maxGuests - 1] = "Empty";
         guestCount--;
      }   
   }
   
   public int guestCount(){
      if (lock == false){
         return guestCount;
      }
      else 
         return 0;
   }
   
   public void guestInfo(int index){
      if (lock == false){
         System.out.println("Name: " + names[index - 1] + ", Age: " + ages[index - 1] + ", Gender: " + gender[index - 1]);
      }
   }
   
   public boolean find(String name){
      int count = 0;
      while((count < maxGuests - 1) && !(names[count].equals(name))){
         count++;
      }
      if(count >= maxGuests - 1 && !(names[maxGuests-1].equals(name))) 
         return false;
      else 
         return true; 
   }
}