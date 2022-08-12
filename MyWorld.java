import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name)
 * @version (a version number or a date)
 */
public class MyWorld extends World {
    /**
     * Constructor de la clase MyWorld
     * 
     */
    public MyWorld() {
        //Crea una ventana con un tamaño de 706x370
        super(706, 370, 1);
        SoundButton soundButton = new SoundButton();
        addObject(soundButton, 670, 30); 
        addObject(new PlayButton(), 350, 190);
        addObject(soundButton, 670, 30); 
    }
}
