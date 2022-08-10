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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        MusicPlayer musicPlayer = new MusicPlayer("track_1.mp3");
        musicPlayer.play(true);
        addObject(new Bug(), Greenfoot.getRandomNumber(550), Greenfoot.getRandomNumber(350));
    }
}
