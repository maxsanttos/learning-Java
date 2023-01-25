package application;

import entities.Product632;

import java.util.HashMap;
import java.util.Map;

public class Programa_other {
    public static void main(String[] args) {

        Map<Product632, Double> stock = new HashMap<>();


        Product632 p1 = new Product632("Tv", 900.00);
        Product632 p2 = new Product632("Notebook",1200.00);
        Product632 p3 = new Product632("Table",400.00);

        stock.put(p1,10000.0);
        stock.put(p2,20000.0);
        stock.put(p3,15000.0);

        Product632 ps = new Product632("Tv" ,900.00);

        System.out.println("Contains 'ps' key: " + stock.containsKey(ps));
    }
}
