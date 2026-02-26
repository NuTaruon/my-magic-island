package animals.herbivores;

import model.Location;

// Кабан
public class Boar extends Herbivores{
    private static final double WEIGHT = 400;
    private static final int SPEED = 2;
    private static final double MAX_SATURATION = 50;
    private static final int MAX_POPULATION_ONE_LOCATION = 50;

    public Boar() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

    @Override
    public void reproduction(Location location) {

    }

    @Override
    public void movement() {

    }
}
