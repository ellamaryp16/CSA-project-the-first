
/**
 * Write a description of class Song here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Song
{
    // instance variables - replace the example below with your own
  private int rating;
  private double price;
  private String title;
   public Song ()
   {
     rating = 10;
     title="House of the Rising Sun";
     price = 1.0;
   }   
   public String getTitle() {
     return title;     
   }
        public void setTitle(String t) {
     title = t;
   }
   public double getprice() {
     return price;
   }
   public void setprice(double j) {
     price = j;
   }
    
}
 





