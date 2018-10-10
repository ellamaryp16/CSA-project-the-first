
/**
 * Write a description of class Book here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Book extends Media
{
  private int rating;
  private String title;
  private double price;
   public Book()
   {
    rating = 10;
     title = "Wee Free Men";
     price = 5.8;
 }
   public String getTitle() 
   {  
     return title;          
   }
   public void setTitle(String t) 
   {
     title = t;
   }
   public double getprice ()
   {
     return price;
   }
   public void setprice (double j)
   {
     price = j;
   }
   public int getRating()
   {
     return rating;
   }
   public void setRating (int r)
   {
     rating = r;
   }
} 


