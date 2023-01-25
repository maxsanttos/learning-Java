package entities;

public class ProductExercicio {
    
    private String name;
    private Double price;


    public ProductExercicio(String name, Double price) {
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

    @Override
    public String toString() {
        return "Nome: "
               + getName()
               +" "
               +"Price: "
               + getPrice();
    }

}
