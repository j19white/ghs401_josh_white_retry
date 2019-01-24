import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Sheep extends Actor
{
    private int speed;
    private String name;
    public Sheep()
    {
        this.speed = 1;
        this.name = null;
        
    }
    public Sheep(int speed,String name)
    
    {
        this.speed = speed;
        this.name = name;
        
    }
    public void act() 
    {
        move(this.speed);
        if(this.isAtEdge())
        {
            int a = (int) (Math.random()*90+1);
            turn(a);
            //System.out.print(a);
            //getWorld().showText(toString(), worldWidth/2, worldHeight/2);
           
        }
        getWorld().showText(toString(), getWorld().getWidth()/2, getWorld().getHeight()/2);
    }    
    public String toString()
    {
        String output= ("Name = " + this.name + "\nSpeed = " + this.speed + "\nX position = " + getX() + "\nY position = " + getY());
        return output;
    }
}
