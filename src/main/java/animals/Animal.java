package animals;

public abstract class Animal {
    private final int weight;
    private final int speed;
    private final int maxSaturation;
    private int saturation;
    private boolean alive = true;

    public Animal(int maxSaturation, int saturation, int speed, int weight) {
        this.maxSaturation = maxSaturation;
        this.saturation = saturation;
        this.speed = speed;
        this.weight = weight;
    }

    public int getMaxSaturation() {return maxSaturation;}

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSaturation() {
        return saturation;
    }

    public void setSaturation(int saturation) {
        this.saturation = saturation;
    }

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    abstract void eat();
    abstract void reproduction();
    abstract void movement();

}
