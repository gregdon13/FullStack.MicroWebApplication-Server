package services;

import entities.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import repositories.AccountsRepository;


@RestController
public class AccountService {
    private final AccountsRepository accountsRepository;

    @Autowired
    public AccountService(AccountsRepository accountsRepository) {
        this.accountsRepository = accountsRepository;
    }

    public Iterable<Account> index() {
        return accountsRepository.findAll();
    }

    public Account show(@PathVariable Long id) {
        return accountsRepository.findById(id).get();
    }

    public Account create(Account account) {
        return accountsRepository.save(account);
    }

    public Boolean delete(Account account) {
        accountsRepository.delete(account);
        return true;
    }

    public Account update(@PathVariable Long id, Account account) {
        Account original = accountsRepository.findById(id).get();
        original.setAccountType(account.getAccountType());
        original.setBalance(account.getBalance());
        original.setAccountNumber(account.getAccountNumber());
        original.setUserId(account.getUserId());
        return accountsRepository.save(original);
    }
}
