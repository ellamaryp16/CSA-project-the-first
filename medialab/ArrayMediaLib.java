
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{    
  static void main(){
  String [] sharingFriends = {"Eliza", "Ellie", "Jyun","Billy", "Alex", "Shae"};
  for (int i = 0; i<6; i++)
  {System.out.println(sharingFriends[i]);
    }
  int[] daysBtwnPurchases = {5,3,2,7,876,34};
  System.out.println(getAvg( daysBtwnPurchases));
}
public static double getAvg(int[] daysBtwnPurchases){
     double total = 0;
     for(int val: daysBtwnPurchases)
     {
         total = total + val;    
     }
     return total/daysBtwnPurchases.length;
    }
  public topTen(){
    Song[] topTenSongs = {new Song("The Twist"),
    new Song("Smooth"),
    new Song("Mack the Knife"),
    new Song ("How do I Live"),
    new Song("Party rock Anthem"),
    new Song("I Gotta Feeling"),
    new Song("Macarena (Beside Boys Mix)"),
    new Song("Physical"), 
    new Song("You light Up My Life"),
    new Song("Hey Jude")};  
    for (Song s: topTenSongs)
    {
        System.out.println(s.getTitle());
    }
}   }
    // instance variables - replace the example below with your own
  
