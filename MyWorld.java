import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
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
        Parede parede = new Parede();
        addObject(parede,119,16);
        parede.setLocation(121,21);
        Parede parede2 = new Parede();
        addObject(parede2,359,16);
        parede2.setLocation(421,18);
        parede2.setLocation(403,17);
        Parede parede3 = new Parede();
        addObject(parede3,594,16);
        Parede parede4 = new Parede();
        addObject(parede4,117,383);
        Parede parede5 = new Parede();
        addObject(parede5,354,383);
        Parede parede6 = new Parede();
        addObject(parede6,591,382);
        parede6.setLocation(525,376);
        parede6.setLocation(532,378);
        parede6.setLocation(532,378);
        parede6.setLocation(537,379);
        parede6.setLocation(537,379);
        removeObject(parede6);
        addObject(parede6,593,383);
        Pong pong = new Pong();
        addObject(pong,40,190);
        Pong2 pong2 = new Pong2();
        addObject(pong2,560,190);
        parede.setLocation(172,25);
        parede.setLocation(168,17);
        parede2.setLocation(330,18);
        parede2.setLocation(311,23);
        parede3.setLocation(515,22);
        parede3.setLocation(530,19);
        parede.setLocation(161,190);
        parede2.setLocation(295,268);
        parede.setLocation(246,182);
        parede2.setLocation(277,268);
        removeObject(parede2);
        removeObject(parede);
        parede4.setLocation(169,374);
        removeObject(parede4);
        removeObject(parede5);
        removeObject(parede6);
        removeObject(parede3);

        Parede parede7 = new Parede();
        addObject(parede7,300,25);
        Parede2 parede22 = new Parede2();
        addObject(parede22,300,375);

    }
}
