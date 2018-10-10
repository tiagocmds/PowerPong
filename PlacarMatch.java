import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacarMatch here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarMatch extends Actor
{
    /**
     * Act - do whatever the PlacarMatch wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atualizaImagem("0");
    }    

    private void atualizaImagem(String valor){
        GreenfootImage Match = new GreenfootImage("0", 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Match);
    }

    public PlacarMatch(){
        atualizaImagem("0");
    }
}
