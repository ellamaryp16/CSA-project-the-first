
/**
 * Abstract class Media - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Media
{
    // instance variables - replace the example below with your own
    private int rating;
    private double price;
    private String title;
    private boolean favorite;
  
   public Media ()
   {
     rating = 10;
     title="House of the Rising Sun";
     price = 1.0;
     rating = 10;
     title = "Wee Free Men";
     price = 5.8;
   }   
   public String getTitle() {
     return title;     
   }

   public double getprice() {
     return price;
   }

   public int getRating(){
        return rating;
    }
   public void setsong (int r, double j,String t) {
        rating = r;
        price = j;
        title = t;
    }
    public void addtoFavorites(){
        favorite = true;
    }
    public Media(String title, double price){
    this.title = "Dance. Dance.";
    this.price = 2.33;
    this.rating = 9;
}
    public Media(String title, double price, int rating){
    this.title = "bulletproof heart";
    this.price = 1.0;
    this.rating = 9; 
}
 
   public String getBookTitle() 
   {  
     return title;
     
   }
   public double getBookPrice ()
   {
     return price;
   }
   public int getBookRating()
   {
     return rating;
   }
   public void setBook(String t,double j, int r) 
   {
     title = t;
     price = j;
     rating = r;
   }
}


