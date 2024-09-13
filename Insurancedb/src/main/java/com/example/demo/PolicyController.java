package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class PolicyController {

    @Autowired
    private PolicyService policyservice;

    @GetMapping(value="/getPolicy")
    public List<Policy> getAllPolicies() {
        return policyservice.getAllPolicies();
    }

    @PostMapping(value="/createPolicy")
    public void createPolicy(@RequestBody Policy policy) {
        policyservice.createPolicy(policy);
    }
    @PutMapping(value="/updatePolicy/{id}")
    public void updatePolicy(@PathVariable Long id, @RequestBody Policy policy) {
        policy.setId(id);
        policyservice.updatePolicy(id,policy);
    }
}