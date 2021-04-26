package com.bmmt.demo.services;

import com.bmmt.demo.entities.User;
import com.bmmt.demo.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) { this.userRepository = userRepository;
    }

    public Iterable<User> index() {return userRepository.findAll();}

    public User create(User user) { return userRepository.save(user);
    }
}
