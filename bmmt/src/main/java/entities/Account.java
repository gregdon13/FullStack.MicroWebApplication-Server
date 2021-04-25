package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {
    private @Id @GeneratedValue Long id;
    private String accountType;
    private Double balance;
    private Long accountNumber;
    private Long userId;

    public Account() {}

    public Account(String accountType, Double balance, Long accountNumber, Long userId) {
        this.accountType = accountType;
        this.balance = balance;
        this.accountNumber = accountNumber;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
