package application;

import java.util.ArrayList;
import java.util.List;

import entitites.Product111;
import model.service.ProductService;

public class Programa111 {
    public static void main(String[] args) {
        
        List<Product111> list = new ArrayList<>();

        list.add(new Product111("Tv", 900.00));
        list.add(new Product111("Mouse",50.00));
        list.add(new Product111("Tablet", 350.50));
        list.add(new Product111("HD Case", 80.90));

        ProductService ps = new ProductService();

        double sum = ps.filteredSum(list,p -> p.getName().charAt(0) == 'M');

        System.out.println("Sum = "+ String.format("%.2f",sum));
    }
}
