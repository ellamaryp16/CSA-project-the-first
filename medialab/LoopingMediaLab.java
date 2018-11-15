
/**
 * Write a description of class LoopingMediaLab here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LoopingMediaLab
{
    public static void main ()
    {
     String songInfo = MediaFile.readString();
    /*for (int i = 0; i< medialab.numSongs; i++) {
        System.out.println(MediaFile.readString());}*/
    
    while (songInfo != null){
        System.out.println(songInfo);
        songInfo = MediaFile.readString();
    }
    MediaFile.saveAndClose();
    System.out.println();
    }
  
}
