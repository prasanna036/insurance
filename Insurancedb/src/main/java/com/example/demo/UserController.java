package com.example.demo;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping(value="/showUser")
    public List<UserEntity> showUser(){
    	return userService.showAll();
    }
    
    @PostMapping(value="/Register")
    public void Register(@RequestBody UserEntity userentity) {
    	userService.register(userentity);
    }
}

