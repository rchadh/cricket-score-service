package com.cricker.score.service.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cricket.score.service.ICricketScoreService;
import com.cricket.score.service.models.CricketScore;


@RestController
@RequestMapping("/cricket")
public class CricketScoreController {
	
	private final ICricketScoreService cricketScoreService;
	private CricketScore cricketScore;
	
	public CricketScoreController(ICricketScoreService cricketScoreService) {
		this.cricketScoreService = cricketScoreService;

	}
	
	@GetMapping(path = "/score/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public CricketScore getCricketScoreSummary(@PathVariable String id) {
		
		//WeatherForecastResponse apiResponse = new WeatherForecastResponse();

		System.out.println ("Inside Controller------------>>");
		cricketScore = cricketScoreService.getCricketScore(id);

		//apiResponse = translateWeatherForecastResponse(weatherForecast, apiResponse);

		return cricketScore;
	}

	
}