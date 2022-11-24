package com.lab_for_cloud.lab_for_cloud.service;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;

import com.lab_for_cloud.lab_for_cloud.domain.Country;
import com.lab_for_cloud.lab_for_cloud.repository.CountryRepository;

@AllArgsConstructor
@Service
public class CountryService extends AbstractService<Country, Integer> {
    public CountryRepository countryRepository;

    @Override
    protected JpaRepository<Country, Integer> getRepository() {
        return countryRepository;
    }
}