package com.demo.courseapi.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {

	@Autowired
	TopicService topicervice;

	@GetMapping("/topicTest")
	public String testTopic() {
		return "This is from topic controller !!";
	}

	@GetMapping("/topics")
	public List<Topic> getTopics() {
		return topicervice.getTopics();
	}

	@GetMapping("topics/{topicId}")
	public Topic getTopic(@PathVariable String topicId) {
		return topicervice.getTopic(topicId);
	}

	@RequestMapping(method = RequestMethod.PUT, value = "topics/{topicId}")
	public void updateTopic(@PathVariable String topicId, @RequestBody Topic topic) {
		topicervice.updateTopic(topicId, topic);

	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/topics")
	public void createTopic(@RequestBody Topic topic) {
		topicervice.createTopic(topic);

	}
}
