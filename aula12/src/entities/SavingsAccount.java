package entities;


// o final impedi a sobreposição
public class SavingsAccount extends Account{
    private Double interestRate;


    public  SavingsAccount(){
        super();
    }

    public SavingsAccount(Integer number, String holder, Double balance, Double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public Double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(Double interestRate) {
        this.interestRate = interestRate;
    }

    public  void updateBalance(){
        balance += balance * interestRate;
    }

    @Override // informa ao compilador que é uma supreposição
    /* Geralmente convém acrescentar final em métodos sobrepostos, pois
    sobreposições múltiplas podem ser uma porta de entrada para
    inconsistências */
    public final void withdraw(double amount) {
        balance -= amount;
        
    }

    

}
