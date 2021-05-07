package com.bmmt.demo.repositories;

import com.bmmt.demo.entities.UserProfile;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<UserProfile, Long> {
}
