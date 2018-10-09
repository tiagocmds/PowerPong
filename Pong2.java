import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Pong2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pong2 extends Actor
{
    /**
     * Act - do whatever the Pong2 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        Actor Parede = getOneIntersectingObject(Parede.class);
        Actor Parede2 = getOneIntersectingObject(Parede2.class);
        if(Parede==null){
            andarParaCima();
        }
        if(Parede2==null){
            andarParaBaixo();
        }
    }
    public void andarParaCima(){
          if(Greenfoot.isKeyDown("up")) {
               setLocation(getX(), getY() - 3);
            }
        }   
    public void andarParaBaixo(){
           if(Greenfoot.isKeyDown("down")) {
               setLocation(getX(), getY() + 3);
            }
        }
}
