import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    private static int x = 100;
    private static int y = 100;
    public static int getXDest()
    {
        return x;
        
    }
    public static int getYDest()
    {
        return y;
        
    }
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject( new Igloo(), x, y);
        //addObject(new Seal(), 350, 200);
        
    }
    
}
