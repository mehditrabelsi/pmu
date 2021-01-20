package com.pmudemo.service;

import java.util.Map;
import java.util.stream.Collectors;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.pmudemo.model.Course;
import com.pmudemo.model.Participant;

@Service
public class ParticipantsServiceImpl implements IParticipantsService {

	private static final Logger logger = LogManager.getLogger(ParticipantsServiceImpl.class);

	private final String uri = "https://online.turfinfo.api.pmu.fr/rest/client/1/programme/18092020/R5/C6/participants?specialisation=INTERNET";

	@Override
	public Course getParticipants() {
		logger.info("getParticipants");
		RestTemplate restTemplate = new RestTemplate();
		Course result = restTemplate.getForObject(uri, Course.class);
		return result;
	}

	@Override
	public Map<String, Long> coutHorsesBySex(Course course) {
		logger.info("coutHorsesBySex");
		Map<String, Long> groupByGenderList = null;
		if (course != null && course.getParticipants() != null) {

			groupByGenderList = course.getParticipants().stream().filter(p -> p.getSexe() != null)
					.collect(Collectors.groupingBy(Participant::getSexe, Collectors.counting()));
		}
		return groupByGenderList;
	}

	@Override
	@Cacheable("result")
	public Map<String, Long> resultExercice() {
		logger.info("resultExercice");
		return coutHorsesBySex(getParticipants());
	}
}
