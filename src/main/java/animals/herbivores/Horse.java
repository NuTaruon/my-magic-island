package animals.herbivores;

import model.Location;

// Лошадь
public class Horse extends Herbivores{
    private static final double WEIGHT = 400;
    private static final int SPEED = 4;
    private static final double MAX_SATURATION = 60;
    private static final int MAX_POPULATION_ONE_LOCATION = 20;

    public Horse() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void reproduction(Location location) {

    }

    @Override
    public void movement() {

    }
}
