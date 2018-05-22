import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class kelinci here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class kelinci extends benda
{
    int a=1;//percepatan
    int v=2;//kecepatan
    /**
     * Act - do whatever the kereta wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        {
            
        setLocation(getX(),getY()+1 +v);
        v+=a;//v=v+a
            movekelinci(); //method movekelinci
            objectDisappear(); //method objectDisappear
        }
      
    }    
       
    public void objectDisappear() //method objectDisappear
    {
         if (canSee(apel.class)) //bila melihat kelas objek apel
         {
             eat(apel.class); //eat kelas objek apel
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
             Greenfoot.playSound("score.wav"); // mainkan sound score.wav
         }
         if (canSee(jeruk.class)) //bila melihat kelas objek apel
         {
             eat(jeruk.class); //eat kelas objek jeruk
             ((Counter)getWorld().getObjects(Counter.class).get(0)).Counting(10); // kelas counter ditambah sebanyak 10 poin
             Greenfoot.playSound("score.wav"); // mainkan sound score.wav
         }
    }
       
    public void movekelinci() //method movekelinci
    {
         if (Greenfoot.isKeyDown("left")) //bila arah panah ke kiri ditekan
         {
             move(-7); //bergerak ke -7
         }
         if (Greenfoot.isKeyDown("right")) //bila arah panah ke kanan ditekan
         {
             move(7); //bergerak ke 7
         }
         {
         
           if(Greenfoot.isKeyDown("up")){
            v=-5;
        }
    }
}
}
    

