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

    public User show(Long id) { return userRepository.findById(id).get(); }


    public User update(Long id, User newUser) {
        User original = userRepository.findById(id).get();
        original.setId(newUser.getId());
        original.setUserName(newUser.getUserName());
        original.setAddress(newUser.getAddress());
        original.setOccupation(newUser.getOccupation());
        original.setPassword(newUser.getPassword());
        original.setPhoneNumber(newUser.getPhoneNumber());
        original.setEmail(newUser.getEmail());
        return userRepository.save(original);
    }

    public Boolean delete(Long id) {
        userRepository.deleteById(id);
        return true;
    }
}
