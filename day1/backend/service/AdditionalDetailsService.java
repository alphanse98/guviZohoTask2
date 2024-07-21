package com.example.billingbackend.service;

import com.example.billingbackend.entity.AdditionalDetailsEntity;

import java.util.List;

public interface AdditionalDetailsService {

    AdditionalDetailsEntity addDetails (AdditionalDetailsEntity additionalDetailsEntity);

    List<AdditionalDetailsEntity> getDetails ( );
}
