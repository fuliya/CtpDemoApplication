package com.bcbsmn.CTPDemo.repository.agp;


import com.bcbsmn.CTPDemo.model.agp.AGPBenefitPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AGPBenefitPlanRepository extends JpaRepository<AGPBenefitPlan, Long> {
}
