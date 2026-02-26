package plants;

public class Plant {
    private boolean alive = true;
    private final double weight = 1;

    public boolean isAlive() {
        return alive;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public double getWeight() {
        return weight;
    }
}
