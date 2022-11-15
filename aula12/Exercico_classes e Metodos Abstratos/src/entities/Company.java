package entities;

public class Company extends TaxPayer{
    private  int numberOfEmployees;

    public  Company(){super();}

    public Company(String name, Double anualincome, int numberOfEmployees) {
        super(name, anualincome);
        this.numberOfEmployees = numberOfEmployees;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    @Override
    public Double tax() {
        if (numberOfEmployees > 10){
            return  getAnualincome() * 0.14;
        }else {
            return getAnualincome() * 0.16;
        }
    }
}
