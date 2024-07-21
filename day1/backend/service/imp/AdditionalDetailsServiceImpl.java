package com.example.billingbackend.service.imp;


import com.example.billingbackend.entity.AdditionalDetailsEntity;
import com.example.billingbackend.repository.AdditionalDetailsRepository;
import com.example.billingbackend.service.AdditionalDetailsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AdditionalDetailsServiceImpl implements AdditionalDetailsService {
    AdditionalDetailsRepository AdditionalDetailsRepository;

    @Override
    public AdditionalDetailsEntity addDetails(AdditionalDetailsEntity additionalDetailsEntity) {
        return AdditionalDetailsRepository.save(additionalDetailsEntity);
    }

    @Override
    public List<AdditionalDetailsEntity> getDetails() {
        return AdditionalDetailsRepository.findAll();
    }
}
