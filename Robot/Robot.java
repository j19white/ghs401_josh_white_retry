import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Robot extends Actor
{
    
    private int speed;
    private int battery;
    private String name;
    public Robot()
    {
        
    }
    public Robot(int speed, int battery, String name)
    {
        this.name=name;
        this.speed=speed;
        this.battery=battery;
        
                
    }
    
    private int a=0;
    
    public void act() 
    {
        
        if(battery>0)
            {
                move(speed);
                if(this.isAtEdge())
                {
                    move(-1);
                    turn(90);
                    
                    
                }
            
                //a+=1;
                a+=1;
                if(a%3==0)
                {
                battery-=1;
                //a=0;
            
            }
            System.out.println("Battery Life: " + battery);
        }
        getWorld().showText(toString(), getWorld().getWidth()/2, getWorld().getHeight()/2);
        
        
        
    }    
    
    public String toString()
    {
        
        String output = "Name: " + this.name + "\nSpeed: " + this.speed + "\nBattery Life: " + this.battery;
        return output;
        
    }
}
