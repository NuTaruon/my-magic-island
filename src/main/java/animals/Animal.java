package animals;

public abstract class Animal {
    private int weight;
    private int speed;
    private int saturation;

    public Animal(int saturation, int speed, int weight) {
        this.saturation = saturation;
        this.speed = speed;
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    public int getSpeed() {
        return speed;
    }

    public int getSaturation() {
        return saturation;
    }

    abstract void eat();
    abstract void reproduction();
    abstract void movement();

}
