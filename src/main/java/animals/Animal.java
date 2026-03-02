package animals;

import model.Location;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Animal {

    protected final double WEIGHT;
    protected final int SPEED;
    protected final double MAX_SATURATION;
    protected final int MAX_POPULATION_ONE_LOCATION;
    protected double saturation;
    protected boolean alive = true;
    private final int CHANGE_REPRODUCTION = 50;



    public Animal(double WEIGHT, int SPEED, double MAX_SATURATION, int MAX_POPULATION_ONE_LOCATION) {
        this.WEIGHT = WEIGHT;
        this.SPEED = SPEED;
        this.MAX_SATURATION = MAX_SATURATION;
        this.saturation = MAX_SATURATION;
        this.MAX_POPULATION_ONE_LOCATION = MAX_POPULATION_ONE_LOCATION;
    }

    public int getMAX_POPULATION_ONE_LOCATION() {
        return MAX_POPULATION_ONE_LOCATION;
    }

    public double getSaturation() {
        return saturation;
    }

    public double getMAX_SATURATION() {
        return MAX_SATURATION;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public double getWeight() {
        return WEIGHT;
    }

    public boolean isAlive() {
        return alive;
    }

    public abstract void eat(Location location);
    public void reproduction(Location location){
        if(!alive)
            return;
        long countAnimalLocation = location.getAnimals().stream()
                .filter(a -> a.getClass() == this.getClass() && a!= this && a.isAlive())
                .count();
        if(countAnimalLocation > 0 && ThreadLocalRandom.current().nextInt(100) < CHANGE_REPRODUCTION) {
            try {
                Animal baby = this.getClass().getDeclaredConstructor().newInstance();
                baby.setSaturation(baby.MAX_SATURATION / 2);
                location.addAnimal(baby);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public  void movement() {

    }

    public void die(){
        alive = false;
    }
}
