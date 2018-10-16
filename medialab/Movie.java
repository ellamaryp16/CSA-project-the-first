

/**
 * Write a description of class Movie here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
 public class Movie extends Media
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




