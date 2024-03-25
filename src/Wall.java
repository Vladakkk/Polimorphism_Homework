public class Wall implements Obstacle{
    private double height;

    public Wall(double height) {
        this.height = height;
    }

    public boolean overcome(double value) {
        return value >= height;
    }

    public String getName() {
        return "Wall";
    }
}