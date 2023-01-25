package application;

import entities.Product2023;

import java.util.Set;
import java.util.TreeSet;

public class Programa2020 {
    public static void main(String[] args) {

        Set<Product2023> set = new TreeSet<>();

        set.add(new Product2023("TV", 900.0));
        set.add(new Product2023("Notebook", 1200.0));
        set.add(new Product2023("Tablet", 400.0));
        Product2023 prod = new Product2023("Notebook", 1200.0);

        for(Product2023 p : set){
            System.out.println(p);
        }
    }
}
