import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Seal extends Actor
{
    
    private int speed;
    private double d;
    private double time;
    private int turn;
    
    //int dockY = ((Igloo) getWorld().getObjects(Igloo.class).get(0)).getY();
    //int dockX = ((Igloo) getWorld().getObjects(Igloo.class).get(0)).getX();
    
    public double calcTripDistance()
    {
        this.d = Math.sqrt((MyWorld.getYDest()-this.getY())^2 + (MyWorld.getXDest()-this.getX())^2);
        
        return d;
    }
    
    public double calcTripTravelTime()
    {
        this.time=this.d/this.speed;
        
        return time;
    }
    public Seal()
    {
        this.speed = 4;
        this.turn = 45;
    }
    public Seal(int speed, int turn)
    {
        this.speed = speed;
        this.turn = turn;
        
    }
    
    public void act() 
    {
        move(this.speed);
        if(this.isAtEdge())
        {
            turn(this.turn);
            
        }
        getWorld().showText(toString(), 100, getWorld().getHeight()/2);
        getWorld().showText("Distance to destination: " + calcTripDistance() + " km", 300, 300);
        getWorld().showText("Time to travel: " + calcTripTravelTime() + " hours", 300, 350);
        
    }    
    public String toString()
    {
        
        String output =  "\nX: " + getX() + "\nY: " + getY();
        return output;
        
    }
}
