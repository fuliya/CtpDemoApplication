package com.bcbsmn.CTPDemo.dao;

import com.bcbsmn.CTPDemo.model.facet.ClaimHeader;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ClaimHeaderDAO {
    Optional findOneClaim (long claimID);

    List<ClaimHeader> findAllClaim ();
}
