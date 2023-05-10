package com.bcbsmn.CTPDemo.dao.impl;


import com.bcbsmn.CTPDemo.dao.ClaimHeaderDAO;
import com.bcbsmn.CTPDemo.model.facet.ClaimHeader;
import com.bcbsmn.CTPDemo.repository.facet.ClaimHeaderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClaimHeaderImpl implements ClaimHeaderDAO {

    @Autowired
    private ClaimHeaderRepository claimHeaderRepository;
    @Override
    public Optional findOneClaim(long claimID) {
        return claimHeaderRepository.findById(claimID);
    }

    @Override
    public List<ClaimHeader> findAllClaim() {
        return (List<ClaimHeader>)claimHeaderRepository.findAll();
    }
}
