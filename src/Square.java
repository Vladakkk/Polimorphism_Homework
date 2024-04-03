public class Square implements Shape{
    private double side;

    public Square(double side){
        this.side = side;
    }

    @Override
    public double calcArea() {
        return side * side;
    }
}
