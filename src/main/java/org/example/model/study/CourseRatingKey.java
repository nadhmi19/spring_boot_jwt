package org.example.model.study;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;


@Embeddable
public class CourseRatingKey {


    @Column(name="student_id")
    Long studentId;


    @Column(name="course_id")
    Long courseId;

}
