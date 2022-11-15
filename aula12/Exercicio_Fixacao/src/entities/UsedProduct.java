package entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{

    private  static  final SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private Date manufacture;

    public UsedProduct(){
        super();
    }

    public UsedProduct(String name, Double price, Date manufacture) {
        super(name, price);
        this.manufacture = manufacture;
    }

    public Date getManufacture() {
        return manufacture;
    }

    public void setManufacture(Date manufacture) {
        this.manufacture = manufacture;
    }

    @Override
    public String priceTag(){
        return getName()
                + " (used) $"
                + String.format("%.2f",getPrice())
                + "  (Manufacture date: "
                + sdf.format(manufacture)
                + ")";

    }

}
