package com.example.demo;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProposalService {

    @Autowired
    private ProposalRepository proposalRepository;

    public void submitProposal(Proposal proposal) {
        proposal.setSubmittedAt(LocalDateTime.now());
        proposal.setStatus("Proposal Submitted");
        proposalRepository.save(proposal);
    }

    public List<Proposal> getProposals() {
        return proposalRepository.findAll();
    }

    public Proposal updateProposal(Proposal proposal) {
        return proposalRepository.save(proposal);
    }
}
