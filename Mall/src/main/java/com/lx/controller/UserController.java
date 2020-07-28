package com.lx.controller;

import com.lx.domain.User;
import com.lx.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping("{id}")
    @ResponseBody
    public User findById(@PathVariable("id") Long id){
        return service.findById(id);
    }

}
