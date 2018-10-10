import lang.stride.*;
import greenfoot.*;

/**
 * Write a description of class Bola here.
 * @author (your name) @version (a version number or a date)
 */
public class Bola extends Actor
{
    /* (World, Actor, GreenfootImage, Greenfoot and MouseInfo)*/
    private boolean possoGirar = true;
    //private int sentido = -1;
    /**
     * 
     */
    public void act()
    {
        move(15);
        if((isTouching(BarraLateral.class) || isAtEdge()) && this.possoGirar){
            turn(160);
            this.possoGirar = false;
        }        
        if(!isAtEdge() && !isTouching(BarraLateral.class)){
            this.possoGirar = true;
        }  
        if((isTouching(BarraLateral2.class) || isAtEdge()) && this.possoGirar){
            turn(160);
            this.possoGirar = false;
        } 
        if(!isAtEdge() && !isTouching(BarraLateral2.class)){
            this.possoGirar = true;
        }
    }
}