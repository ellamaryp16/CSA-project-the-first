

/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Movie
{
 private int rating;
 private String title;
 private double price;
 private boolean favorite;
 private int duration = 100;
 private int time;   
  public Movie()
  {
    rating = 10;
    title = "Ponyo";
    price = 11.9;
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
  public void setprice(double j) 
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
  public void addtoFavorites()
  {
    favorite = true;
  }
  
  //duration 1.1.3 pt 4
  public int getDuration () 
  {
      return duration;
  }
  public void setDuration (int d)
  {
    duration = d;
  }
  public String displayDuration () {
      int hr = duration/60;
      int min = duration % 60; 
      String d = hr + " Hours & " + min + " Minutes";
      return d;
  }
  
}




