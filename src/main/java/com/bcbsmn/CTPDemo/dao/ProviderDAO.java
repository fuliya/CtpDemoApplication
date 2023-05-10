package com.bcbsmn.CTPDemo.dao;

import com.bcbsmn.CTPDemo.model.facet.Provider;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public interface ProviderDAO {
    Optional findOneProvider (long providerID);

    List<Provider> findAllProvider ();
}
