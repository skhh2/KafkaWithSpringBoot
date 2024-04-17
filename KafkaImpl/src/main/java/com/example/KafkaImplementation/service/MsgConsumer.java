package com.example.KafkaImplementation.service;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class MsgConsumer {
	
	@KafkaListener(topics ="kafka_topic", groupId = "KafkagroupId")
	public void receiveMsgFromTopic(String receivedMsg) {
		System.out.println("Message Received from topic "+ receivedMsg);
	}

}
