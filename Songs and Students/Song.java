

public class Song
{
    private String songTitle;
    private String songArtist;
    private double songCost;
    private double songTime;
    
    private int lengthInSecs;
    
    
    /*public Song(){
        this.songTitle = null;
        this.songArtist = null;
        this.songCost = 0;
        this.songTime = 0.0;
        
        //System.out.println("1");
    }
    */
   
    public Song(String songTitle, String songArtist, double songCost, int lengthInSecs){
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songCost = songCost;
        
        this.lengthInSecs = lengthInSecs;
        
        
        //System.out.println("2");
        
    }
    int remainder;
    int mins =0;
    public int getLengthInSecs()
    {
        return (this.lengthInSecs);
        
        
    }
    public void setLengthInSecs(int newSeconds)
    {
        this.lengthInSecs = newSeconds;
    }
    public String convertToMinSec()
    {
        mins = (lengthInSecs / 60);
        remainder = (lengthInSecs % 60);
        return("The length of the song is: " + mins + " minutes and " + remainder + " seconds."); 
    }
   
    public String toString(){
     
        String output= ("Song title: " + this.songTitle + "\nSong Artist: " + this.songArtist + "\nSong Cost: " + this.songCost + "\nSong Length: " + this.lengthInSecs);
        System.out.print(convertToMinSec());
        return output;
        
    }   
}
