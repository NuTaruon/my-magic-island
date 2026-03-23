package animals.predators;

import animals.Animal;
import animals.herbivores.*;

import java.util.Map;

// Орел
public class Eagle extends Predator{
    private static final double WEIGHT = 6;
    private static final int SPEED = 3;
    private static final double MAX_SATURATION = 1;
    private static final int MAX_POPULATION_ONE_LOCATION = 20;
    private static final Map<Class<? extends Animal>,Integer> EATING_PROBABILITY = Map.of(Fox.class,10, Rabbit.class, 90, Mouse.class, 90, Duck.class,80 );

    public Eagle() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION, EATING_PROBABILITY);
    }

}
