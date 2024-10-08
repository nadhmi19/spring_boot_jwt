package org.example.model.study;


import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import org.example.model.EntityBase;

import java.util.Set;

@Entity
@Table(name="course")
public class Course extends EntityBase {

    @OneToMany(mappedBy="course")
    Set<CourseRating> ratings;
}
