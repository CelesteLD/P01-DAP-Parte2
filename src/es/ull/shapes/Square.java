package es.ull.shapes;

public class Square extends ShapePolygonal {
    public Square(double width) {
        super(width);
    }

    @Override
    public double getArea() {
        return width * width;
    }

    @Override
    public double getPerimeter() {
        return width * 4;
    }

    @Override
    public void draw() {
        System.out.println("This is a shapes.Square");
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }
}


