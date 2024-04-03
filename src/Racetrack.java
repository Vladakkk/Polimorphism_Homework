public class Racetrack implements Obstacle {
    private double length;

    public Racetrack(double length) {
        this.length = length;
    }

    public boolean overcome(double value) {
        return value >= length;
    }

    public String getName() {
        return "Racetrack";
    }
}