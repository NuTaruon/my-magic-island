package animals.predators;

import animals.Animal;
import animals.herbivores.*;
import model.Location;

import java.util.Map;

// Медведь
public class Bear extends Predator{
    private static final double WEIGHT = 500;
    private static final int SPEED = 2;
    private static final double MAX_SATURATION = 80;
    private static final int MAX_POPULATION_ONE_LOCATION = 30;
    private static final Map<Class<? extends Animal>,Integer> EATING_PROBABILITY = Map.of(Horse.class,40, Deer.class, 80, Rabbit.class, 80, Mouse.class, 90, Goat.class, 70, Sheep.class,70, Boa.class, 80 , Buffalo.class, 20, Duck.class,10, Boar.class,50 );

    public Bear() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION, EATING_PROBABILITY);
    }

}
