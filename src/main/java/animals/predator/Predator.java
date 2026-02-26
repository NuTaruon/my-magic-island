package animals.predator;

import animals.Animal;
import model.Location;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

public abstract class Predator extends Animal {
    private final Map<Class<? extends Animal>, Integer> EATING_PROBABILITY;

    public Predator(double WEIGHT, int SPEED, double MAX_SATURATION, int MAX_POPULATION_ONE_LOCATION,  Map<Class<? extends Animal>, Integer> EATING_PROBABILITY) {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
        this.EATING_PROBABILITY = EATING_PROBABILITY;
    }

    @Override
    public void eat(Location location) {
        if(!alive){
            return;
        }
        for (Animal animal: location.getAnimals()){
            if(animal == this || !animal.isAlive()) continue;
            Integer prob = EATING_PROBABILITY.get(animal.getClass());
            if(prob != null || ThreadLocalRandom.current().nextInt(100) < prob){
                location.removeAnimal(animal);
                animal.die();
                saturation =  Math.min(MAX_SATURATION, saturation + animal.getWeight());
                break;
            }
        }
    }
}
