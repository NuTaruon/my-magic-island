package model;

import animals.Animal;
import plants.Plant;

import java.util.ArrayList;
import java.util.List;

/**
 * Класс локация содержит список животных и растений
 **/
public class Location {
    private final List<Animal> animals = new ArrayList<>();
    private final List<Plant> plants = new ArrayList<>();

    public List<Plant> getPlants() {
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

    public void addPlant(Plant plant){
        plants.add(plant);
    }

    // Однопоток
    public Plant removePlant(){
        if(!plants.isEmpty()){
            return plants.remove(plants.size() -1);
        }
        return null;
    }
}

