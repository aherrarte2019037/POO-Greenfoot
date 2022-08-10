import greenfoot.*; // (World, Actor, GreenfootImage, and Greenfoot)

/**
 * Clase que se encarga del movimiento de un bicho
 * 
 * @author Angel Herrarte
 * @version 1.0.0
 */
public class BugMovement extends Actor {
    private static final double SPEED = 5.0;
    
    /**
     * Regresa al actor a su rotación inicial
     */
    public void resetRotation() {
        setRotation(0);
    }
    
    /**
     * Mueve 90 grados al actor hacia la derecha
     */
    public void turn() {
        turn(90);
    }

    /**
     * Mueve el actor a la derecha según el parámetro angle
     */
    public void turn(int angle) {
        setRotation(getRotation() + angle);
    }

    /**
     * Mueve al actor
     */
    public void move() {
        move(SPEED);
    }

    /**
     * Mueve al actuar según el parámetro distance
     */
    public void move(double distance) {
        double angle = Math.toRadians(getRotation());
        int x = (int) Math.round(getX() + Math.cos(angle) * distance);
        int y = (int) Math.round(getY() + Math.sin(angle) * distance);

        setLocation(x, y);
    }

    /**
     * Evita que el actor no se salga de la pantalla
     */
    public boolean atWorldEdge() {
        if (getX() < 200 || getX() > getWorld().getWidth() - 120)
            return true;
        if (getY() < 200 || getY() > getWorld().getHeight() - 120)
            return true;
        else
            return false;
    }
}
