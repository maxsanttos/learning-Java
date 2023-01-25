package entities;

import java.util.Locale;
import java.util.Objects;

public class Product2023 implements Comparable<Product2023>{

    private String name;
    private Double price;
    public Product2023(String name, Double price) {
        this.name = name;
        this.price = price;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product2023{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product2023 that)) return false;
        return getName().equals(that.getName()) && getPrice().equals(that.getPrice());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getPrice());
    }

    @Override
    public int compareTo(Product2023 other) {
        return name.toUpperCase().compareTo(other.getName().toUpperCase());
    }
}
