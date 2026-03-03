package animals.herbivores;

import model.Location;

// Коза
public class Goat extends Herbivores{
    private static final double WEIGHT = 60;
    private static final int SPEED = 3;
    private static final double MAX_SATURATION = 10;
    private static final int MAX_POPULATION_ONE_LOCATION = 140;

    public Goat() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

}
