package org.example.service.impl;

import org.example.model.study.Course;
import org.example.repo.BaseRepository;
import org.example.repo.studies.CourseRepository;
import org.example.service.CrudBaseService;
import org.example.service.studies.ICourseService;
import org.springframework.stereotype.Service;


@Service
public class CourseService  extends CrudBaseService<Course> implements ICourseService {

    private final CourseRepository courseRepository;

    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public BaseRepository<Course> getRepository() {
        return courseRepository;
    }


}
