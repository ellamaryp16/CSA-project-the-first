
/**
 * Write a description of class medialab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class medialab
{
      public static void main ()
  {
    System.out.println("Welcome to your media library."); 
    
      Song Song1 = new Song();
      System.out.println(Song1);
      Song1.setTitle("House of the Rising Sun");
      System.out.println(Song1.getTitle());
      
      Movie Movie1 = new Movie();
      System.out.println(Movie1);
      Movie1.setTitle("Ponyo");
      System.out.println(Movie1.getTitle());
      
      Book Book1 = new Book();
      System.out.println(Book1);
      Movie1.setTitle("Wee Free Men");
      System.out.println(Book1.getTitle());
      
      
      
      
      
}
 
}
  