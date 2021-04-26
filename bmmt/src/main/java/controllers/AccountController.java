package controllers;

<<<<<<< HEAD
import entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import services.AccountService;

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

    @PutMapping("/account/{id}")
    public ResponseEntity<Account> update(@PathVariable Long id, Account account) {
        return new ResponseEntity<>(accountService.update(id, account), HttpStatus.OK);
    }
=======
public class AccountController {
>>>>>>> 93289fb49a00e1b7e661fb905cb5e4107c5f1968
}
