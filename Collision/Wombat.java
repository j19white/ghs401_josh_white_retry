import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Wombat extends Actor
{
    private String name;
    private int age;
    public Wombat()
    {
        this.name=null;
        this.age=0;
    }
    public Wombat(String name, int age)
    {
        this.name = name;
        this.age = age;
                
    }
    
    public void act() 
    {
        move(4);
        if(this.isAtEdge())
        {
            turn(180);
            
        }
        getWorld().showText(toString(), 500, getWorld().getHeight()/2);
    }    
    public String toString()
    {
        
        String output = "Wombat: \nName = " + this.name + "\nX: " + getX() + "\nY: " + getY();
        return output;
        
    }
}
