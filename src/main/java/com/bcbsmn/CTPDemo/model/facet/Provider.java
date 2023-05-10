package com.bcbsmn.CTPDemo.model.facet;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import org.springframework.stereotype.Component;

@Entity
@Component
@Data
public class Provider {

    @Id
    private long providerID;
}
