package com.ptg.restapplication.rest;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController {
	@Value("${team.name}")
	private String teamName;

	@Value("${team.captain}")
	private String teamCaptain;

	@GetMapping("/")
	public String sayHello() {
		return "Hello! The time is: " + LocalDateTime.now();
	}

	@GetMapping("/workout")
	public String getDailyWorkout() {
		return "Run a 5k";
	}

	@GetMapping("/team")
	public String getTeamDetails() {
		return "Team: " + teamName + ", Captain: " + teamCaptain;
	}

}
