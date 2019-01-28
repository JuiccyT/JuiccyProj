public class Party{

   private int maxGuests;
   private int guestCount;
   String[] names;

   public void setMaxGuests(int max){
      maxGuests = max;
      names = new String[max];
      for (int i = 0; i < max; i++)
         names[i] = "Empty";
   }
   
   public void add(String name){
      names[guestCount] = name;
      guestCount++;
   }
   
   public void remove(String name){
      int count = 0;
      while(!(names[count].equals(name)) && (count < maxGuests -1)){
         count++;
      }
      for (int i = count; i < maxGuests-1; i++){
         names[i] = names[i+1];
      }
      names[maxGuests - 1] = "Empty";
      guestCount--;
   }
   
   public int guestCount(){
      return guestCount;
   }
   
   public String guestName(int index){
      return names[index - 1];
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