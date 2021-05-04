package com.bmmt.demo.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Transaction {
    @Id
    @GeneratedValue
    private Long id;
    private Long accountOne;
    private Long accountTwo;
    private String transactionType;
    private Double amount;
    private Long userId;

    public long getId() {
        return id;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public long getAccountOne() {
        return accountOne;
    }

    public void setAccountOne(long accountOne) {
        this.accountOne = accountOne;
    }

    public long getAccountTwo() {
        return accountTwo;
    }

    public void setAccountTwo(long accountTwo) {
        this.accountTwo = accountTwo;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
