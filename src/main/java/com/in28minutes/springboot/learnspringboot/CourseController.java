package com.in28minutes.springboot.learnspringboot;



import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController
{
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses()
    {
        return Arrays.asList(
                new Course(1, "Learn AWS", "yumeJack"),
                new Course(2, "Learn DevOps", "yumeJack"),
                new Course(3, "Learn GCP", "yumeJack"),
                new Course(4, "Learn Azure", "yumeJack")
        );
    }

}
