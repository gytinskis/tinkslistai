package com.informer.informer.service;


import com.informer.informer.entity.User;
import com.informer.informer.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InformerService {

    @Autowired
    private UserRepository userRepository;

    public User get(User user) {
        userRepository.save(user);
        return user;
    }

    public Iterable<User> getAllUsers() {
        return userRepository.findAll();
    }
}
