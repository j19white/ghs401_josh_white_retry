
public class Driver
{
    public static void main()
    {
        /*Song song1 = new Song();
        Song song2 = new Song("Africa", "Toto", 0.99, 4.55, 295);
        
        Student student1 = new Student();
        Student student2 = new Student("Josh","White", 17, 12);
        Student student3 = new Student();
        */
       Song song2 = new Song("Africa", "Toto", 0.99, 295);
       
        //System.out.println(song1.toString());
        //System.out.println("\n" + song2.toString());
        System.out.println(song2.getLengthInSecs());
        song2.setLengthInSecs(343);
        System.out.println(song2.getLengthInSecs());
        System.out.println("\n" + song2.toString());
        //System.out.println("\n" + student1.toString());
        //System.out.println("\n" + student2.toString());
        System.out.print(song2.convertToMinSec());
        
        
    }
}
