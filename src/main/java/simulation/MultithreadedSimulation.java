package simulation;

import animals.Animal;
import animals.herbivores.*;
import animals.predators.*;
import config.SimulationConfig;
import model.Island;
import model.Location;
import plants.Plant;

import java.util.List;
import java.util.concurrent.*;

public class MultithreadedSimulation {
    private final SimulationConfig simulationConfig = new SimulationConfig(1000,2000);
    private final Island island = new Island(simulationConfig.getISLAND_WIDTH(),simulationConfig.getISLAND_HEIGHT());
    private final ExecutorService executorService = Executors.newFixedThreadPool(10);
    private final ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(1);
    private volatile boolean running = true;

    public void tick() {
        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Location location = island.getLocation(x, y);
                for (int i = 0; i < simulationConfig.getPlantsCell(); i++) {
                    location.addPlant(new Plant());
                }
            }
        }

        List<Callable<Void>> tasks = new CopyOnWriteArrayList<>();
        for (int x = 0; x < island.getWidth(); x++) {
            for (int y = 0; y < island.getHeight(); y++) {
                Location location = island.getLocation(x, y);
                int finalX = x;
                int finalY = y;

                for (Animal animal: location.getAnimals()){
                            if (!animal.isAlive() || animal.isMoved() || animal.getCurentLocation() == null)
                                continue;
                            tasks.add(() -> {
                                if (animal.getSaturation() > 0) {
                                    animal.eat(animal.getCurentLocation());
                                    if (!(animal instanceof Caterpillar)) {
                                        animal.movement(island, finalX, finalY);
                                    }
                                    animal.reproduction(location);
                                    animal.setSaturation(animal.getSaturation() - (animal.getMAX_SATURATION() / 100 * 10));
                                }
                                else{
                                    animal.die();
                                    animal.getCurentLocation().removeAnimal(animal);
                                }
                                return null;
                            });
                }
            }
        }

        try {
            List<Future<Void>> futures = executorService.invokeAll(tasks);

            for (Future<Void> future : futures){
                    future.get();
            }
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            System.out.println("Ошибка тика");
            stop();
        } catch (ExecutionException e) {
            System.out.println("Ошибка выполнения действий животного");
            stop();
        }
        island.printStatistic();
    }

    public void start(){
        scheduledExecutorService.scheduleAtFixedRate(() ->{
            if(running) {
            tick();
        }
        }, 0 , 2000, TimeUnit.MILLISECONDS);

    }

    public void stop(){
        running = false;
        executorService.shutdown();
        scheduledExecutorService.shutdown();
    }

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
}
