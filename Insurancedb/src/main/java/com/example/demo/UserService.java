package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<UserEntity>showAll(){
    	return userRepository.findAll();
    }
    
    public void register(UserEntity userentity) {
    	userRepository.save(userentity);
    }
}
