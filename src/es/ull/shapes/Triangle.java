package es.ull.shapes;

import java.awt.*;

public class Triangle extends ShapePolygonal {
    double height;

    public Triangle(double width, double heigth) {
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
    public void draw(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

    }
}


