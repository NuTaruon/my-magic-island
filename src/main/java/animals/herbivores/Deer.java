package animals.herbivores;

import model.Location;

// Олень
public class Deer extends Herbivores{
    private static final double WEIGHT = 300;
    private static final int SPEED = 4;
    private static final double MAX_SATURATION = 50;
    private static final int MAX_POPULATION_ONE_LOCATION = 20;

    public Deer() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void reproduction(Location location) {

    }

    @Override
    public void movement() {

    }
}
