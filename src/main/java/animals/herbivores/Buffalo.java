package animals.herbivores;

import model.Location;

// Буйвол
public class Buffalo extends Herbivores{
    private static final double WEIGHT = 700;
    private static final int SPEED = 3;
    private static final double MAX_SATURATION = 100;
    private static final int MAX_POPULATION_ONE_LOCATION = 10;

    public Buffalo() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void reproduction(Location location) {

    }

    @Override
    public void movement() {

    }
}
