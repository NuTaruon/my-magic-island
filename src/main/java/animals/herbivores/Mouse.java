package animals.herbivores;

import model.Location;

// Мышь
public class Mouse extends Herbivores{
    private static final double WEIGHT = 0.05;
    private static final int SPEED = 1;
    private static final double MAX_SATURATION = 0.01;
    private static final int MAX_POPULATION_ONE_LOCATION = 500;

    public Mouse() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void reproduction(Location location) {

    }

    @Override
    public void movement() {

    }
}
