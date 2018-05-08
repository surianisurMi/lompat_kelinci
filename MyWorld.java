import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    int jeda=100;

    public Kelinci Kelinci=new Kelinci();

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(700, 500, 1); 

        addObject(Kelinci,getWidth ()/2
        ,getHeight()/8);
        prepare();
    }


    public void act(){
       if(jeda==0){
            addObject(new duri3(),615,563);
            jeda=400;

        }
        else {
            jeda--;
        }
       
        
        if(jeda==0){
            addObject(new balok(), getWidth()/2,getHeight()/1);
            jeda=300;

        }
        else {
            jeda--;
        }
        
        if(jeda==0){
            addObject(new balok(), getWidth()/9,getHeight()/1);
            jeda=200;

        }
        else {
            jeda--;
        }
        if(jeda==0){
            addObject(new duri3(), getWidth()/3,getHeight()/1);
            jeda=200;

        }
        else {
            jeda--;
        }

        if(jeda==0){
            addObject(new balok(),556,587);
            jeda=200;

        }
        else {
            jeda--;
            
        }

        
    }
    
    

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {


        balok3 balok3 = new balok3();
        addObject(balok3,358,26);
        balok3.setLocation(350,14);
        
    }
}
