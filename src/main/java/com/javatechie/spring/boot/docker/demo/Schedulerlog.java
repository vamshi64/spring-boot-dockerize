package com.javatechie.spring.boot.docker.demo;

import java.time.LocalDateTime;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@EnableScheduling
public class Schedulerlog {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(Schedulerlog.class);
	@Scheduled(fixedRate=1000)
	public void reportCurrentTime(){
		LOGGER.info("The time is now {}", LocalDateTime.now());
	}

}
