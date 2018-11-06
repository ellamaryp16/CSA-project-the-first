
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
  int[] daysBtwnPurchases = {5,3,2,7,876,33};
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
Song[] topTenSongs = {new Song(), new Song(), new Song()};
    
}   
    // instance variables - replace the example below with your own
  
