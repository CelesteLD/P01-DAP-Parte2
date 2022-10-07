package es.ull.shapes;

public abstract class Shape {
    protected double width;

    protected Shape(double width) {
        this.width = width;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw();

}
