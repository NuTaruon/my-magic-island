package animals.herbivores;

import model.Location;

// Утка
public class Duck extends Herbivores{
    private static final double WEIGHT = 1;
    private static final int SPEED = 4;
    private static final double MAX_SATURATION = 0.15;
    private static final int MAX_POPULATION_ONE_LOCATION = 200;

    public Duck() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

}
