
package com.insurance.claim.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.insurance.claim.service.CamundaTaskService;

@RestController
@RequestMapping("/api/camunda")
public class CamundaController {

    @Autowired
    private CamundaTaskService camundaTaskService;

    @GetMapping("/tasks")
    public String getCamundaTasks() {
        return camundaTaskService.getTasks();
    }
}
