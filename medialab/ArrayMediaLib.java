
/**
 * Write a description of class ArrayMediaLib here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ArrayMediaLib
{    
  static void main(){
  /*String [] sharingFriends = {"Eliza", "Ellie", "Jyun","Billy", "Alex", "Shae"};
  for (int i = 0; i<6; i++)
  {System.out.println(sharingFriends[i]);
    }
  int[] daysBtwnPurchases = {5,3,2,7,876,34};
  System.out.println(getAvg( daysBtwnPurchases));*/
  Song[] topTenSongs = {new Song("The Twist"),
    new Song("Smooth"),
    new Song("Mack the knife"),
    new Song("How do I Live"),
    new Song("Party Rock Anthem"),
    new Song("I Gotta Feeling"),
    new Song("Macarena (Bayside Boys Mix)"),
    new Song("Physical"), 
    new Song("You Light up my Life"),
    new Song("Hey Jude")};  
    for (Song s: topTenSongs)
    {
       System.out.println(s.getTitle());
    }
    //Change the array
    System.out.println("-BEFORE--");
    for(Song changeSong : topTenSongs) {
        changeSong = new Song("na na na");
        System.out.println(changeSong.getTitle());
    }
    System.out.println("-AFTER--");
    for(Song showSong : topTenSongs) {
        System.out.println(showSong.getTitle());
    }
}
   /*public static double getAvg(int[] daysBtwnPurchases){
     double total = 0;
     for(int val: daysBtwnPurchases)
     {
         total = total + val;    
     }
     return total/daysBtwnPurchases.length;
    }*/
}
   
  
