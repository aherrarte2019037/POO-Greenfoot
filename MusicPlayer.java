import greenfoot.*;

/**
 * Clase encargada de reproducir un sonido
 * 
 * @author Angel Herra
 * @version 1.0.0
 */
public class MusicPlayer {
    private GreenfootSound sound;

    /**
     * Constructor for objects of class MusicPlayer
     */
    public MusicPlayer(String fileName) {
        sound = new GreenfootSound(fileName);
        sound.setVolume(50);
    }

    /**
     * Reproducir el sonido
     * 
     * @param infinite variable para reproducir el sonido en bucle
     */
    public void play(boolean infinite) { // put your code here
        if (infinite) {
            sound.playLoop();
        } else {
            sound.play();
        }
    }

    /**
     * Detener la reproducción del sonido 
     */
    public void play() { // put your code here
        sound.stop();
    }
}
