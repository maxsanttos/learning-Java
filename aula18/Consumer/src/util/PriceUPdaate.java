package util;

import java.util.function.Consumer;

import entities.Product22;

public class PriceUPdaate implements Consumer<Product22> {

    @Override
    public void accept(Product22 p) {
        p.setPrice(p.getPrice() * 1.1);
    }
}
