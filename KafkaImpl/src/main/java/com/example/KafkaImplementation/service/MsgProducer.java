package com.example.KafkaImplementation.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class MsgProducer {
	@Autowired
	private KafkaTemplate<String , String> kafkaTemplate;
	
	public void msgToTopic(String message) {
		
		kafkaTemplate.send("kafka_topic", message);
	
	
	}
}
