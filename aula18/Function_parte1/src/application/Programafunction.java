package application;

import entities.Product_function;
//import util.UpperCaseName;

import java.util.ArrayList;
import java.util.List;
//import java.util.function.Function;
import java.util.stream.Collectors;

public class Programafunction {
    public static void main(String[] args) {
        
        List<Product_function> list = new ArrayList<>();

        list.add(new Product_function("Tv", 900.00));
        list.add(new Product_function("Mouse",50.00));
        list.add(new Product_function("Tablet", 350.50));
        list.add(new Product_function("HD Case", 80.90));
        //Function<Product_function,String> func = p -> p.getName().toUpperCase();

        //List<String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product_function::staticUpperCaseName).collect(Collectors.toList());
        //List<String> names = list.stream().map(Product_function::nonStaticUpperCaseName).collect(Collectors.toList());
        //List<String> names = list.stream().map(func).collect(Collectors.toList());
        List<String> names = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());




        // a function map pega uma coleção de valores e aplica a cada um
        // dos valores da coleção a função que esta instaciada
        names.forEach(System.out::println);
    }
}
