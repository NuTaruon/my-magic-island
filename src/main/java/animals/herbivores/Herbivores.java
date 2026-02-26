package animals.herbivores;

import animals.Animal;
import model.Location;
import plants.Plant;


public abstract class Herbivores extends Animal {

    public Herbivores(double WEIGHT, int SPEED, double MAX_SATURATION, int MAX_POPULATION_ONE_LOCATION) {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void eat(Location location) {
        if(!alive)
            return;
        Plant plant = location.removePlant();
        if(plant != null)
            saturation = Math.min(MAX_SATURATION, saturation + plant.getWeight());
    }
}
