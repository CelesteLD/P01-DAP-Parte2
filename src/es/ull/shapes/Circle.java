package es.ull.shapes;

import java.awt.*;

public class Circle extends ShapeCircular {

    public Circle(double radius) {
        super(radius);
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
    public void draw(Graphics g) {
        // Completar

    }
}
