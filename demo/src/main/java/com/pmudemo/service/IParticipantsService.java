package com.pmudemo.service;

import java.util.Map;

import com.pmudemo.model.Course;

public interface IParticipantsService {

	public Course getParticipants();
	
	public Map<String, Long> coutHorsesBySex(Course course);
	
	public Map<String, Long> resultExercice();

}
