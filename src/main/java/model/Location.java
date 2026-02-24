package model;

import animals.Animal;
import plants.Plants;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс локация содержит список животных и растений
 **/
public class Location {
    private final List<Animal> animals = new ArrayList<>();
    private final List<Plants> plants = new ArrayList<>();

    public List<Plants> getPlants() {
        return plants;
    }

    public List<Animal> getAnimals() {
        return animals;
    }

    public void addAnimal(Animal animal){
        animals.add(animal);
    }

    public void removeAnimal(Animal animal){
        animals.remove(animal);
    }

    public void addPlant(Plants plant){
        plants.add(plant);
    }

    // Однопоток
    public Plants removePlant(){
        if(!plants.isEmpty()){
            return plants.remove(plants.size() -1);
        }
        return null;
    }
}

