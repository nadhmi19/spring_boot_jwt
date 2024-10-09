package org.example.model.study;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;
import org.example.model.EntityBase;

import java.util.Set;

@Entity
@Table(name="course")
@Getter
@Setter
public class Course extends EntityBase {

    @OneToMany(mappedBy="course")
    Set<CourseRating> ratings;

    @Column(name="name",length = 30)
    String name;

    @Column(name="description",length = 40)
    String description;

}
