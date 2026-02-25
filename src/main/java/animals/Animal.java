package animals;

import model.Location;


public abstract class Animal {

    protected final double WEIGHT;
    protected final int SPEED;
    protected final double MAX_SATURATION;
    protected double saturation;
    protected boolean alive = true;


    public Animal(double WEIGHT, int SPEED, double MAX_SATURATION) {
        this.WEIGHT = WEIGHT;
        this.SPEED = SPEED;
        this.MAX_SATURATION = MAX_SATURATION;
        this.saturation = MAX_SATURATION;
    }

    public double getWeight() {
        return WEIGHT;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public abstract void eat(Location location);
    public abstract void reproduction();
    public abstract void movement();

    public void die(){
        alive = false;
    }
}
