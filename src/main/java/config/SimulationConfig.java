package config;

public class SimulationConfig {
    private final int ISLAND_WIDTH;
    private final int ISLAND_HEIGHT;
    private int plantsCell = 10;
    private int initialPopulationWolf = 50;
    private int initialPopulationBear = 50;
    private int initialPopulationEagle = 50;
    private int initialPopulationBoa = 50;
    private int initialPopulationFox = 50;
    private int initialPopulationBoar = 70;
    private int initialPopulationBuffalo = 70;
    private int initialPopulationCaterpillar = 500;
    private int initialPopulationDeer = 70;
    private int initialPopulationDuck = 70;
    private int initialPopulationGoat = 70;
    private int initialPopulationHorse = 70;
    private int initialPopulationMouse = 70;
    private int initialPopulationRabbit = 70;
    private int initialPopulationSheep = 70;

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

