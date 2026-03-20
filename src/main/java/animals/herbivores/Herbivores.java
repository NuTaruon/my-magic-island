package animals.herbivores;

import animals.Animal;
import model.Location;
import plants.Plant;


public abstract class Herbivores extends Animal {
    private static final int CHANGE_REPRODUCTION = 25;

    public Herbivores(double WEIGHT, int SPEED, double MAX_SATURATION, int MAX_POPULATION_ONE_LOCATION) {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION, CHANGE_REPRODUCTION);
    }

    @Override
    public void eat(Location location) {
        if(!isAlive() || location.getPlants() == null)
            return;
        for (Plant plant: location.getPlants()) {
            if(saturation >= MAX_SATURATION)
                return;
            if (plant != null) {
                saturation = Math.min(MAX_SATURATION, saturation + plant.getWeight());
                location.removePlant(plant);
            }
            else
                break;
        }
    }
}
