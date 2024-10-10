package com.insurance.claim.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class ClaimValidationDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        String coverage = (String) execution.getVariable("coverage");
        boolean isValid = coverage.equals("FULL_COVERAGE");
        execution.setVariable("isClaimValid", isValid);
    }
}
