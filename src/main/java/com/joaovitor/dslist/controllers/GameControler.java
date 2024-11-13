package com.joaovitor.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaovitor.dslist.dto.GameDTO;
import com.joaovitor.dslist.dto.GameMinDTO;
import com.joaovitor.dslist.services.GameService;

import jakarta.websocket.server.PathParam;

@RestController
@RequestMapping(value = "/games")
public class GameControler {
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public List<GameMinDTO> findAll(){
		List<GameMinDTO> result = gameService.findAll();
		return result;	
	}
	
	@GetMapping("/{id}")
	public GameDTO findById(@PathVariable Long id) {
		GameDTO result = gameService.findById(id);
		return result;
	}
}
