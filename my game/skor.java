import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class skor here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class skor extends Actor
{   private int totalCount=0; //Counter dafault awal=0
    /**
     * Act - do whatever the skor wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        gameOver(); //method gameOver
    }    
    public void counter()//kelas Counter
    {
        setImage(new GreenfootImage("0",30,Color.WHITE,Color.BLACK));//membuat
    }
    public void counting (int hitung)//method Conting
    {
        totalCount +=hitung;
        setImage(new GreenfootImage(""+totalCount,30,Color.WHITE,Color.BLACK));
    }
    public void gameOver()
    {
        if (totalCount >=50)//bila totalCount>=50
    {
       Greenfoot.stop ();
       Greenfoot.playSound ("gameover.mp3");
       System.out.println ("CONGRATULATION! YOU NOW! Click PESET to play again");
    }
}
}

