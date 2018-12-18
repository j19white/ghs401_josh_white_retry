
import javax.swing.JOptionPane;
public class Greatest
{
    public static void main()
    {
        int length = Integer.parseInt(JOptionPane.showInputDialog("How long should the array be?"));
        while(length<0 || length>100)
        {
            length = Integer.parseInt(JOptionPane.showInputDialog("How long should the array be?"));
            
        }
        
        int myArray[] = new int[length];
        for(int i=0; i<length; i++)
        {
            myArray[i]= (int) (Math.random()*(91) + 10);
            
        }
        for(int i=0; i<length; i++)
        {
            System.out.print(myArray[i] + " ");
            
        }
        
        int high = 0;
        int low = 100;
        
        for(int i=0; i<length; i++)
        {
            if(myArray[i]>high)
            {
                high=myArray[i];
            }
            
            if(myArray[i]<low)
            {
                low=myArray[i];
            }

        }
        
        System.out.println("\nThe greatest number is " + high);
        System.out.println("The lowest number is " + low);
        
    }
}
