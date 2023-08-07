package com.any.SpringBootRestAPI.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.any.SpringBootRestAPI.entity.Course;
import com.any.SpringBootRestAPI.services.CourseService;

@RestController
public class FrontController {
	
	@Autowired
	CourseService courseService;
	
	@GetMapping({"/firstPage","/"})
	public String homePage() {
		return "Hello World";
	}
	
	@GetMapping("/course")
	public List<Course> getCourses(){
		return courseService.getCourses();
	}
	
	@PostMapping("/course")
	public Course addCourse(@RequestBody Course course) {
		 return courseService.addCourse(course);
	}

}
