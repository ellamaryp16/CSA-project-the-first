
/**
 * Write a description of class medialab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class medialab
{
 public static double avgRating = (10 + 9 + 9)/3;
 public static int numSongs = 1 + 1 + 1;
 public static double totalCost = 1.0 + 2.33 + 1.0;
 
 public static void main ()
 {
  System.out.println("Welcome to your media library!"); 
  //Song
  Song Song1 = new Song("House of the Rising Sun",1.0,10);
  Song Song2 = new Song("Dance. Dance.", 2.33, 9);
  Song Song3 = new Song("bulletproof heart", 1.0, 9);

  Song1.setTitle("House of the Rising Sun");
  System.out.println(Song1.getTitle());
  System.out.println(Song2.getTitle());
  Song1.setPrice(1.0);
  System.out.println(Song1.getRating());
  System.out.println(Song1.getPrice());
  System.out.println("The average rating is " + avgRating);
  System.out.println("The number of songs is " + numSongs);
  System.out.println(totalCost);
  System.out.println(Song2.getTitle());
  
  //Movie    
  Movie Movie1 = new Movie();
  System.out.println(Movie1);
  Movie1.setTitle("Ponyo");
  System.out.println(Movie1.getTitle());
  Movie1.setPrice(11.9);
  System.out.println(Movie1.getPrice());
  System.out.println(Movie1.displayDuration());
  //Book    
  Book Book1 = new Book();
  System.out.println(Book1);
  Book1.setTitle("Wee Free Men");
  System.out.println(Book1.getTitle());
  Book1.setPrice(5.8);
  System.out.println(Song1.getPrice());
  // 1.2.1
  MediaFile.writeString(Song1.getTitle() + "|" + Song1.getRating());
  MediaFile.writeString(Song2.getTitle() + "|" + Song2.getRating());
  MediaFile.writeString(Song3.getTitle() + "|" + Song3.getRating());
  MediaFile.saveAndClose();
         
  
  
  
}
}

  