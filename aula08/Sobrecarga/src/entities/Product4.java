package entities;

public class Product4 {
    public String name;
    public double price;
    public int quantity;

   

    // contrutor
    public Product4(String name,double price){
        this.name = name;
        this.price = price;
    }

    // retorna a multiplicação
    public double totalValueInStock(){
        return price * quantity;
    }

    // adciona 
    public void addProduct(int quantity){
        this.quantity += quantity;
    }

    // remove
    public void removeProducts(int quantity){
        this.quantity -= quantity;
    }
    
    // IMPRENSSÃO
    public String toString(){
        return "Product data: " + name
        + ", $ " 
        + String.format("%.2f", price)
        + ", "
        + quantity
        + " units, Total: $ "
        + String.format("%.2f", totalValueInStock());
    }
}
