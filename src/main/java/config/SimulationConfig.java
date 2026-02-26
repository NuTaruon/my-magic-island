package config;

public class SimulationConfig {
    private final int ISLAND_WIDTH;
    private final int ISLAND_HEIGHT;
    private int plantsCell = 1;
    private int initialPopulationWolf = 3;
    private int initialPopulationBear = 2;
    private int initialPopulationEagle = 5;
    private int initialPopulationBoa = 4;
    private int initialPopulationFox = 6;
    private int initialPopulationBoar = 3;
    private int initialPopulationBuffalo = 2;
    private int initialPopulationCaterpillar = 5;
    private int initialPopulationDeer = 4;
    private int initialPopulationDuck = 6;
    private int initialPopulationGoat = 3;
    private int initialPopulationHorse = 2;
    private int initialPopulationMouse = 5;
    private int initialPopulationRabbit = 4;
    private int initialPopulationSheep = 6;

    public int getInitialPopulationBoar() {
        return initialPopulationBoar;
    }

    public int getInitialPopulationBuffalo() {
        return initialPopulationBuffalo;
    }

    public int getInitialPopulationCaterpillar() {
        return initialPopulationCaterpillar;
    }

    public int getInitialPopulationDeer() {
        return initialPopulationDeer;
    }

    public int getInitialPopulationDuck() {
        return initialPopulationDuck;
    }

    public int getInitialPopulationGoat() {
        return initialPopulationGoat;
    }

    public int getInitialPopulationHorse() {
        return initialPopulationHorse;
    }

    public int getInitialPopulationMouse() {
        return initialPopulationMouse;
    }

    public int getInitialPopulationRabbit() {
        return initialPopulationRabbit;
    }

    public int getInitialPopulationSheep() {
        return initialPopulationSheep;
    }

    public int getInitialPopulationBear() {
        return initialPopulationBear;
    }

    public int getInitialPopulationEagle() {
        return initialPopulationEagle;
    }

    public int getInitialPopulationBoa() {
        return initialPopulationBoa;
    }

    public int getInitialPopulationFox() {
        return initialPopulationFox;
    }

    public int getISLAND_WIDTH() {
        return ISLAND_WIDTH;
    }

    public int getISLAND_HEIGHT() {
        return ISLAND_HEIGHT;
    }

    public int getPlantsCell() {
        return plantsCell;
    }

    public int getInitialPopulationWolf() {
        return initialPopulationWolf;
    }

    public SimulationConfig(int islandWidth, int islandHeight) {
        ISLAND_WIDTH = islandWidth;
        ISLAND_HEIGHT = islandHeight;
    }
}

