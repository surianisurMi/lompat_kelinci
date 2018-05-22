import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hutan here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hutan extends World
{
    int jeda=100;

    /**
     * Constructor for objects of class hutan.
     * 
     */
    public hutan()
    {    
        // Buat world dengan ukuran 720x480 cells dengan cell size 1x1 pixels
        super(720, 440, 1);
        apeljalan(); 
        siap(); 
        gancujalan(); 
        jerukjalan();
        bugjalan();
        prepare();
    }

    public void act() //method act
    {
        if (getObjects(apel.class).isEmpty()) apeljalan();
        if (getObjects(gancu.class).isEmpty()) gancujalan();
         if (getObjects(jeruk.class).isEmpty()) jerukjalan();
        if (getObjects(bug.class).isEmpty()) bugjalan();
        
        if(jeda==0){
            addObject(new gancu(), getWidth()/7,getHeight()/9);
            addObject(new apel(), getWidth()/9,getHeight()/5);
            jeda=900;

        }
        else {
            jeda--;
        }
       
        
        if(jeda==0){
            addObject(new jeruk(), getWidth()/6,getHeight()/5);
            
           addObject(new bug(), getWidth()/10,getHeight()/2);
            
            jeda=500;

        }
        else {
            jeda--;
        }
        
       
        
        if(jeda==0){
            addObject(new jeruk(),105,278);
               addObject(new gancu(),418,425);
            jeda=700;

        }
        else {
            jeda--;
        }

        if(jeda==0){
             addObject(new bug(), getWidth()/10,getHeight()/2);
             addObject(new apel(), getWidth()/10,getHeight()/4);
             
            jeda=400;

        }
        else {
            jeda--;
            
        }
    }

    private void siap() //method prepare untuk menentukan posisi dari kelas objek masing-masing
    {
        kelinci kelinci = new kelinci();
        addObject(kelinci, 648, 403);
        Counter Counter = new Counter();
        addObject(Counter, 57, 69);
        nilai nilai = new nilai();
        addObject(nilai, 64, 44);
        nilai.setLocation(59, 44);
        kelinci.setLocation(373, 403);
    }

    public void apeljalan() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new apel(), Greenfoot.getRandomNumber(519),200);
        }
    }

    public void  gancujalan() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new gancu(), Greenfoot.getRandomNumber(519),201);
        }
    }
    public void jerukjalan() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new jeruk(), Greenfoot.getRandomNumber(519),205);
        }
    }
    public void bugjalan() 
    {
        if(Greenfoot.getRandomNumber(2) < 50)
        {
            addObject(new bug(), Greenfoot.getRandomNumber(519),240);
        }
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        back back = new back();
        addObject(back,56,411);
    }
}

