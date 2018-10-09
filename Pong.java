import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pong here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong extends Actor
{
    /**
     * Act - do whatever the Pong wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        possoAndarParaCima();
        possoAndarParaBaixo();
    }
    public void possoAndarParaCima(){
        Actor Parede = getOneIntersectingObject(Parede.class);
        if(Parede==null){
            andarParaCima();
        }
    }
    public void possoAndarParaBaixo(){
        Actor Parede2 = getOneIntersectingObject(Parede2.class);
        if(Parede2==null){
            andarParaBaixo();
        }
    }
    public void andarParaCima(){
          if(Greenfoot.isKeyDown("w")) {
               setLocation(getX(), getY() - velocidade());
            }
        }   
    public void andarParaBaixo(){
           if(Greenfoot.isKeyDown("s")) {
               setLocation(getX(), getY() + velocidade());
            }
        }
    public boolean Boost(){
            if(Greenfoot.isKeyDown("e")){
             return true;
            }else{
             return false;   
            }
        }
    public int velocidade(){
        if(Boost()){
        return 12;    
        }else{
        return 3;    
        }
    }
        }

