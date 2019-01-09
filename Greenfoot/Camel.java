import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Camel extends Actor
{
    private int speed;
    public Camel()
    {
        System.out.println("Camels");
        this.speed = 1;
       
    }
    public Camel(int speed)
    {
        System.out.println("Speedy Camels");
        this.speed = speed;
    }
    public void act() 
    {
        move(this.speed);
        if(this.isAtEdge())
        {
            int a = (int) Math.random()*100;
            turn(a);
            //this.speed = -speed;
            
        }
        getWorld().showText("X = " + getX(), 100 , 50);
        //showText(a, 100, 5);
        //System.out.println(getX());
    }    
    //public int a = getX();
}
