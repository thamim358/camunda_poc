package com.insurance.claim.service;

import com.insurance.claim.model.Claim;
import com.insurance.claim.repository.ClaimRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClaimService {

    @Autowired
    private ClaimRepository claimRepository;

    public Claim submitClaim(Claim claim) {
        // Business logic for claim submission
        return claimRepository.save(claim);
    }

    public List<Claim> getAllClaims() {
        return claimRepository.findAll();
    }

    public Claim approveClaim(Long id) {
        // Business logic for claim approval
        Claim claim = claimRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Invalid claim ID"));
        claim.setClaimApproved(true);
        return claimRepository.save(claim);
    }
}
