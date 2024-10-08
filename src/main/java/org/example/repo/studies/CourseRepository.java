package org.example.repo.studies;

import org.example.model.study.Course;
import org.example.repo.BaseRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRepository extends BaseRepository<Course> {
}
