import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class menang here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class menang extends World
{

    /**
     * Constructor for objects of class menang.
     * 
     */
    public menang()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        menag menag = new menag();
        addObject(menag,320,130);
        start start = new start();
        addObject(start,176,288);
        quit quit = new quit();
        addObject(quit,374,296);
        quit.setLocation(395,295);
        start.setLocation(248,296);
    }
}
