package com.lab_for_cloud.lab_for_cloud.controller;

import com.lab_for_cloud.lab_for_cloud.DTO.CountryDTO;
import com.lab_for_cloud.lab_for_cloud.domain.Country;
import com.lab_for_cloud.lab_for_cloud.service.AbstractService;
import com.lab_for_cloud.lab_for_cloud.service.CountryService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lab_for_cloud.lab_for_cloud.mapper.AbstractMapper;
import com.lab_for_cloud.lab_for_cloud.mapper.CountryMapper;

@RequestMapping(value = "/country")
@RestController
@AllArgsConstructor
public class CountryController extends AbstractController<Country, CountryDTO, Integer> {
    private final CountryService countryService;
    private final CountryMapper countryMapper;

    @Override
    public AbstractService<Country, Integer> getService() {
        return countryService;
    }

    @Override
    public AbstractMapper<Country, CountryDTO> getMapper() {
        return countryMapper;
    }
}
