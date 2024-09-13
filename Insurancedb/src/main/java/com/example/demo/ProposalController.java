package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class ProposalController {

    @Autowired
    private ProposalService proposalService;

    @PostMapping(value="/submitProposal")
    public void submitProposal(@RequestBody Proposal proposal) {
        proposalService.submitProposal(proposal);
    }

    @GetMapping("/getProposal")
    public List<Proposal> getProposals(){
        return proposalService.getProposals();
    }

    @PutMapping("/updateProposal")
    public void updateProposal(@RequestBody Proposal proposal) {
        proposalService.updateProposal(proposal);
    }
}
