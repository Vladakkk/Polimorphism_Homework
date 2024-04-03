public class Circle implements Shape{
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    @Override
    public double calcArea() {
        return Math.PI * radius * radius;
    }
}

