import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class jeruk here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class jeruk extends benda
{
    /**
     * Act - do whatever the jeruk wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX()+1, getY()); //posisi objek jeruk
        jerukFall(); 
    }   
    
    public void  jerukFall() //method jerukFall
     {
         if (atWorldEdge()) //jika objek jeruk berada di bawah world
         {
             getWorld().removeObject(this); // remove objek jeruk jika menyentuh ujung bckground
         }
     }
}
