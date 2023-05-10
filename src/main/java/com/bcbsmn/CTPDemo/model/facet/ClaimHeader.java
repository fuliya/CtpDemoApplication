package com.bcbsmn.CTPDemo.model.facet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data
public class ClaimHeader {
    @Id
    private long claimID;
    private double billedAmount;
    private double paidAmount;
    private double memberResponsibility;
    private double providerResponsibility;
    private long memberID;
    private long providerID;
    private long benefitID;
}
