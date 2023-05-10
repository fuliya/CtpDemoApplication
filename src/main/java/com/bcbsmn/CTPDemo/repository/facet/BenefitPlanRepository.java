package com.bcbsmn.CTPDemo.repository.facet;


import com.bcbsmn.CTPDemo.model.facet.BenefitPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BenefitPlanRepository extends JpaRepository<BenefitPlan, Long> {
}
