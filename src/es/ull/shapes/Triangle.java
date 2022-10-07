package es.ull.shapes;

public class Triangle extends Shape {

    double height;

    public Triangle(double width,double heigth) {
        super(width);
        this.height = heigth;
    }
    @Override
    public double getArea() {
        return (width * height) / 2;
    }

    @Override
    public double getPerimeter() {
        return width * 3;
    }

    @Override
    public void draw() {
        System.out.println("This is a Triangle");
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}
