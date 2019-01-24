import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class MyWorld extends World
{

    
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1000, 600, 1); 
        addObject(new Camel(), 100, 100);
        addObject(new Camel(5), 100, 200);
        addObject(new Camel(80), 100, 300);
        
        
    }
    
}
