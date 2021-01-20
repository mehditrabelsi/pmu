package com.pmudemo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pmudemo.service.IParticipantsService;

@RestController
@RequestMapping(path = "/pmu")
public class CourseController {
	
	@Autowired
	private IParticipantsService participantsService;

	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/info")
	public Map<String, Long> info() {
		return participantsService.resultExercice();
	}

}
