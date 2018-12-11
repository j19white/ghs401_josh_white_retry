import javax.swing.JOptionPane;

public class WhileLoops
{
    // instance variables - replace the example below with your own
    public static void main()
    {
     int age = -1;
     //String name = Integer.parseInt(JOptionPane.showInputDialog("Please enter age"));
    /* while(age<=0 || age>120)
     
         
          age = Integer.parseInt(JOptionPane.showInputDialog("Please enter age"));
         
         
         
     */
        
    //int number[] = new int[10];
    //int numSquared[] = new int[10];
    double num;
    double numSquared;
    double random;
    
     for(int i=0; i<10; i++)
     {
         
         num = i+1;
         numSquared =num*num;
         random = (int) (Math.random()*(numSquared-num+1) + num);
         
         //System.out.println(num + "\t" + numSquared + "\t" + random);
         if(random==num)
         {
           System.out.println(num + "\t" + numSquared + "\t" + random + " The random value is equal to the index value");
           
         }
         else if(random==numSquared)
         {
             
             System.out.println(num + "\t" + numSquared + "\t" + random + " The random value is equal to the squared value");
         }
         else
         {
            System.out.println(num + "\t" + numSquared + "\t" + random);
             
         }
            
       
         
            
            
        
    }
    String movies[] = new String[]{"Finding Nemo", "Shrek" , "The Conjuring"};
    String songs[] = new String[]{"Star", "Africa" , "Ocean Man"};
    
    
    System.out.println("\n");
     for(int i=0; i<movies.length; i++)
     {
         System.out.println(movies[i]);
         
         
         
     }
     int loops = (songs.length-1);
     System.out.println("\n");
     
     while(loops >= 0)
     {
         if(loops==0)
         {
             System.out.print(songs[loops]);
             loops--;
         
             
         }
         else
         {
             System.out.print(songs[loops] + ", ");
             loops--;
        }
         
         
     }
     
    
    
    
}
}
