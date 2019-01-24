

public class StringStuff
{
    public static void main()
    {
        String name = "Granada";
        System.out.println(name.length());
        
        
        System.out.println(name.substring(1,4));
        for(int i=0; i<name.length(); i++)
        {
            System.out.print(name.substring(i,i+1));
        }
        
        
    }
}
