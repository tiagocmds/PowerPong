import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Campo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Campo extends World
{

    /**
     * Constructor for objects of class Campo.
     * 
     */
    public Campo()
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

        Pong2 pong2 = new Pong2();
        addObject(pong2,541,198);
        Pong pong = new Pong();
        addObject(pong,58,201);
        Bola bola = new Bola();
        addObject(bola,255,199);
    }
}
