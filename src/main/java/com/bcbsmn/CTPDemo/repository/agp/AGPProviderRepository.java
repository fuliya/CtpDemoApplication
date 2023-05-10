package com.bcbsmn.CTPDemo.repository.agp;


import com.bcbsmn.CTPDemo.model.agp.AGPProvider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AGPProviderRepository extends JpaRepository<AGPProvider, Long> {
}
