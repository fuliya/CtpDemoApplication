package com.bcbsmn.CTPDemo.model.agp;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "claim")
public class AGPClaimHeader {
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
