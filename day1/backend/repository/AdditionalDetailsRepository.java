package com.example.billingbackend.repository;

import com.example.billingbackend.entity.AdditionalDetailsEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdditionalDetailsRepository extends JpaRepository<AdditionalDetailsEntity, Long> {
}
