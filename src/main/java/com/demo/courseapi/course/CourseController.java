package com.demo.courseapi.course;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CourseController {

	@Autowired
	CourseService courseService;

	@GetMapping("/courseApi")
	public String welcomeToCourse() {
		return "This is course API";
	}

	@RequestMapping(value = "/courses", method = RequestMethod.POST)
	public void createCourse(@RequestBody Course course) {
		courseService.addCourse(course);
	}

	@GetMapping("/courses")
	public List<Course> getCourses() {
		return courseService.getAllCourses();
	}

	@RequestMapping(value = "/courses/{courseId}", method = RequestMethod.DELETE)
	public void deleteCourse(@PathVariable String courseId) {
		courseService.deleteCourse(courseId);
	}

	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId) {
		return courseService.getCourse(courseId);
	}

	@RequestMapping(value = "/courses/{courseId}", method = RequestMethod.PUT)
	public void updateCourse(@PathVariable String courseId, @RequestBody Course course) {
		courseService.updateCourse(courseId, course);
	}

}
