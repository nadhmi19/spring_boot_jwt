package org.example.service.impl;

import org.example.dto.studies.CourseDto;
import org.example.model.study.Course;
import org.example.repo.BaseRepository;
import org.example.repo.CourseRepo;
import org.example.repo.studies.CourseRepository;
import org.example.service.CrudBaseService;
import org.example.service.studies.ICourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Service
public class CourseService  extends CrudBaseService<Course> implements ICourseService {

    private final CourseRepository courseRepository;
    @Autowired
    private CourseRepo courseRepo;


    public CourseService(CourseRepository courseRepository) {
        this.courseRepository = courseRepository;
    }

    @Override
    public BaseRepository<Course> getRepository() {
        return courseRepository;
    }


    // By default propagation level is required : create new connection ==> getConnection
    // no other connection gets created
    // creating new connection
    @Transactional(propagation= Propagation.REQUIRES_NEW)
    public void createCourse(CourseDto courseDto) {
            for(int i=0;i<=3;i++){
                Course c = new Course();
                c.setName(courseDto.getName());
                c.setDescription(courseDto.getDescription());
                save(c);
            }
    }


    public void saveCourse(CourseDto course){
        for(int i=0;i<=3;i++){
            courseRepo.save(course);
    }}
}
