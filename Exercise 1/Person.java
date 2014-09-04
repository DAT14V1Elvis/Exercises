public class Person 
{
   private String forname;
   private String lastname;
   private String number;
   private String email;
   private int age;

	
	
   public Person(String forname, String lastname, String number, String email, int age)
   {
      this.forname = forname;
      this.lastname = lastname;
      this.number = number;
      this.email = email;
      this.age = age;
   }

   public String getForname()
   {
      if(age < 18)
      {
         return forname = "Minor";
      }
      
      else
      {
         return forname;
      }
   	
   }


   public String getLastname()
   {
      return lastname;
   }


   public String getNumber()
   {
      return number;
   }

	
   public String getEmail()
   {
      return email;
   }
	
	
   public int getAge()
   {
      return age;
   }
	
	
	
   public String toString()
   {
      if(age > 40)
      {
         return getForname() + " " + lastname + " " +  number + " " + email + " " + age;
      
      }
      
      else
      {
         return getForname();
      }
   	
   	
   }
	
	
	
}



