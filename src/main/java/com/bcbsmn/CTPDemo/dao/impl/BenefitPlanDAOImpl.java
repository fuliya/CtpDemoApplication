package com.bcbsmn.CTPDemo.dao.impl;


import com.bcbsmn.CTPDemo.dao.BenefitPlanDAO;
import com.bcbsmn.CTPDemo.model.facet.BenefitPlan;
import com.bcbsmn.CTPDemo.repository.facet.BenefitPlanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BenefitPlanDAOImpl implements BenefitPlanDAO {

    @Autowired
    private BenefitPlanRepository benefitPlanRepository;
    @Override
    public Optional findOneBenefitPlan(long benefitID) {
        return benefitPlanRepository.findById(benefitID);
    }

    @Override
    public List<BenefitPlan> findAllBenefitPlan() {
        return (List<BenefitPlan>) benefitPlanRepository.findAll();
    }
}
