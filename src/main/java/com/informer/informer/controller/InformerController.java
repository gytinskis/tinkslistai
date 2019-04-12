package com.informer.informer.controller;

import com.informer.informer.entity.User;
import com.informer.informer.service.InformerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class InformerController {

    @Autowired
    private InformerService informerService;

    @RequestMapping("/hi")
    public User getHello() {
        return informerService.get(new User("Gytis"));
    }


    @RequestMapping("/all")
    public Iterable<User> getAllUsers() {
        return informerService.getAllUsers();
    }

}
