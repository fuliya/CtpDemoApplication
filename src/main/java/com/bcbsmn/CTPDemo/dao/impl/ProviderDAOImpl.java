package com.bcbsmn.CTPDemo.dao.impl;


import com.bcbsmn.CTPDemo.dao.ProviderDAO;
import com.bcbsmn.CTPDemo.model.facet.Provider;
import com.bcbsmn.CTPDemo.repository.facet.ProviderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProviderDAOImpl implements ProviderDAO {

    @Autowired
    private ProviderRepository providerRepository;
    @Override
    public Optional findOneProvider(long providerID) {
        return providerRepository.findById(providerID);
    }

    @Override
    public List<Provider> findAllProvider() {
        return (List<Provider>) providerRepository.findAll();
    }
}
