package animals.predator;

import animals.Animal;
import animals.herbivores.*;
import model.Location;

import java.util.Map;

// Волк
public class Wolf extends Predator{
    private static final double WEIGHT = 50;
    private static final int SPEED = 3;
    private static final double MAX_SATURATION = 8;
    private static final int MAX_POPULATION_ONE_LOCATION = 30;
    private static final Map<Class<? extends Animal>,Integer> EATING_PROBABILITY = Map.of(Horse.class,10, Deer.class, 15, Rabbit.class, 60, Mouse.class, 80, Goat.class, 60, Sheep.class,70, Boar.class, 15 , Buffalo.class, 10, Duck.class,40 );

    public Wolf() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION, EATING_PROBABILITY);
    }


    @Override
    public void reproduction(Location location) {

    }

    @Override
    public void movement() {

    }
}
