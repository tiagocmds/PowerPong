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
        super(700, 390, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {

        BarraLateral barraLateral = new BarraLateral();
        addObject(barraLateral,350,22);
        BarraLateral2 barraLateral2 = new BarraLateral2();
        addObject(barraLateral2,350,367);
        Score score = new Score();
        addObject(score,22,8);
        Score score2 = new Score();
        addObject(score2,614,8);
        Time time = new Time();
        addObject(time,459,9);
        Match match = new Match();
        addObject(match,192,8);
        time.setLocation(476,12);
        match.setLocation(218,9);
        time.setLocation(473,13);
        time.setLocation(487,14);
        time.setLocation(483,12);
        time.setLocation(485,57);
        removeObject(time);
        Time time2 = new Time();
        addObject(time2,459,9);
        BarraCentral barraCentral = new BarraCentral();
        addObject(barraCentral,358,195);
        Pong2 pong2 = new Pong2();
        addObject(pong2,650,200);
        Pong pong = new Pong();
        addObject(pong,50,200);
        Bola bola = new Bola();
        addObject(bola,401,192);
        PlacarPong1 placarPong1 = new PlacarPong1();
        addObject(placarPong1,56,9);
        PlacarPong2 placarPong2 = new PlacarPong2();
        addObject(placarPong2,654,9);
        PlacarMatch placarMatch = new PlacarMatch();
        addObject(placarMatch,253,10);
        PlacarTime placarTime = new PlacarTime();
        addObject(placarTime,486,10);
        placarTime.setLocation(491,5);
        placarTime.setLocation(495,9);
    }
}
