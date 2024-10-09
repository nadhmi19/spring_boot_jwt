package org.example.dto.studies;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@AllArgsConstructor
public class CourseDto {

    @NotBlank
    private String name;

    @NotBlank
    private String description;
}
