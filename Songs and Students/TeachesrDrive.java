

public class TeachesrDrive
{
    public static void main()
    {
             
        Teachers teacher1 = new Teachers("Mark", 3);
        Teachers teacher2 = new Teachers("Hannibal", 15);
        
        System.out.println(teacher1.toString());
        System.out.println(teacher2.toString());
        
        System.out.println(teacher1.getYears());
        
        teacher1.setYears(13);
        
        System.out.println(teacher1.getYears());
        System.out.println(teacher1.name + " " + teacher1.numVowelsInName());
        System.out.println(teacher2.name + " " + teacher2.numVowelsInName());
    }
}
