package com.lab_for_cloud.lab_for_cloud.mapper;

import com.lab_for_cloud.lab_for_cloud.DTO.CountryDTO;
import com.lab_for_cloud.lab_for_cloud.domain.Country;
import org.springframework.stereotype.Component;

@Component
public class CountryMapper extends AbstractMapper<Country, CountryDTO> {
    @Override
    public CountryDTO mapObjectToDto (Country country) {
        if (country == null) return null;

        CountryDTO.CountryDTOBuilder countryDTOBuilder = CountryDTO.builder();
        countryDTOBuilder.id(country.getId());
        countryDTOBuilder.name(country.getName());
        countryDTOBuilder.population(country.getPopulation());
        return countryDTOBuilder.build();
    }
}