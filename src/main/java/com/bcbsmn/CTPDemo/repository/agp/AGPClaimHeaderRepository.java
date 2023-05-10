package com.bcbsmn.CTPDemo.repository.agp;


import com.bcbsmn.CTPDemo.model.agp.AGPClaimHeader;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AGPClaimHeaderRepository extends JpaRepository<AGPClaimHeader, Long> {
}
