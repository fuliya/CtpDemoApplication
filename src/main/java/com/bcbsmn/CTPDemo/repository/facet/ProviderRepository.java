package com.bcbsmn.CTPDemo.repository.facet;


import com.bcbsmn.CTPDemo.model.facet.Provider;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProviderRepository extends JpaRepository<Provider, Long> {
}
