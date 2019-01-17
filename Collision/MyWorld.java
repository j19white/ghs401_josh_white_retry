import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        addObject(new Wombat(), 50, 70);
        addObject(new Lemur(), 300, 20);
        addObject(new Wombat("Richard", 6), 35, 200);
        addObject(new Lemur("Carl", 20, 34), 400, 70);
        
    }
}
