package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product4;

public class Program4 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        

        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
    
        //novo contrutor recebendo parametros
        Product4 product = new Product4(name, price);

        System.out.println();
        System.out.println("Product data: " + product);


        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProduct(quantity);

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.print("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);


        System.out.println();
        System.out.println("Update data: " + product);

        sc.close();
    }
}
