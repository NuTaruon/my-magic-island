package model;

import animals.Animal;
import plants.Plant;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Класс локация содержит список животных и растений
 **/
public class Location {
    private volatile List<Animal> animals = new CopyOnWriteArrayList<>();
    private volatile List<Plant> plants = new CopyOnWriteArrayList<>();

    public List<Plant> getPlants() {
        return plants;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
        animal.setCurentLocation(this);
    }

    public void removeAnimal(Animal animal){
        animals.remove(animal);

    }

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    // Однопоток
    public void removePlant(Plant plant){
        plants.remove(plant);
    }
}

