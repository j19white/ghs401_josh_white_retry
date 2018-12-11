import javax.swing.JOptionPane;

public class WhileLoops2
{
   public static void main()
   {
       int age = 0;
       
       while(age <= 0 || age > 117)
       {
           age = Integer.parseInt(JOptionPane.showInputDialog("Please enter age"));
           
           
           
           
       }
       
       
       
    }
   
}
