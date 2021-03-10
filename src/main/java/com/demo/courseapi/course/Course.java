package com.demo.courseapi.course;

import com.demo.courseapi.topic.Topic;

public class Course {

	private String id;
	private String name;
	private String desc;
	private Topic topic;

	public Course() {

	}

	public Course(String id, String name, String desc, Topic topic) {
		super();
		this.name = name;
		this.id = id;
		this.desc = desc;
		this.topic = topic;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
}
