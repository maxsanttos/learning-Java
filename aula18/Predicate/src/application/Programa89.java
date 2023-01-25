package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

import entities.Product;
//import util.ProductPredicate;

public class Programa89 {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        
        List<Product> list = new ArrayList<>();
        
        list.add(new Product("Tv", 900.00));
        list.add(new Product("Mouse", 50.00));
        list.add(new Product("Tablet", 350.50));
        list.add(new Product("HD Case", 80.90));
        double min = 100.0;
        //Predicate<Product> pred = p -> p.getPrice() >= min;


        //list.removeIf(p -> p.getPrice() >= 100); // um forma de implementa utilizando lambda
        //list.removeIf(new ProductPredicate()); implementação da interface
        //list.removeIf(Product::staticProductPredicate); reference method com método estático
        //list.removeIf(Product::nonStaticProductPredicate); reference method com método não estático
        //list.removeIf(pred);
        list.removeIf(p -> p.getPrice() >= min);


        for (Product p : list) {
            System.out.println(p);
        }
    }
}
