public class Trapezium extends GeometricFigure {
    private double side1;
    private double side2;
    private double height;

    public Trapezium(double side1, double side2, double height) {
        this.side1 = side1;
        this.side2 = side2;
        this.height = height;
    }

    @Override
    public double area() {
        return 0.5 * (side1 + side2) * height;
    }

    @Override
    public double perimeter() {
        return 2 * (side1 + side2);
    }
}