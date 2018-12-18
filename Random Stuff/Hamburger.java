

public class Hamburger
{
    // instance variables
    /*this is a class called Hamburger
    *from this class, we can make as many
    *hamburger instances (objects) as we want
    *
    */
    
    
    private boolean hasLettuce;
    private int numPatties;
    private String cheeseType;
    
    //zero argument constructor
    //this runs everytime a zero argument hamburger is made
    //always named Public className
    public Hamburger(){
        this.hasLettuce=false;
        this.numPatties=0;
        this.cheeseType=null;
    }

    public Hamburger(boolean hasLettuce,int numPatties,String cheeseType){
        this.hasLettuce = hasLettuce;
        this.numPatties = numPatties;
        this.cheeseType = cheeseType;
        
        
    }
    //toString method
    public String toString(){
     
        String output= ("hasLettuce: " + this.hasLettuce + "\nPatties: " + this.numPatties + "\nCheese Type: " + this.cheeseType);
        return output;
        
    }   
    
}
