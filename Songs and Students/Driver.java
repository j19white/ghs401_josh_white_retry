
public class Driver
{
    public static void main()
    {
        Song song1 = new Song();
        Song song2 = new Song("Africa", "Toto", 0.99, 4.55);
        
        Student student1 = new Student();
        Student student2 = new Student("Josh","White", 17, 12);
        Student student3 = new Student();
        
        System.out.println(song1.toString());
        System.out.println("\n" + song2.toString());
        System.out.println("\n" + student1.toString());
        System.out.println("\n" + student2.toString());
        
    }
}
