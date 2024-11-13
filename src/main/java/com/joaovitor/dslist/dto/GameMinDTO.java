package com.joaovitor.dslist.dto;

import com.joaovitor.dslist.entities.Game;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class GameMinDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String url;
	private String shortDescription;
	
	public GameMinDTO() {
		
	}

	public GameMinDTO(Game game) {
		this.id = game.getId();
		this.title = game.getTitle();
		this.year = game.getYear();
		this.url = game.getUrl();
		this.shortDescription = game.getShortDescription();
		
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getUrl() {
		return url;
	}

	public String getShortDescription() {
		return shortDescription;
	}
	


}
