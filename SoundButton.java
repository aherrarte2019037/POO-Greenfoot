import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase para controlar la música de fondo
 * 
 * @author Angel Herrarte
 * @version 1.0.0
 */
public class SoundButton extends Actor {
    private MusicPlayer musicPlayer;
    private boolean isPlaying = true;

    public SoundButton() {
        this.musicPlayer = new MusicPlayer("track_1.mp3");
        //this.musicPlayer.play(true);
    }

    public void act() {
        if (Greenfoot.mouseClicked(this)) {
            onPressed();
        }
    }

    private void onPressed() {
        if (isPlaying) {
            this.musicPlayer.stop();
            setImage("images/no_sound.png");
            
        } else {
            this.musicPlayer.play(true);
            setImage("images/sound.png");
        }

        isPlaying = !isPlaying;
    }
}
