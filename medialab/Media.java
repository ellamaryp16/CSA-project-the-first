
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
   this.rating = 0;
   this.title="Untitled";
   this.price = 0;
  }   
  public String getTitle() 
  {  
   return title; 
  }
  public double getPrice()
  {
   return price;
  }
  public int getRating()
  {
   return rating;
  }
 public void setPrice( double j) 
  { 
   price = j;
  }
   public void setRating (int r) 
  { 
   rating = r;
}
 public void setTitle (String t) 
  { 
   title = t;
  }
}


