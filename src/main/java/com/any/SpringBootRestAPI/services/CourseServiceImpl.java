package com.any.SpringBootRestAPI.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.any.SpringBootRestAPI.entity.Course;

@Service
public class CourseServiceImpl implements CourseService {

	List<Course> courseList;

	/*
	 * By initializing courseList in the constructor, the list will be created and
	 * the default course will be added only once when an instance of
	 * CourseServiceImpl is created. Subsequent calls to the addCourse method will
	 * add new courses to the existing courseList.
	 */
	public CourseServiceImpl() {
		courseList = new ArrayList<>();
		courseList.add(new Course(12, "Java", "Learning Java is fun."));
	}

	@Override
	public List<Course> getCourses() {
//		courseList=new ArrayList<>();
//		courseList.add(new Course(12,"Java","Learning Java is fun."));

		return courseList;
	}

	@Override
	public Course addCourse(Course course) {

		courseList.add(course);
		return course;
	}

}
