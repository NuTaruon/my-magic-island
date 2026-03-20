package model;

import animals.Animal;
import animals.herbivores.*;
import animals.predators.*;

/**
 * Остров - двумерный массив клеток
 * Y - строка, X - столбик
 */
public class Island {
    private final int width;
    private final int height;
    private final Location[][] locations;

    public Island(int width, int height) {
        this.width = width;
        this.height = height;
        locations = new Location[height][width];

        for(int i = 0; i < locations.length; i++){
            for (int j = 0; j < locations[i].length; j++) {
                locations[i][j] = new Location();
            }
        }
    }

    public Location getLocation(int x, int y){
        if(x < 0 || x >= width || y < 0 || y >= height)
            throw  new IllegalArgumentException("Выход за координаты острова");
        return locations[y][x];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    public void printStatistic(){
        int bearCount = 0;
        int boarCount = 0;
        int eagleCount = 0;
        int foxCount = 0;
        int wolfCount = 0;
        int boaCount = 0;
        int buffaloCount = 0;
        int caterpillarCount = 0;
        int deerCount = 0;
        int duckCount = 0;
        int goatCount = 0;
        int horseCount = 0;
        int mouseCount = 0;
        int rabbitCount = 0;
        int sheepCount = 0;

        for (int x = 0; x < this.getWidth(); x++) {
            for (int y = 0; y < this.getHeight(); y++) {
                Location location = this.getLocation(x,y);
                for (Animal animal : location.getAnimals())
                    if(animal instanceof Bear)
                        bearCount++;
                    else if(animal instanceof Boar)
                        boarCount++;
                    else if(animal instanceof Eagle)
                        eagleCount++;
                    else if(animal instanceof Fox)
                        foxCount++;
                    else if(animal instanceof Wolf)
                        wolfCount++;
                    else if(animal instanceof Boa)
                        boaCount++;
                    else if(animal instanceof Buffalo)
                        buffaloCount++;
                    else if(animal instanceof Caterpillar)
                        caterpillarCount++;
                    else if(animal instanceof Deer)
                        deerCount++;
                    else if(animal instanceof Duck)
                        duckCount++;
                    else if(animal instanceof Goat)
                        goatCount++;
                    else if(animal instanceof Horse)
                        horseCount++;
                    else if(animal instanceof Mouse)
                        mouseCount++;
                    else if(animal instanceof Rabbit)
                        rabbitCount++;
                    else if(animal instanceof Sheep)
                        sheepCount++;

            }
        }

        System.out.println();
        System.out.println("=====Количество животных=====");
        System.out.println("Хищники:");
        System.out.print("Медведь:" + bearCount + " ");
        System.out.print("Орел:" + eagleCount + " ");
        System.out.print("Лиса:" + foxCount + " ");
        System.out.print("Волк:" + wolfCount + " ");
        System.out.println("Удав:" + boaCount);
        System.out.println("Травоядные:");
        System.out.print("Кабан:" + boarCount + " ");
        System.out.print("Буйвол:" + buffaloCount + " ");
        System.out.print("Гусеница:" + caterpillarCount+" ");
        System.out.print("Олень:" + deerCount + " ");
        System.out.print("Утка:" + duckCount + " ");
        System.out.print("Коза:" + goatCount + " ");
        System.out.print("Лошадь:" + horseCount + " ");
        System.out.print("Мышь:" + mouseCount + " ");
        System.out.print("Кролик:" + rabbitCount +  " ");
        System.out.println("Овца:" + sheepCount);
        System.out.println();
    }
}
