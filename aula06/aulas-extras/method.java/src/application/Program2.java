package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Triangle2;

public class Program2 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Triangle2 x,y;

        x = new Triangle2();
        y = new Triangle2();

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

        
        double areaX = x.area();
        double areaY =y.area();


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
