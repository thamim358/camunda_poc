package com.insurance.claim.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@Service
public class CamundaTaskService {

    private static final String CAMUNDA_API_URL = "http://localhost:8080/engine-rest/task";  // Replace if necessary

    @Autowired
    private RestTemplate restTemplate;

    public String getTasks() {
        ResponseEntity<String> response = restTemplate.getForEntity(CAMUNDA_API_URL, String.class);
        
        // The response will be in JSON format
        if (response.getStatusCode().is2xxSuccessful()) {
            return response.getBody();
        } else {
            throw new RuntimeException("Failed to fetch tasks from Camunda API");
        }
    }
}
