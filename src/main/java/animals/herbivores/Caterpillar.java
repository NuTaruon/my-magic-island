package animals.herbivores;

// Гусеница
public class Caterpillar extends Herbivores{
    private static final double WEIGHT = 0.01;
    private static final int SPEED = 0;
    private static final double MAX_SATURATION = 0.01;
    private static final int MAX_POPULATION_ONE_LOCATION = 1000;

    public Caterpillar() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

}
