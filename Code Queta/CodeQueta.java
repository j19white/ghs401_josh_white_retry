
import java.io.*;

public class CodeQueta
{
    public static void main() throws Exception
    {
        
        File file = new File("Prob04.in.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        System.out.println(st);
        int counter = 0;
        int quantityOfLines=Integer.parseInt(st);
        String line;
        for(int i=0; i<quantityOfLines; i++)
        {
            line = br.readLine();
            System.out.println(line);
            
            //int grade=Integer.parseInt(line);
            /*if(grade<70)
            {
                System.out.println("Fail");
                
            }
            else
            {
                System.out.println("Pass");
                
            }
            
            */
            //int counter;
            
            for(int k=0; k<line.length(); k++)
            {
                if(line.substring(k, k+1).equals("a") || line.substring(k, k+1).equals("e") || line.substring(k, k+1).equals("i") || line.substring(k, k+1).equals("o")|| line.substring(k, k+1).equals("u"))
                {
                    counter++;

                    
                }
                //System.out.println(counter);
                //counter=0;
            }
               System.out.println(counter);
               counter=0;
       // int players = (int)((Math.random()* 10)+2);
               
        
        
    }
}
}
