package entities;

public class Product_function {
    private String name;
    private Double price;

    public Product_function(String name, Double price) {
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

    public static String staticUpperCaseName(Product_function p){
        return p.getName().toUpperCase();
    }
    public String nonStaticUpperCaseName(){
        return getName().toUpperCase();
    }
    @Override
    public String toString() {
        return "Product_function{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
