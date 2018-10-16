
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song extends Media
{
    // instance variables - replace the example below with your own
private int rating;
private double price;
private String title;
private boolean favorite;
   public Song ()
   {
     rating = 10;
     title="House of the Rising Sun";
     price = 1.0;
   }   
   public Song(String title, double price){
    this.title = "Dance. Dance.";
    this.price = 2.33;
    this.rating = 9;
   }
   public Song(String title, double price, int rating){
    this.title = "bulletproof heart";
    this.price = 1.0;
    this.rating = 9; 
   } 
    
}





