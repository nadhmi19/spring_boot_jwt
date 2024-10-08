package org.example.model.study;


import jakarta.persistence.*;

@Entity
@Table(name="course_rating")
public class CourseRating {

    @EmbeddedId
    CourseRatingKey id;

    @ManyToOne
    @MapsId("studentId")
    @JoinColumn(name="student_id")
    private Student student;


    @ManyToOne
    @MapsId("courseId")
    @JoinColumn(name="course_id")
    private Course course;

    int rating;
}
