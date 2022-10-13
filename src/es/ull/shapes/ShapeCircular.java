package es.ull.shapes;

import java.awt.*;

public abstract class ShapeCircular {
    protected double radius;

    public ShapeCircular (double radius) {
        this.radius = radius;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract void draw(Graphics g);

}
