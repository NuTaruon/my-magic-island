package animals.herbivores;

// Кролик
public class Rabbit extends Herbivores{
    private static final double WEIGHT = 2;
    private static final int SPEED = 2;
    private static final double MAX_SATURATION = 0.45;
    private static final int MAX_POPULATION_ONE_LOCATION = 150;

    public Rabbit() {
        super(WEIGHT, SPEED, MAX_SATURATION, MAX_POPULATION_ONE_LOCATION);
    }

}
