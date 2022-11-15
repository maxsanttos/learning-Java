package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product1;

public class Program1 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product1 product = new Product1();

        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        product.name = sc.nextLine();
        System.out.print("Price: ");
        product.price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        product.quantity = sc.nextInt();


        
        System.out.println(product); // não precisa colocar  no print o toString , o java entifica automaticamnte , apenas coloque a class

        sc.close();
    }
}
