
import javax.swing.JOptionPane;
public class NameLengthsDriver
{
    
    

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
            System.out.println("The first person has a longer name" + "\n");
            
        }
        else if(sum>leg)
        {
            System.out.println("The second person has a longer name" + "\n" );
            
        }
        else
        {
            System.out.println("The names are the same length" + "\n" );
        }
        
        
        
        NameLengths name1 = new NameLengths(Array1[0], Array1[1], Array1[2]);
        NameLengths name2 = new NameLengths(Array2[0], Array2[1], Array2[2]);
        
        System.out.println(name1.toString() + "\n");
        System.out.println(name2.toString());
    }
}
