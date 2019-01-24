

public class Alphabet
{
    // instance variables - replace the example below with your own
   
    public static void main()
    {
        
        String q = "a";
        String s2 = "b";
        System.out.println(q.compareTo(s2));
        String[] myStringArray = new String[7]; 
        //String[] myStringArray2 = new String[7];
        String[] myStringArray3 = new String[myStringArray.length];
        myStringArray[0]="Star";
        myStringArray[1]="Baba O'Riley";
        myStringArray[2]=null;
        myStringArray[3]=null;
        myStringArray[4]="Respect";
        myStringArray[5]="Life is a Highway";
        myStringArray[6]="Under Pressure";
        
        
        String[] myStringArray2 = new String[] {"Star", "YMCA", null, "Africa", "Ocean Man", null, "Hook"};
        System.out.printf("%-10s %-20s %-20s %-20s %n", "Index", "List1", "List2", "List3");
        for(int i=0; i<myStringArray.length; i++)
        {
            if(myStringArray[i]==null)
            {
                myStringArray3[i]=myStringArray2[i];
            }
            else if(myStringArray2[i]==null)
            {
                myStringArray3[i]=myStringArray[i];
            }
            if(myStringArray[i]!=null && myStringArray2[i]!=null)
            {
                if(myStringArray[i].compareTo(myStringArray2[i])<0)
                {
                    myStringArray3[i] = myStringArray[i];
                }
                else
                {
                    myStringArray3[i] = myStringArray2[i];
                
                }
            }
            else if(myStringArray[i]==null && myStringArray2[i]==null)
            {
                myStringArray3[i] = myStringArray[(int) (Math.random()*6)];
                while(myStringArray3[i]==null)
                {
                    myStringArray3[i] = myStringArray[(int) (Math.random()*6)];
                    
                }
            }
            
            //System.out.println(" " + i + " \t" + myStringArray[i] + " \t" + myStringArray2[i] + " \t" + myStringArray3[i]);
            System.out.printf("%-10d %-20s %-20s %-20s %n", i, myStringArray[i], myStringArray2[i], myStringArray3[i]);
            //System.out.print( i + "\t" + myStringArray[i] + "    \t    \t" + myStringArray2[i] + "        \t" + myStringArray3[i] + "\n");
        }
        
        //System.out.printf("%s %s %s %n", myStringArray[1], myStringArray2[1], myStringArray3[1]);
        
        
    }
   
    
}
