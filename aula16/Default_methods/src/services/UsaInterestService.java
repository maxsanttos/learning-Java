package services;

public class UsaInterestService implements InterestService {
    private double interestRate;

    public UsaInterestService(double interestRate){
        this.interestRate = interestRate;
    }

    // como esse method depende do resultado do interestRate ele não pode esta dentro da interface como default
    @Override
    public double getInterestRate() {
        return interestRate;
    }
}
