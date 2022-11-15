package application;

import Enums.Color;
import entities.Circle;
import entities.Rectangle;
import entities.Shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        List<Shape> list = new ArrayList<>();

        System.out.print("Enter the number of shapes: ");
        int form = sc.nextInt();

        for (int i = 1; i <= form; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (r/c)? ");
            char type = sc.next().charAt(0);
            System.out.print("Color (BLACK/BLUE/RED): ");
            Color color =  Color.valueOf(sc.next());
            if (type == 'r'){
                System.out.print("Width: ");
                double largura = sc.nextDouble();
                System.out.print("Heigth: ");
                double altura = sc.nextDouble();
                list.add(new Rectangle(color,largura,altura));
            }else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("SHAPE AREAS:");
        for (Shape shape : list) {
            System.out.println(String.format("%.2f", shape.area()));
        }
        sc.close();
    }
}
