package animals;

import model.Island;
import model.Location;

import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.ThreadLocalRandom;


public abstract class Animal {

    protected final double WEIGHT;
    protected final int SPEED;
    protected final double MAX_SATURATION;
    protected final int MAX_POPULATION_ONE_LOCATION;
    protected double saturation;
    protected volatile boolean alive = true;
    private boolean isMoved = false;
    private final int CHANGE_REPRODUCTION;
    protected volatile Location curentLocation;




    public Animal(double WEIGHT, int SPEED, double MAX_SATURATION, int MAX_POPULATION_ONE_LOCATION, int CHANGE_REPRODUCTION) {
        this.WEIGHT = WEIGHT;
        this.SPEED = SPEED;
        this.MAX_SATURATION = MAX_SATURATION;
        this.saturation = MAX_SATURATION;
        this.MAX_POPULATION_ONE_LOCATION = MAX_POPULATION_ONE_LOCATION;
        this.CHANGE_REPRODUCTION = CHANGE_REPRODUCTION;

    }

    public boolean isMoved() {
        return isMoved;
    }

    public void setMoved(boolean moved) {
        isMoved = moved;
    }

    public int getMAX_POPULATION_ONE_LOCATION() {
        return MAX_POPULATION_ONE_LOCATION;
    }

    public double getSaturation() {
        return saturation;
    }

    public double getMAX_SATURATION() {
        return MAX_SATURATION;
    }

    public void setSaturation(double saturation) {
        this.saturation = saturation;
    }

    public double getWeight() {
        return WEIGHT;
    }

    public boolean isAlive() {
        return alive;
    }

    public abstract void eat(Location location);

    public void reproduction(Location location){
        if(!alive)
            return;
        long countAnimalLocation = location.getAnimals().stream()
                .filter(a -> a.getClass() == this.getClass() && a!= this && a.isAlive())
                .count();
        if(countAnimalLocation > 0 && countAnimalLocation < MAX_POPULATION_ONE_LOCATION && ThreadLocalRandom.current().nextInt(100) < CHANGE_REPRODUCTION) {
            try {
                Animal baby = this.getClass().getDeclaredConstructor().newInstance();
                baby.setSaturation(baby.MAX_SATURATION / 2);
                location.addAnimal(baby);
            } catch (InstantiationException | IllegalAccessException | InvocationTargetException |
                     NoSuchMethodException e) {
                throw new RuntimeException(e);
            }
        }
    }
    public void movement(Island island, int currentX, int currentY) {
      if(!alive)
          return;

      if(curentLocation == null)
          return;

       int direction = ThreadLocalRandom.current().nextInt(4);
       int newX = currentX;
       int newY = currentY;
       switch (direction){
           case 0:
               //Вверх Y

               newY = Math.min(0, currentY - 1);
               break;
           case 1:
               //Вправо X
               newX = Math.min(island.getWidth()-1, currentX + 1);
               break;
           case 2:
               //Вниз Y
               newY = Math.min(island.getHeight()-1, currentY + 1);
               break;
           case 3:
               //Влево X
               newX = Math.min(0, currentY -1 );
               break;
       }
       try {
           if((newX >= 0 && newX <= island.getWidth()-1) && (newY >= 0 && newY <= island.getHeight()-1)) {
               island.getLocation(newX, newY).addAnimal(this);
               island.getLocation(currentX, currentY).removeAnimal(this);
           }
       } catch (IllegalArgumentException e){
           System.out.println("Ошибка перемещения!");
       }
    }

    public Location getCurentLocation() {
        return curentLocation;
    }

    public void setCurentLocation(Location curentLocation) {
        this.curentLocation = curentLocation;
    }

    public void die() {
        alive = false;
    }
}
