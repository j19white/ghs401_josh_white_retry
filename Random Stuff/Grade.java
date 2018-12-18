
import javax.swing.JOptionPane;
public class Grade
{
    // instance variables - replace the example below with your own
    public static void main()
    {
        int grade = Integer.parseInt(JOptionPane.showInputDialog("Please enter your grade"));
        while(grade<0 || grade>100)
        {
               
               grade = Integer.parseInt(JOptionPane.showInputDialog("Try Again"));
            
        }
        
         if(grade<60)
        {
            System.out.println("You are FAiling");
            
        }
        else if(grade<70)
        {
            System.out.println("You have a D");
            
        }
        else if(grade<80)
        {
            System.out.println("You have a C");   
        }
        else if(grade<90)
        {
            System.out.println("You have a B");   
        }
        else 
        {
         System.out.println("You have an A");   
        }
        
        
    }
}
