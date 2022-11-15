package entities;

public class Individual extends TaxPayer{
    private Double healthExpenditure;

    public Individual(){
        super();
    }

    public Individual(String name, Double anualincome,Double healthExpenditure) {
        super(name, anualincome);
        this.healthExpenditure = healthExpenditure;
    }

    public Double getHealthExpenditure() {
        return healthExpenditure;
    }

    public void setHealthExpenditure(Double healthExpenditure) {
        this.healthExpenditure = healthExpenditure;
    }

    @Override
    public Double tax(){
        if (getAnualincome() < 2000.0){
            return  getAnualincome() * 0.15 - healthExpenditure *0.5;
        }else {
            return getAnualincome() * 0.25 - healthExpenditure * 0.5;
        }
    }
}
