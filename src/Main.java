import es.ull.shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner data = new Scanner(System.in);
        int option = 0;

        do {
            System.out.println("Select the shape you want: ");
            System.out.println("[1]. Square");
            System.out.println("[2]. Triangle");
            System.out.println("[3]. Circle");
            option = data.nextInt();
        } while (option > 3 || option < 1);

        double heigth, base, radius, width;

        switch (option) {
            case 1 -> {
                System.out.println("Type the value of the side of square: ");
                width = data.nextDouble();
                Square sq = new Square(width);
                sq.draw();
            }
            case 2 -> {
                System.out.println("Type the value of the side of triangle: ");
                base = data.nextDouble();
                System.out.println("Type the value of the heigth: ");
                heigth = data.nextDouble();
                Triangle tr = new Triangle(base, heigth);
                tr.draw();
            }
            case 3 -> {
                System.out.println("Type the value of the radius of circle: ");
                radius = data.nextDouble();
                Circle ci = new Circle(radius);
                ci.draw();
            }
        }
    }
}