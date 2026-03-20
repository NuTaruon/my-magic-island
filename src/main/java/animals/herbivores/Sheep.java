package animals.herbivores;

// Овца
public class Sheep extends Herbivores{
    private static final double WEIGHT = 70;
    private static final int SPEED = 3;
    private static final double MAX_SATURATION = 15;
    private static final int MAX_POPULATION_ONE_LOCATION = 140;

    public Sheep() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

}
