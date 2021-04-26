package com.bmmt.demo.repositories;

import com.bmmt.demo.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {
}
