package com.joaovitor.dslist.dto;

import org.springframework.beans.BeanUtils;

import com.joaovitor.dslist.entities.Game;

//Deve retornar DTO mesmo sendo igual por padronização, e evitar usar entidades
//Pode causar loops
public class GameDTO {
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String url;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO() {
		
	}
	//Macete para copiar os dados de uma classe a outra, deve ter o nome dos atributos igual
	public GameDTO(Game game) {
		BeanUtils.copyProperties(game, this);
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getPlatforms() {
		return platforms;
	}
	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}
	public Double getScore() {
		return score;
	}
	public void setScore(Double score) {
		this.score = score;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getShortDescription() {
		return shortDescription;
	}
	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}
	public String getLongDescription() {
		return longDescription;
	}
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}
	
	
}
