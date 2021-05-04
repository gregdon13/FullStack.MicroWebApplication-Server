package com.bmmt.demo.services;

import com.bmmt.demo.entities.Account;
import com.bmmt.demo.entities.Transaction;
import com.bmmt.demo.repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import com.bmmt.demo.repositories.AccountRepository;


@Service
public class AccountService {
    private final AccountRepository accountsRepository;
    private final TransactionRepository transactionRepository;

    @Autowired
    public AccountService(AccountRepository accountsRepository, TransactionRepository transactionRepository) {
        this.accountsRepository = accountsRepository;
        this.transactionRepository = transactionRepository;
    }

    public Iterable<Account> index() {
        return accountsRepository.findAll();
    }

    public Account show(Long id) {
        return accountsRepository.findById(id).get();
    }

    public Iterable<Account> findAllUserAccounts(Long userId) {
        return accountsRepository.findAccountByUserId(userId);
    }

    public Account findByAccountNum(Long accountNumber) {
        return accountsRepository.findAccountByAccountNumber(accountNumber);
    }

    public Account create(Account account) {
        return accountsRepository.save(account);
    }

    public Boolean delete(Account account) {
        accountsRepository.delete(account);
        return true;
    }

    public Account update(Long id, Account account) {
        Account original = accountsRepository.findById(id).get();
        original.setAccountType(account.getAccountType());
        original.setBalance(account.getBalance());
        original.setAccountNumber(account.getAccountNumber());
        original.setUserId(account.getUserId());
        return accountsRepository.save(original);
    }

    public Account deposit(Double amount, Long accountNumber) {
        Account account = accountsRepository.findAccountByAccountNumber(accountNumber);
        account.setBalance(account.getBalance() + amount);
        Transaction transaction = new Transaction(account.getAccountNumber(), null, "Deposit", amount, account.getUserId());
        transactionRepository.save(transaction);
        return accountsRepository.save(account);
    }

    public Account withdraw(Double amount, Long accountNumber) {
        Account account = accountsRepository.findAccountByAccountNumber(accountNumber);
        account.setBalance(account.getBalance() - amount);
        Transaction transaction = new Transaction(account.getAccountNumber(), null, "Withdraw", amount, account.getUserId());
        transactionRepository.save(transaction);
        return accountsRepository.save(account);
    }

    public Account transfer(Double amount, Long accountOne, Long accountTwo) {
        deposit(amount, accountTwo);
        return withdraw(amount, accountOne);
    }
}