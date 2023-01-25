package model.service;

import java.util.List;
import java.util.function.Predicate;

import entitites.Product111;

public class ProductService {
    
    public double filteredSum(List<Product111> list, Predicate<Product111> criteria){

        double sum = 0.0;
        for (Product111 p : list) {
            if (criteria.test(p)) {
                sum += p.getPrice();
            }
        }
        return sum;
    }
}
