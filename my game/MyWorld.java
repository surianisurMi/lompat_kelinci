import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    public Kelinci Kelinci=new Kelinci();
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(500, 500, 1); 

        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        
        kelici1 kelici1 = new kelici1();
        addObject(kelici1,387,312);
        mulai mulai = new mulai();
        addObject(mulai,114,92);
        quit quit = new quit();
        addObject(quit,124,186);
        mulai.setLocation(108,51);
        quit.setLocation(112,157);
        mulai.setLocation(110,73);
        quit.setLocation(113,169);
        balokmenu balokmenu = new balokmenu();
        addObject(balokmenu,101,447);
        balokmenu2 balokmenu2 = new balokmenu2();
        addObject(balokmenu2,203,486);
        durimenu durimenu = new durimenu();
        addObject(durimenu,273,456);
        kelici1.setLocation(318,204);
        durimenu.setLocation(347,450);
        kelici1.setLocation(345,189);
        balokmenu.setLocation(199,412);
        balokmenu2.setLocation(252,486);
        durimenu.setLocation(330,428);
        balokmenu.setLocation(194,389);
        quit.setLocation(111,204);
    }
}