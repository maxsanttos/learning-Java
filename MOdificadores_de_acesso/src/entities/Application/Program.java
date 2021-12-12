package entities.Application;

import java.util.Locale;
import java.util.Scanner;

import entities.Product.Product;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Product data: ");
        System.out.print("Name: ");
        String name =sc.nextLine();
        System.out.print("Price: ");
        double price = sc.nextDouble();
        Product product = new Product(name,price);

        //Set e get
        product.setName("Computer"); 
        System.out.println("Update name: "+ product.getName());
        product.setPrice(1200.00);
        System.out.println("Upadte price: "+ product.getPrice());

        System.out.println();
        System.out.println("Product data: " + product);
        System.out.println();
        System.out.println("Enter the number of products to be added in stovk: ");

        int quantity = sc.nextInt();
        product.addProducts(quantity);
        System.out.println("Upadate quantity "+ product.getQuantity());

        System.out.println();
        System.out.println("Update data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed from stovk: ");
        quantity = sc.nextInt();
        product.removeProdutcs(quantity);
        System.out.println("Upadate quantity " + product.getQuantity());

        System.out.println();
        System.out.println("Update data: " + product);
        sc.close();  

    }
}
