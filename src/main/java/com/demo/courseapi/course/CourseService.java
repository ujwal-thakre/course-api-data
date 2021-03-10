package com.demo.courseapi.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.demo.courseapi.topic.Topic;

@Service
public class CourseService {

	List<Course> courseList = new ArrayList<>(Arrays.asList(
			new Course("1", "Java", "Core Java Course", new Topic("1", "Basic", "Instroduction & Features")),
			new Course("2", "Python", "Python Foundation Course",
					new Topic("1", "Intermedidate", "Installation & Code walkthrough")),
			new Course("3", "Ml", "Machine Learning Course", null)));

	public List<Course> getAllCourses() {
		return courseList;
	}

	public void deleteCourse(String courseId) {
		courseList.stream().collect(Collectors.toList()).removeIf(c -> c.getId().equals(courseId));
	}

	public Course getCourse(String courseId) {
		return courseList.stream().filter(c -> c.getId().equals(courseId)).collect(Collectors.toList()).get(0);

	}

	public void addCourse(Course course) {
		courseList.add(course);
		System.out.println("Course added successfully");
	}

	public void updateCourse(String courseId, Course course) {
		if (courseList.removeIf(c -> c.getId().equals(courseId))) {
			courseList.add(course);
		}
	}
}
