package animals;

public abstract class Animal {
    protected final double weight;
    protected final int speed;
    protected final int maxSaturation;
    protected int saturation;
    protected boolean alive = true;

    public Animal(int maxSaturation, int saturation, int speed, double weight) {
        this.maxSaturation = maxSaturation;
        this.saturation = saturation;
        this.speed = speed;
        this.weight = weight;
    }

    public abstract void eat();
    public abstract void reproduction();
    public abstract void movement();

    public void die(){
        alive = false;
    }
}
