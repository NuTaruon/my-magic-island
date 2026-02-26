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

