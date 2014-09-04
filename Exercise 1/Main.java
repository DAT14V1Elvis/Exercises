import java.util.ArrayList;


public class Main 
{
   public static void main(String[] args)
   {		
      ArrayList<Person> perosnList = new ArrayList<Person>();
   	
      perosnList.add(new Person("Elvis", "Saronjic", "31526355", "Elsar@hotmail.dk", 23));
      perosnList.add(new Person("Martin", "Belling", "26545454", "Belling@ofir.dk", 22));
      perosnList.add(new Person("Bobby", "Olsen", "88888888", "LoL@gmail.com", 41));
      perosnList.add(new Person("Mads", "Madsen", "7777777", "Sen@hotmail.dk", 17));
      perosnList.add(new Person("Peter", "Pan", "99999999", "Fe@ofir.dk", 14));
      perosnList.add(new Person("Morten", "Nielsen", "12457878", "MoNi@gmail.com", 50));
   
      
      for(Person p : perosnList) 
      {
         if(p.getForname() == "Minor")
         {
            perosnList.remove("Minor");    
         }
         else
         {
            System.out.println(p.toString()); 
         }
      }
   	  
   }
}
