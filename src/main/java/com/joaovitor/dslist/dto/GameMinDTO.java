package com.joaovitor.dslist.dto;

import com.joaovitor.dslist.entities.Game;
import com.joaovitor.dslist.projections.GameMinProjection;

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
	
	public GameMinDTO(GameMinProjection projection) {
		this.id = projection.getId();
		this.title = projection.getTitle();
		this.year = projection.getGameYear();
		this.url = projection.getImgUrl();
		this.shortDescription = projection.getShortDescription();
		
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
