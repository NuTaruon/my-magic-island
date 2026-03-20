package animals.predators;

import animals.Animal;
import animals.herbivores.*;

import java.util.Map;

// Лиса
public class Fox extends Predator{
    private static final double WEIGHT = 8;
    private static final int SPEED = 2;
    private static final double MAX_SATURATION = 2;
    private static final int MAX_POPULATION_ONE_LOCATION = 30;
    private static final Map<Class<? extends Animal>,Integer> EATING_PROBABILITY = Map.of(Rabbit.class, 70, Mouse.class, 90, Duck.class,60, Caterpillar.class, 40);

    public Fox() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION, EATING_PROBABILITY);
    }


}
