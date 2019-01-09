

public class Song
{
    private String songTitle;
    private String songArtist;
    private double songCost;
    private double songTime;
    
    public Song(){
        this.songTitle = null;
        this.songArtist = null;
        this.songCost = 0;
        this.songTime = 0.0;
        
        System.out.println("1");
    }
    public Song(String songTitle, String songArtist, double songCost, double songTime){
        this.songTitle = songTitle;
        this.songArtist = songArtist;
        this.songCost = songCost;
        this.songTime = songTime;
        
        System.out.println("2");
        
    }
    public String toString(){
     
        String output= ("Song title: " + this.songTitle + "\nSong Artist: " + this.songArtist + "\nSong Cost: " + this.songCost + "\nSong Length: " + this.songTime);
        return output;
        
    }   
}
