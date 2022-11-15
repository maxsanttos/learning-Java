package entities;

public class Product5{
    private String name;
    private double price;
    private int quantity;


    // construtor
    public Product5(String name,double price,int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
      
    }

    //Methods Get and Set
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }

    public double getPrice(){
        return price;
    }
    
    public void setPrice(double price){
        this.price = price;
    }

    public int getQuantity(){
        return quantity;
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
