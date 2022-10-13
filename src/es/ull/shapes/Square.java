package es.ull.shapes;

import java.awt.*;
import java.awt.geom.Rectangle2D;

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
    public void draw(Graphics g) {
    }
}


