package es.ull.shapes;

public abstract class ShapePolygonal {
    protected double width;

    protected ShapePolygonal(double width) {
        this.width = width;
    }
    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw();

}


