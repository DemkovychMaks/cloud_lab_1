package com.lab_for_cloud.lab_for_cloud.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class CountryDTO {
    private Integer id;
    private String name;
    private Integer population;
}
