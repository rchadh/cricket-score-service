package com.cricket.score.service.impl;

import javax.validation.ValidationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import com.cricket.score.service.ICricketScoreService;
import com.cricket.score.service.models.CricketScore;


public class CricketScoreServiceImpl implements ICricketScoreService {
	

	@Value("${cricket.score.api.url}")
	private String apiURL;

	@Value("${cricket.score.api.key}")
	private String apiKey;
	
	private static final Logger logger = LoggerFactory.getLogger(CricketScoreServiceImpl.class);
	

    @Override
    public CricketScore getCricketScore(String id) {
    	if (!validParameters(id)) {
    		throw new ValidationException("Invalid Parameters for ID");
    	}
    	RestTemplate restTemplate = new RestTemplate();
    	return  restTemplate.getForObject(getURL(apiURL, id, apiKey), CricketScore.class);
    }

    private String getURL(String apiURL, String id, String apiKey) {
    	
    	System.out.println (" Cric API Backend------------" + String.format(apiURL, id, apiKey));
    	return String.format(apiURL, id, apiKey);
    }
    
    private boolean validParameters(String id) {
		return id != null && !"".equals(id) && apiKey != null && !"".equals(apiKey) && apiURL != null
				&& !"".equals(apiURL);
	}
	
	

}
