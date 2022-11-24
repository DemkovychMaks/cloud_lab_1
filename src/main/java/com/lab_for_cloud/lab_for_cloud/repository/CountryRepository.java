package com.lab_for_cloud.lab_for_cloud.repository;

import com.lab_for_cloud.lab_for_cloud.domain.Country;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountryRepository extends JpaRepository<Country, Integer> {
}
