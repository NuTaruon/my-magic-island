package simulation;

import animals.Animal;
import animals.herbivores.*;
import animals.predators.*;
import config.SimulationConfig;
import model.Island;
import model.Location;
import plants.Plant;

import java.util.concurrent.ThreadLocalRandom;

public class SimpleSimulation {
    SimulationConfig simulationConfig = new SimulationConfig(100,20);
    Island island;

    public void initialization() {
        island = new Island(simulationConfig.getISLAND_WIDTH(),simulationConfig.getISLAND_HEIGHT());
        System.out.println(Animal.class.getClasses());

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

        for (int i = 0; i < simulationConfig.getInitialPopulationBoar(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Boar());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationBuffalo(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Buffalo());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationCaterpillar(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Caterpillar());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationDeer(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Deer());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationDuck(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Duck());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationGoat(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Goat());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationHorse(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Horse());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationMouse(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Mouse());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationRabbit(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Rabbit());
        }
        for (int i = 0; i < simulationConfig.getInitialPopulationSheep(); i++) {
            int x = ThreadLocalRandom.current().nextInt(island.getWidth());
            int y = ThreadLocalRandom.current().nextInt(island.getHeight());
            island.getLocation(x,y).addAnimal(new Sheep());
        }

        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Location location = island.getLocation(x,y);
                for (int p = 0; p < 7; p++) {
                    location.addPlant(new Plant());
                }
            }
        }

    }

}
