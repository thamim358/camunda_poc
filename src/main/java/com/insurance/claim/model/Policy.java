package com.insurance.claim.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "policies_export")
public class Policy {

    @Id
    private Long policy_id;
    private String policy_name;

    // Getters and Setters
    public Long getPolicy_id() {
        return policy_id;
    }

    public void setPolicy_id(Long policy_id) {
        this.policy_id = policy_id;
    }

    public String getPolicyname() {
        return policy_name;
    }

    public void setPolicyname(String policy_name) {
        this.policy_name = policy_name;
    }
}
