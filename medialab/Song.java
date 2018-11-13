
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
   public Song()
   {
     rating = 0;
     title="";
     price = 0.0;
   }   
   public Song(String title, double price){
    this.title = title;
    this.price = price;
   }
   public Song(String title, double price, int rating){
    this.title = title;
    this.price = price;
    this.rating = rating; 
   } 
    
}





