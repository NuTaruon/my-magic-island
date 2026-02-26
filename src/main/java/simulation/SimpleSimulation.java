package simulation;

import animals.predator.*;
import config.SimulationConfig;
import model.Island;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleSimulation {
    SimulationConfig simulationConfig;
    Island island;

    public void initialization() {
        island = new Island(simulationConfig.getISLAND_WIDTH(),simulationConfig.getISLAND_HEIGHT());

        for (int i = 0; i < simulationConfig.getInitialPopulationWolf(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Wolf());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationBear(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Bear());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationBoa(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Boa());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationEagle(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Eagle());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationFox(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Fox());
        }


    }
}
