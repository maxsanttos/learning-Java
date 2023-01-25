package application;

import entities.Product325;

import java.util.HashSet;
import java.util.Set;

public class App {
    public static void main(String[] args) {

        Set<Product325> set = new HashSet<>();

        set.add(new Product325("TV", 900.00));
        set.add(new Product325("Notebook", 1200.00));
        set.add(new Product325("Tablet", 400.00));

        Product325 prod = new Product325("Notebook", 1200.00);

        System.out.println(set.contains(prod));
    }
}