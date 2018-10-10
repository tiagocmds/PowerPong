import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class PlacarTime here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PlacarTime extends Actor
{
    
    /**
     * Act - do whatever the PlacarTime wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        atualizaImagem(0);
    }    

    private void atualizaImagem(int valor){
        GreenfootImage Time = new GreenfootImage(converteNumero(valor), 24, Color.WHITE, new Color(0,0,0,0),Color.BLACK);
        setImage(Time);
    }

    public PlacarTime(){
        atualizaImagem(0);
    }

    private String converteNumero(int valor){
        return String.format("%02d", valor);
    }   
}
