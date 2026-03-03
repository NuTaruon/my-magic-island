package animals.predators;

import animals.Animal;
import animals.herbivores.*;
import model.Location;

import java.util.Map;

// Удав
public class Boa extends Predator{
    private static final double WEIGHT = 15;
    private static final int SPEED = 1;
    private static final double MAX_SATURATION = 3;
    private static final int MAX_POPULATION_ONE_LOCATION = 30;
    private static final Map<Class<? extends Animal>,Integer> EATING_PROBABILITY = Map.of(Fox.class, 15, Rabbit.class, 20, Mouse.class, 40, Duck.class,10);

    public Boa() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION, EATING_PROBABILITY);
    }

}
