import greenfoot.*; // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Clase que simula un bicho.
 * 
 * @author Angel Herrarte
 * @version 1.0.0
 */
public class Bug extends BugMovement {
    public int movementSpeed = 4;
    public double movementSpeedDirection = 0;
    public int mouseArea = 180;
    public boolean died = false;

    public void act() {
        if (!died) {
            if (mouseOver()) {
                escape();
            }
            if (!mouseOver())
                caught();
        }
        die();
    }

    public boolean mouseOver() {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null) {
            if (m.getX() > getX()) {
                if ((m.getX() - getX()) < mouseArea) {
                    if (m.getY() > getY()) {
                        if ((m.getY() - getY()) < mouseArea)
                            return true;
                    }
                    if (m.getY() < getY()) {
                        if ((getY() - m.getY()) < mouseArea)
                            return true;
                    }
                }
            }
            if (m.getX() < getX()) {
                if ((getX() - m.getX()) < mouseArea) {
                    if (m.getY() > getY()) {
                        if ((m.getY() - getY()) < mouseArea)
                            return true;
                    }
                    if (m.getY() < getY()) {
                        if ((getY() - m.getY()) < mouseArea)
                            return true;
                    }
                }
            }

        }
        return false;
    }

    public void escape() {
        MouseInfo m = Greenfoot.getMouseInfo();
        if (m != null) {
            int x = m.getX() - getX();
            int y = m.getY() - getY();
            movementSpeedDirection = Math.toDegrees(Math.atan2(x, y)) - 270;
            setRotation(-(int) movementSpeedDirection);
        }
        move(movementSpeed);
    }

    public void caught() {
        if (atWorldEdge()) {
            int x = getWorld().getWidth() / 2 - getX();
            int y = getWorld().getHeight() / 2 - getY();
            movementSpeedDirection = Math.toDegrees(Math.atan2(x, y)) - 90;
            setRotation(-(int) movementSpeedDirection);

            move(movementSpeed);
        }
    }

    public void die() {
        if (Greenfoot.mouseClicked(this)) {
            died = true;
            setImage("ghost.png");
            Greenfoot.stop();
        }
    }
}
