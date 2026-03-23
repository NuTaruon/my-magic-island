package simulation;

import animals.Animal;
import animals.herbivores.*;
import animals.predators.*;
import config.SimulationConfig;
import model.Island;
import model.Location;
import plants.Plant;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class SimpleSimulation {
    private final SimulationConfig simulationConfig = new SimulationConfig(10,10);
    private final Island island = new Island(simulationConfig.getISLAND_WIDTH(),simulationConfig.getISLAND_HEIGHT());

    public void initialization() {


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
    island.printStatistic();
    }

    public void tick() {
        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Location location = island.getLocation(x, y);
                for (int i = 0; i < simulationConfig.getPlantsCell(); i++) {
                    location.addPlant(new Plant());
                }
            }
        }

        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
               Location location = island.getLocation(x,y);
               List<Animal> animals = List.copyOf(location.getAnimals());
               for (Animal animal: animals){
                   if(!animal.isAlive() || animal.isMoved())
                       continue;

                   if(animal.getSaturation() > 0.00) {
                       animal.movement(island, x,y);
                       if(animal.getMAX_SATURATION()/animal.getSaturation() >=1.6) {
                           animal.eat(location);
                       }
                       if(animal.getSaturation() > animal.getMAX_SATURATION()/1.5) {
                           animal.reproduction(location);
                       }
                       animal.setSaturation(animal.getSaturation()-(animal.getMAX_SATURATION()/100*10));
                       animal.setMoved(true);
                   } else {
                       animal.die();
                       location.removeAnimal(animal);
                   }
               }
            }
        }
        island.printStatistic();
        resetIsMoved();
    }

    public void run(int tick){
        for (int i = 0; i < tick; i++) {
            tick();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    private void resetIsMoved(){
        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Location location = island.getLocation(x,y);
                for (Animal animal : location.getAnimals())
                    animal.setMoved(false);
            }
        }
    }

    public static void main(String[] args) {
        SimpleSimulation simpleSimulation = new SimpleSimulation();
        simpleSimulation.initialization();
        simpleSimulation.run(20);
    }
}
