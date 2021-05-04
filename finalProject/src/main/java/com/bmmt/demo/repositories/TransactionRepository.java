package com.bmmt.demo.repositories;

import com.bmmt.demo.entities.Transaction;
import org.springframework.data.repository.CrudRepository;

public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    Iterable<Transaction> findAllByUserId(Long userId);
}
