package entities;


public class Product {
  
    public String name;
    public double price;
    public int quantity;

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
}
