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

    @PutMapping("/account/{id}")
    public ResponseEntity<Account> update(@PathVariable Long id, Account account) {
        return new ResponseEntity<>(accountService.update(id, account), HttpStatus.OK);
    }
}