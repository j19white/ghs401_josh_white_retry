import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Lemur extends Actor
{
    private String name;
    private int speed;
    private int turnAmount;
    
    public Lemur()
    {
    
        this.speed = 4;
        this.turnAmount = 45;
        this.name=null;
        
    }
    public Lemur(String name, int speed, int turnAmount)
    {
        
        this.name = name;
        this.speed = speed;
        this.turnAmount = turnAmount;
       
    }
    boolean canTouch = true;
    int collided=0;
    public void act() 
    {
       
        move(this.speed);
        //boolean canTouch = true;
        if(this.isAtEdge())
        {
            turn(this.turnAmount);
            
        }
        
            
        if(isTouching(Wombat.class) && canTouch==true)
        {
                //System.out.println("collision!!!" + collided);
                //removeTouching(Wombat.class);
                canTouch=false;
                //collided+=1;
                System.out.println("collision!!!");
                
        }
        if(canTouch==false)
        {
            if(isTouching(Wombat.class)==false)
            {
                canTouch=true;
            }
        }
        getWorld().showText(toString(), 100, getWorld().getHeight()/2);
    }    
    
    public String toString()
    {
        
        String output = "Lemur: \nName = " + this.name + "\nSpeed = " + this.speed + "\nTurn Amount = " + this.turnAmount + "\nX: " + getX() + "\nY: " + getY();
        return output;
        
    }
}
