import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class balok here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class balok extends Actor
{
    
    /**
     * Act - do whatever the balok wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
        setLocation(getX(),getY()-1);
        
        World w=getWorld();
        if(isAtEdge())
        {
            w.removeObject(this);
        }
    }    
}
