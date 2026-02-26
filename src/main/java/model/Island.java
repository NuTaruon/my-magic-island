package model;
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
        return locations[x][y];
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
