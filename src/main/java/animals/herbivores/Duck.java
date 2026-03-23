package animals.herbivores;

import animals.Animal;
import model.Location;
import plants.Plant;

import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

// Утка
public class Duck extends Herbivores{
    private static final double WEIGHT = 1;
    private static final int SPEED = 4;
    private static final double MAX_SATURATION = 0.15;
    private static final int MAX_POPULATION_ONE_LOCATION = 200;
    private static final Map<Class<? extends Animal>,Integer> EATING_PROBABILITY = Map.of(Caterpillar.class, 90);

    public Duck() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void eat(Location location) {
        if (!isAlive())
            return;

        for (Animal animal : location.getAnimals()) {
            if (animal == this || !animal.isAlive()) continue;
            Integer prob = EATING_PROBABILITY.get(animal.getClass());
            if (prob != null && ThreadLocalRandom.current().nextInt(100) < prob) {
                location.removeAnimal(animal);
                animal.die();
                saturation = Math.min(MAX_SATURATION, saturation + animal.getWeight());
                System.out.println(this.getClass().getSimpleName() + " съел " + animal.getClass().getSimpleName());
                if(saturation >= MAX_SATURATION)
                    return;
            }
        }
        if(!isAlive() || location.getPlants() == null || saturation >= MAX_SATURATION)
            return;
        for (Plant plant: location.getPlants()) {
            if (plant != null) {
                saturation = Math.min(MAX_SATURATION, saturation + plant.getWeight());
                location.removePlant(plant);
            }
            else
                break;
        }
    }
}


