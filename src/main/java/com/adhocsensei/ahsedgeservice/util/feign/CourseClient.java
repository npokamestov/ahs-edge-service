package com.adhocsensei.ahsedgeservice.util.feign;

import com.adhocsensei.ahsedgeservice.dto.Course;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "course-service")
public interface CourseClient {

    @GetMapping("/course")
    public List<Course> getAllCourses(@RequestParam(required = false) String title,
                                      @RequestParam(required = false) String category,
                                      @RequestParam(required = false) String location,
                                      @RequestParam(required = false) String date,
                                      @RequestParam(required = false) Long senseiId);

    @GetMapping("/course/{id}")
    public Course getCourseById(@PathVariable Long id);

    @PostMapping("/senseidash/{id}/course")
    public Course createCourse(@PathVariable Long id, @RequestBody Course course);

    @PutMapping("/course/{id}")
    public void updateCourse(@PathVariable Long id, @RequestBody Course course);

    @DeleteMapping("/course/{id}")
    public void deleteCourseById(@PathVariable Long id);
}
