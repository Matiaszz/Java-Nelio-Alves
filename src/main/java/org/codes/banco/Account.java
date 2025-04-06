package org.codes.banco;

import java.math.BigInteger;

public class Account {
    private BigInteger accountNumber;
    private String ownerName;
    private double money;

    // Methods

    public void increaseValue(double value){
        money += value;
    }

    public void decreaseValue(double value){
        double tax = 5;
        money -= (value + tax);
    }

    // Constructors

    public Account(BigInteger accountNumber, String ownerName){
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
    }

    public Account(BigInteger accountNumber, String ownerName, double initialValue){
        this(accountNumber, ownerName);
        this.money = initialValue;
    }


    // Getters & Setters
    public BigInteger getAccountNumber() {
        return accountNumber;
    }

    public String getOwnerName(){
        return ownerName;
    }

    public double getMoney(){
        return this.money;
    }


    public void setAccountNumber(BigInteger number){
        accountNumber = number;
    }

    public void setOwnerName(String name){
        ownerName = name;
    }

    public void setMoney(double initialValue) {
        this.money = initialValue;
    }

}
