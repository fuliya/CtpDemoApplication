package com.bcbsmn.CTPDemo.repository.facet;


import com.bcbsmn.CTPDemo.model.facet.ClaimHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClaimHeaderRepository extends JpaRepository<ClaimHeader, Long> {
}
