package entities;

//METHODS

public class Product1 {
  
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
