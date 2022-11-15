package model.entities;

import model.entities.exceptions.DomainException;

public class Account {
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    // constructor
    public Account(){}

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    //getters e seters
    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }
    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public Double getBalance() {
        return balance;
    }
    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    // methods saque e deposito
    public void deposit(Double amount){
        balance += amount;
    }

    public void withdraw( Double amount){
        // validando o saque
        if (amount > getWithdrawLimit()){
            throw new DomainException("A quantia execede o limite de saque");
        }else if (amount > getBalance()) {
            throw new DomainException("Saldo insuficiente");
        }
        balance -= amount;
    }
}
