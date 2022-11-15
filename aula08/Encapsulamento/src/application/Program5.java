package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product5;

public class Program5 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        

        
        System.out.println("Enter product data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        System.out.print("Quantity in stock: ");
        int quantity = sc.nextInt();
       
        
        //novo contrutor recebendo parametros
        Product5 product = new Product5(name, price,quantity);

        product.setName("Computer");
        System.out.println("Updated name: " + product.getName());
        product.setPrice(1800.00);
        System.out.println("Updated price: "+ product.getPrice());
        
        System.out.println();
        System.out.println("Product data: " + product);


        System.out.println();
        System.out.print("Enter the number of products to be added in stock: ");
        quantity = sc.nextInt();
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
