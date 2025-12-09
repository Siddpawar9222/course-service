package com.techeazy.courseservice;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/courses")
public class CourseController {

    private static final List<Course> COURSE_LIST = List.of(
            new Course(1L, 1L, "Java"),
            new Course(2L, 1L, "Kubernetes"),
            new Course(3L, 2L, "Spring Boot"),
            new Course(4L, 3L, "AWS Cloud")
    );

    @GetMapping("/student/{id}")
    public List<Course> getCoursesByStudent(@PathVariable Long id) {
        return COURSE_LIST.stream()
                .filter(c -> c.getStudentId().equals(id))
                .toList();
    }
}
