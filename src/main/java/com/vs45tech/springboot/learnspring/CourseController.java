package com.vs45tech.springboot.learnspring;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class CourseController {
    
    @GetMapping("/courses")
    public List<Course> getCourses(){
        return Arrays.asList(
         new Course(1,"Learn AWS", "VS45"),   
         new Course(2,"Learn Go", "VS45"),   
         new Course(3,"Learn TensorFlow", "VS45") , 
         new Course(4,"Learn DevOps", "VS45")  
      );
    }
    
}
