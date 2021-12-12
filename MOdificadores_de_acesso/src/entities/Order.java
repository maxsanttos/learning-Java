package entities;


import java.util.Date;

import entities.Product.Product;

public interface Order {
    private Date date;
    private Product product;
    java.util.Date date = null;


    public Order(Date date, Product product){
        super();
        this.date = date;
        Order.product = product;
        Order.product.name = "TV";
    }
    public Date getDate(){
        return date;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public Product getProduct(){
        return product;
    }
    public void setProduct(Product product){
        this.product = product;

    }
}
