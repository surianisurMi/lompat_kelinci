import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class petunjuk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class petunjuk extends World
{

    /**
     * Constructor for objects of class petunjuk.
     * 
     */
    public petunjuk()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(750, 470, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,61,436);
    }
}