import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Bola here. @author (your name) @version (a version number or a date)
 */
public class Bola extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private int hSpeed = 3;
    private int vSpeed = 3;

    /**
     * 
     */
    public void act()
    {
        setLocation(getX() + hSpeed, getY() + vSpeed);
        if (getX() < 5) {
            hSpeed =  - hSpeed;
        }
        if (getY() < 5) {
            vSpeed =  - vSpeed;
        }
        if (getX() > getWorld().getWidth() - 5) {
            hSpeed =  - hSpeed;
        }
        if (getY() > getWorld().getHeight() - 5) {
            vSpeed =  - vSpeed;
        }
        somaPontoUm();
        somaPontoDois();
    }

    /**
     * 
     */
    public void marcaPontoUm()
    {   if(getX()>=699){
            
        }
    }

    /**
     * 
     */
    public void somaPontoUm()
    {
        if (getX() == 683) {
            MyWorld World = (MyWorld)getWorld();
            World.acrescentaPontosUm(1);
        }
    }

    /**
     * 
     */
    public void somaPontoDois()
    {
        if (getX() == 17) { 
            MyWorld World = (MyWorld)getWorld();
            World.acrescentaPontosDois(1);
        }
    }
}
