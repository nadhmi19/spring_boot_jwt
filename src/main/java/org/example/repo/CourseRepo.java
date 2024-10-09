package org.example.repo;


import org.example.dto.studies.CourseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Component
public class CourseRepo {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Transactional(propagation = Propagation.REQUIRED)
    public void save(CourseDto course){
        String sql = "INSERT INTO Course VALUES (?,?)";
        Object args[] = {course.getName(),course.getDescription()};
        jdbcTemplate.update(sql,args);
    }
}
