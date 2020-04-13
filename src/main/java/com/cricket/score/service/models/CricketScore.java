package com.cricket.score.service.models;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonSetter;

@JsonInclude(JsonInclude.Include.NON_EMPTY)
@JsonIgnoreProperties(ignoreUnknown = true)

public class CricketScore implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String stat;
	String score;
	String description;
	String team1;
	String team2;
	public String getStat() {
		return stat;
	}

	@JsonSetter("stat")
	public void setStat(String stat) {
		this.stat = stat;
	}
	public String getScore() {
		return score;
	}
	
	@JsonSetter("score")
	public void setScore(String score) {
		this.score = score;
	}
	public String getDescription() {
		return description;
	}
	
	@JsonSetter("description")
	public void setDescription(String description) {
		this.description = description;
	}
	public String getTeam1() {
		return team1;
	}
	
	@JsonSetter("team-1")
	public void setTeam1(String team1) {
		this.team1 = team1;
	}
	public String getTeam2() {
		return team2;
	}
	
	@JsonSetter("team-2")
	public void setTeam2(String team2) {
		this.team2 = team2;
		
		
	}
	
	   

}
