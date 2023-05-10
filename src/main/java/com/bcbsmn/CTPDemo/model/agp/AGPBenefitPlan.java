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
@Table(name = "agpbenefitplan")
public class AGPBenefitPlan {
    @Id
    private long benefitPlanID;
}
