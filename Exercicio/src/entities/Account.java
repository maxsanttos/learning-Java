package entities;

public class Account {

    //atributos
    private int number;
    private String holder;
    private double balance;

    //construtor
    public Account(int number,String holder){

        this.number = number;
        this.holder = holder;
    }
    //construtor com 3 argunmentos
    public Account(int number,String holder,double initialDeposit){
        this.number = number;
        this.holder = holder;
        deposit(initialDeposit);
    }

    //métodos
    public int getNumber(){
        return number;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public String getHolder(){
        return holder;
    }
    public void setHolder(String holder){
        this.holder = holder;
    }
    public double getBalance(){
        return balance;
    }
    
    public void deposit(double amount){
        balance += amount;
    }

    public  void withdaw(double amount){
        balance -= amount + 5.0;
    }
    public String toString(){
        return "Account: "
            + number
            + ", Holder: "
            + holder
            + ", Balance: $ "
            + String.format("%.2f", balance);
    }

}   
