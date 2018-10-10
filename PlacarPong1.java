import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Placar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarPong1 extends Actor
{
    /**
     * Act - do whatever the Placar wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        atualizaImagem("0");
    }    

    private void atualizaImagem(String valor){
        GreenfootImage Pong1 = new GreenfootImage("0", 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Pong1);
    }

    public PlacarPong1(){
        atualizaImagem("0");
   }
}
