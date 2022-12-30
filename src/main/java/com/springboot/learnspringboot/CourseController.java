package com.springboot.learnspringboot;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {

    // courses
    // Course: id, name,author
    @RequestMapping("/courses")
    public List<Course> getAllCourses(){
        return Arrays.asList(
                new Course(1, "Learn AWS", "author1"),
                new Course(2, "Learn DevOps", "author1"),
                new Course(2, "Learn Azure", "author2"),
                new Course(2, "Learn Kube", "author2")

        );
    }

}
