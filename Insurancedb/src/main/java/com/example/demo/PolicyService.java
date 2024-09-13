package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PolicyService {

    @Autowired
    private PolicyRepository policyRepository;

    public List<Policy> getAllPolicies() {
        return policyRepository.findAll();
    }

    public void createPolicy(Policy policy) {
        policyRepository.save(policy);
    }

    public void updatePolicy(Long id,Policy policy) {
        policyRepository.save(policy);
    }
}

