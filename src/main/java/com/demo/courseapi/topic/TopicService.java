package com.demo.courseapi.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	List<Topic> topicList = new ArrayList<>(Arrays.asList(

			new Topic("1", "Java Class", "Blueprint"), new Topic("2", "Java Interface", "Method Declaration"),
			new Topic("3", "Java Collection", "Collection API"), new Topic("4", "Java Scropt", "Collection API")));

	List<Topic> getTopics() {
		return topicList;
	}

	public Topic getTopic(String topicId) {
		for (Topic topic : topicList) {
			if (topic.getId().equals(topicId)) {
				return topic;
			}
		}
		return null;
	}

	public void updateTopic(String topicId, Topic topic) {
		for (Topic t : topicList) {
			if (topicId.equals(t.getId())) {
				t.setName(topic.getName());
				t.setDescription(topic.getDescription());
			}
		}
	}

	public void createTopic(Topic topic) {
		topicList.add(new Topic(topic.getId(), topic.getName(), topic.getDescription()));
	}
}
