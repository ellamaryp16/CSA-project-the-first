
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
            public Movie(){
                rating = 10;
                title = "Ponyo";
                price = 11.9;
                
      
                }
    public String getTitle() 
    {  return title;          
}
public void setTitle(String t) {
    title = t;
    }
    public double getprice () {
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

}











