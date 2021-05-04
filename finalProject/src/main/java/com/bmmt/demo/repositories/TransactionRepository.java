package com.bmmt.demo.repositories;

import com.bmmt.demo.entities.Transaction;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends CrudRepository<Transaction, Long> {
    Iterable<Transaction> findAllByUserId(Long userId);
    Iterable<Transaction> findByAccountOne(Long accountOne);
}
