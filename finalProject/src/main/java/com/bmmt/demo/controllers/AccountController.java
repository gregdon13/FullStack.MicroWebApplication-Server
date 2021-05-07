package com.bmmt.demo.controllers;

import com.bmmt.demo.entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import com.bmmt.demo.services.AccountService;

@RestController
public class AccountController {
    private final AccountService accountService;

    @Autowired
    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }

    @PostMapping("/account")
    public ResponseEntity<Account> create(Account account) {
        return new ResponseEntity<>(accountService.create(account), HttpStatus.CREATED);
    }

    @DeleteMapping("/account/delete/{accountNumber}")
    public ResponseEntity<Boolean> delete(Account account) {
        return new ResponseEntity<>(accountService.delete(account), HttpStatus.OK);
    }

    @GetMapping("/account/all")
    public ResponseEntity<Iterable<Account>> getAll() {
        return new ResponseEntity<>(accountService.index(), HttpStatus.OK);
    }

    @GetMapping("/account/{id}")
    public ResponseEntity<Account> getById(@PathVariable Long id) {
        return new ResponseEntity<>(accountService.show(id), HttpStatus.OK);
    }

    @GetMapping("/account/number/{accountNumber}")
    public ResponseEntity<Account> getByAccountNumber(@PathVariable Long accountNumber) {
        return new ResponseEntity<>(accountService.findByAccountNum(accountNumber), HttpStatus.OK);
    }

    @GetMapping("/account/user/{userId}")
    public ResponseEntity<Iterable<Account>> getAllUserAccounts(@PathVariable Long userId) {
        return new ResponseEntity<>(accountService.findAllUserAccounts(userId), HttpStatus.OK);
    }

    //Individual accounts
    @GetMapping("/account/user/{userId}/{accountName}")
    public ResponseEntity<Account> getUserChecking(@PathVariable Long userId, @PathVariable String accountName) {
        return new ResponseEntity<>(accountService.findOneUserAccount(userId, accountName), HttpStatus.OK);
    }

    @PutMapping("/account/{id}")
    public ResponseEntity<Account> update(@PathVariable Long id, Account account) {
        return new ResponseEntity<>(accountService.update(id, account), HttpStatus.OK);
    }

    @PutMapping("/account/deposit/{accountNumber}")
    public ResponseEntity<Account> depositFunds(@PathVariable Long accountNumber, Double amount) {
        return new ResponseEntity<>(accountService.deposit(amount, accountNumber), HttpStatus.OK);
    }

    @PutMapping("/account/withdraw/{accountNumber}")
    public ResponseEntity<Account> withdrawFunds(@PathVariable Long accountNumber, Double amount) {
        return new ResponseEntity<>(accountService.withdraw(amount, accountNumber), HttpStatus.OK);
    }

    @PutMapping("/account/transfer/{accountOne}/{accountTwo}")
    public ResponseEntity<Account> transferFunds(@PathVariable Long accountOne, @PathVariable Long accountTwo, Double amount) {
        return new ResponseEntity<>(accountService.transfer(amount, accountOne, accountTwo), HttpStatus.OK);
    }
}