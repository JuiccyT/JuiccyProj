public class Guest{

   private int age;
   private String gender;
   private String name;

   public Guest(String nameInput, String genderInput, int ageInput){
      age = ageInput;
      gender = genderInput;
      name = nameInput;
   }

   public String getName(){
      return name;
   }
   
   public String getGender(){
      return gender;
   }
   
   public int getAge(){
      return age;
   }
   
   public String toString(){
      return name + ", " + age + ", " + gender;
   }
}