
import javax.swing.JOptionPane;
public class NameLengths
{
    
    // instance variables - replace the example below with your own
    
    public static void main()
    {
        String[] Array1 = new String[3];
        String[] Array2 = new String[3];
        
        Array1[0] = JOptionPane.showInputDialog("What is your first name");
        Array1[1] = JOptionPane.showInputDialog("What is your middle name");
        Array1[2] = JOptionPane.showInputDialog("What is your last name");
        
        Array2[0] = JOptionPane.showInputDialog("What is your first name");
        Array2[1] = JOptionPane.showInputDialog("What is your middle name");
        Array2[2] = JOptionPane.showInputDialog("What is your last name");
        int leg = 0;
        int sum = 0;
        for(int i=0; i<Array1.length; i++)
        {
            leg += Array1[i].length();
            sum += Array2[i].length();
            
        }
        if(sum<leg)
        {
            System.out.println("The first person has a longer name");
            
        }
        else if(sum>leg)
        {
            System.out.println("The second person has a longer name");
            
        }
        else
        {
            System.out.println("The names are the same length");
        }
        
    }
    
    String first;
    String middle;
    String last;
    
    
    public NameLengths()
    {
        this.first = null;
        this.middle = null;
        this.last = null;
        
    }
    
    public NameLengths(String first, String middle, String last)
    {
        this.first = first;
        this.middle = middle;
        this.last = last;
        
    }
    
    public String toString()
    {
        String output = ("First name: " + this.first + " Middle name: " + this.middle + " Last name: " +  this.last);
        return output;
        
    }
    
}
