package entities;

public class Product22 {
    
    private String name;
    private Double price;


    public Product22(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return this.price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public static void staticPriceUpdate(Product22 p){
        p.setPrice(p.getPrice() * 1.1);
    }
    public  void nonStaticPriceUpdate(){
        price = price * 1.1;
    }
    @Override
    public String toString() {
        return "Nome: "
               + getName()
               + " "
               +"Price: "
               +String.format("%.2f",getPrice());
    }

}
