package com.example.KafkaImplementation.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.KafkaImplementation.service.MsgProducer;

@RestController
@RequestMapping("/restapi/v1/")
public class RestControllerForKafka {

	@Autowired
	MsgProducer producer;
	
	@GetMapping(value ="/producer")
		public String kafkaGetMsg(@RequestParam("message") String message) {
			producer.msgToTopic(message);
			return "Msg is sent successfully to topic";
			
		}
	
}
