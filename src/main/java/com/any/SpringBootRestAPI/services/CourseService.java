package com.any.SpringBootRestAPI.services;

import java.util.List;

import com.any.SpringBootRestAPI.entity.Course;

public interface CourseService {

	List<Course> getCourses();

	Course addCourse(Course course);


}
