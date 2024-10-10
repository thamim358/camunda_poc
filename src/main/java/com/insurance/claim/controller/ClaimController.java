package com.insurance.claim.controller;

import com.insurance.claim.model.Claim;
import com.insurance.claim.model.Policy;
import com.insurance.claim.repository.PolicyRepository;
import com.insurance.claim.service.ClaimService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/claims")
public class ClaimController {

    @Autowired
    private ClaimService claimService;

    // Endpoint to submit a new claim
    @PostMapping("/submit")
    public Claim submitClaim(@RequestBody Claim claim) {
        return claimService.submitClaim(claim);
    }

    // Endpoint to get all claims
    @GetMapping("/all")
    public List<Claim> getAllClaims() {
        return claimService.getAllClaims();
    }

    // Endpoint to approve a claim
    @PutMapping("/approve/{id}")
    public Claim approveClaim(@PathVariable Long id) {
        return claimService.approveClaim(id);
    }
    @Autowired
    private PolicyRepository policyRepository;

    @GetMapping("/policies")
    public List<Policy> getPolicies() {
        return policyRepository.findAll();
    }
}
