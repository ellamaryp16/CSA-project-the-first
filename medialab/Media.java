
/**
 * Abstract class Media - write a description of the class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public abstract class Media
{
    // instance variables - replace the example below with your own
 public int rating;
 public double price;
 public String title;
  public Media()
  {
   this.rating = rating;
   this.title= title;
   this.price = price;
  }   
  public Media(String title, double price, int rating){
    this.title = title;
    this.price = price;
    this.rating= rating;
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


