package com.bcbsmn.CTPDemo.dao;

import com.bcbsmn.CTPDemo.model.facet.BenefitPlan;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface BenefitPlanDAO {
    Optional findOneBenefitPlan (long benefitID);

    List<BenefitPlan> findAllBenefitPlan ();
}
