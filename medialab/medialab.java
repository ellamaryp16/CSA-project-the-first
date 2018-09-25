
/**
 * Write a description of class medialab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class medialab
{
 private static double avgRating = (10 + 9 + 9)/3;
 private static int numSongs = 1 + 1 + 1;
 private static double totalCost = 1.0 + 2.33 + 1.0;
 
      public static void main ()
 {
  System.out.println("Welcome to your media library."); 
    
  Song Song1 = new Song();
  System.out.println(Song1);
  Song1.setTitle("House of the Rising Sun");
  System.out.println(Song1.getTitle());
  Song1.setprice(1.0);
  System.out.println(Song1.getprice());
  System.out.println(avgRating);
  System.out.println(numSongs);
  System.out.println(totalCost);
      
      
  Movie Movie1 = new Movie();
      System.out.println(Movie1);
      Movie1.setTitle("Ponyo");
      System.out.println(Movie1.getTitle());
      Movie1.setprice(11.9);
      System.out.println(Movie1.getprice());
      
      Book Book1 = new Book();
      System.out.println(Book1);
      Book1.setTitle("Wee Free Men");
      System.out.println(Book1.getTitle());
      Book1.setprice(5.8);
      System.out.println(Song1.getprice());
      
      
      
      
}
 
}
  