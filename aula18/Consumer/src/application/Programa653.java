package application;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import entities.Product22;
import util.PriceUPdaate;

public class Programa653 {
    public static void main(String[] args) {
        
        List<Product22> list = new ArrayList<>();

        list.add(new Product22("Tv", 900.00));
        list.add(new Product22("Mouse",50.00));
        list.add(new Product22("Tablet", 350.50));
        list.add(new Product22("HD Case", 80.90));
        double factor = 1.1;
        //Consumer<Product22> cons = p -> p.setPrice(p.getPrice() * factor);

        //list.forEach(new PriceUPdaate());
        //list.forEach(Product22::staticPriceUpdate);
        //list.forEach(Product22::nonStaticPriceUpdate);
        //list.forEach(cons);
        list.forEach(p -> p.setPrice(p.getPrice() * factor));

        list.forEach(System.out::println);
    }
}
