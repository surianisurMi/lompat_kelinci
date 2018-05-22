import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class apel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class apel extends benda
{
    /**
     * Act - do whatever the lemon wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    private int timer=0;
    public void act() 
    {
        setLocation(getX()+1, getY()); //posisi objek apel, kecepatan apel = +6
        PisangFall(); //lakukan method apelFall
    } 
    
    public void  PisangFall() //method apelFall
     {
         if (atWorldEdge()) //jika objek apel berada di bawah world
         {
             getWorld().removeObject(this); // remove objek apel
         }
     }
}
