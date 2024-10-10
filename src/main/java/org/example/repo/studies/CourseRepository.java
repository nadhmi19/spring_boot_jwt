package org.example.repo.studies;

import org.example.model.study.Course;
import org.example.repo.BaseRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CourseRepository extends BaseRepository<Course> {

    Optional<Course> findCourseByName(String name);
    Optional<Course> findByDescription(String name);

}
