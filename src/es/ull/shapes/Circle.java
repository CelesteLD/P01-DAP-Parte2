package es.ull.shapes;

public class Circle extends Shape {

    double radius;

    public Circle(double radius) {
        super(radius * 2);
        this.radius = radius;

    }
    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public double getPerimeter() {
        return 2* Math.PI * radius;
    }

    @Override
    public void draw() {
        System.out.println("This is a triangle: ");
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
