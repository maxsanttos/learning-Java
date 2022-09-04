package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle x,y;

        x = new Triangle();
        y = new Triangle();

        System.out.println("Enter the measures of triangle X: ");
        System.out.print("=> ");
        x.a = sc.nextDouble();
        System.out.print("=> ");
        x.b = sc.nextDouble();
        System.out.print("=> ");
        x.c = sc.nextDouble();

        System.out.println("Enter the measures of triangle Y: ");
        System.out.print("=> ");
        y.a = sc.nextDouble();
        System.out.print("=> ");
        y.b = sc.nextDouble();
        System.out.print("=> ");
        y.c = sc.nextDouble();

        double p = (x.a + x.b + x.c) / 2;
        double areaX = Math.sqrt(p *(p - x.a) * (p - x.b) * (p - x.c));

        p = (y.a + y.b + y.c) / 2;
        double areaY = Math.sqrt(p *(p - y.a) * (p - y.b) * (p - y.c));


        System.out.printf("Triangle X area: %.4f%n", areaX);
        System.out.printf("Triangle Y area: %.4f%n", areaY);

        if (areaX > areaY) {
            System.out.println("Large area is X");
        }else{
            System.out.println("Large area is Y");
        }

        sc.close();

    }
}
