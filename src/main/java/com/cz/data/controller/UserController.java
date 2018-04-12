package com.cz.data.controller;

import com.cz.data.dao.UserRepository;
import com.cz.data.model.T_User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class UserController {

    @Autowired
    private UserRepository userRepository;


    @RequestMapping(path = "/add")
    public void addUser(@RequestParam String name, @RequestParam String email){
        T_User t = new T_User();
        t.setEmail(email);
        t.setName(name);
        userRepository.save(t);
    }

    @ResponseBody
    @RequestMapping(path = "findAll")
    public Iterable<T_User> getAllUser(){
        return  userRepository.findAll();
    }

}
