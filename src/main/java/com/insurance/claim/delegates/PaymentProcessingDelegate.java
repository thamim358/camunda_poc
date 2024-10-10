package com.insurance.claim.delegates;

import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Component
public class PaymentProcessingDelegate implements JavaDelegate {

    @Override
    public void execute(DelegateExecution execution) throws Exception {
        // Simulate payment processing logic
        System.out.println("Processing payment for claim...");
        execution.setVariable("paymentProcessed", true);
    }
}
