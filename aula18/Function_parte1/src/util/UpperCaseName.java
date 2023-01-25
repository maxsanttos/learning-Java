package util;

import entities.Product_function;

import java.util.function.Function;

public class UpperCaseName implements Function<Product_function,String> {
    @Override
    public String apply(Product_function p) {
        return p.getName().toUpperCase();
    }
}
