package com.lab_for_cloud.lab_for_cloud.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor

public class UserDTO {
    private Integer id;
    private String firstName;
    private String lastName;
    private Integer age;
    private String birthday;
    private String email;
    private Integer countryId;
    private Integer libraryId;
}
