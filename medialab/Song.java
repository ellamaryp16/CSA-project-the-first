
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
  private boolean favorite;
  private double totalCost = 1.0 + 2.33 + 1.0;
  private int numSongs = 1 + 1 + 1; 
 
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
    public int getRating(){
        return rating;
    }
    public void setRating (int r) {
        rating = r;}
    public void addtoFavorites(){
        favorite = true;
}
public Song(String title, double price){
    this.title = "Dance. Dance.";
    this.price = 2.33;
}
public Song(String title, double price, int rating){
    this.title = "bulletproof heart";
    this.price = 1.0;
    this.rating = 9; 
}
    
}





