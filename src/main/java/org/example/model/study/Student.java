package org.example.model.study;


import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.example.model.User;

import java.util.Set;

@Entity
@Table(name="student")
@Getter
@Setter
@SequenceGenerator(name = "student_seq", sequenceName = "student_seq", allocationSize = 1)
@DiscriminatorValue("student")
public class Student extends User {

    @OneToMany(mappedBy="student")
    Set<CourseRating> ratings;
    private int year;
}
