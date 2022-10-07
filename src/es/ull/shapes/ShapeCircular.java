package es.ull.shapes;

public abstract class ShapeCircular {
    double radius;

    public ShapeCircular (double radius) {
        this.radius = radius;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw();

}
