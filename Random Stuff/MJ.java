
import javax.swing.JOptionPane;
public class MJ
{
    // instance variables - replace the example below with your own
    public static void main()
    {
        String username = JOptionPane.showInputDialog("Enter school name:");
        
        if(username.equals("Granada"))
        {
            String mascot = JOptionPane.showInputDialog("What is the mascot?");
            if(mascot.equals("Matadors")){
               run();
                
                
                
            }
            else{
                System.out.println("Your mascot is wrong");
            
        }
            
       }
       else 
       {
        
       System.out.println("Your school is wrong");
       }
   }
 










   private static void run()
    {
        String[] myStringArray = new String[]{"Yung Walnut", "Brockhampton" , "Big Shaq", "A$AP Manav"};
        myStringArray[2] = null;
        for(int i=0; i<myStringArray.length; i++){
            
            if(myStringArray[i]==null)
            
            {
                System.out.println("Element " + (i+1) + " is empty(null)!");
            }
            
            else if(myStringArray[i].equals("Yung Walnut"))
            {
                System.out.println("BATHROOM BREAK!!! He's at " + (i+1) + "!");
            }
            else{
                System.out.println("We did not find Mr. Yung Walnut. Element " + (i+1) + " is " + myStringArray[i]);
            }
            
        }
        String favouriteArtist = JOptionPane.showInputDialog("What is your favorite artist?");
        boolean urMom = false; 
        for(int i = 0; i<myStringArray.length; i++)
        {
            if(favouriteArtist.equals(myStringArray[i]))
            {
                urMom = true;
                
            }
            else
            {
              // urMom = false;
            }
        }
        if(urMom == true)
        {
            System.out.println("We have the same taste in music.");
        }
        else
        {
            System.out.println("We do not have the same taste in music.");
        }
        /**if(favouriteArtist.equals("BrockHampton"))
        {
          System.out.println("We do not have the same favorite artist");
          
        }
        else{
            System.out.println("We have the same taste in music!");
            
        }*/
    }
}
