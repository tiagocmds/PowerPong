import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacarPong2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarPong2 extends Actor
{
    /**
     * Act - do whatever the PlacarPong2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
     public void act() 
    {
        atualizaImagem("0");
    }    

    private void atualizaImagem(String valor){
        GreenfootImage Pong2 = new GreenfootImage("0", 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Pong2);
    }

    public PlacarPong2(){
        atualizaImagem("0");
    } 
}
