package com.lab_for_cloud.lab_for_cloud.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class SingerDTO {
    private Integer id;
    private String name;
    private Integer age;
    private Integer countryId;
}
