import javax.swing.JOptionPane;

public class HighLow
{
    
    
    public static void main()
    {
        //try
    
        //Hi
        int size = Integer.parseInt(JOptionPane.showInputDialog("Please enter the array size"));
        int low = Integer.parseInt(JOptionPane.showInputDialog("Please enter a low number"));
        int high = Integer.parseInt(JOptionPane.showInputDialog("Enter a high number"));
        int odds = 0;
        int evens = 0;
        //int size = Integer.parseInt(JOptionPane.showInputDialog("Please enter the array size"));
    //catch(NumberFormatException E){
        if(low >= high){
            System.out.println("Error");
            
        }
        else{
            
            int[] myArray = new int[size];
            for(int i=0; i<size; i++){
            
                myArray[i] = (int)(Math.random()*(1+high-low)+low);
                
                //System.out.println("Element #" + (i + 1) + " is " + (low + myArray[i]) + " which is ");
                
                if(myArray[i] % 2 == 1){
                
                    System.out.println("Element #" + (i + 1) + " is " +  myArray[i] + " which is even");
                    evens++;
                    
                }
                else{
                    System.out.println("Element #" + (i + 1) + " is " + myArray[i] + " which is odd");
                    odds++;
                    
                }
                
                //System.out.println("The array has " + evens + " even numbers and " + odds + " odd numbers");
            
            
        }
        System.out.println("The array has " + evens + " even numbers and " + (size - evens) + " odd numbers");
    }
    
}
}

