package com.joaovitor.dslist.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.joaovitor.dslist.dto.GameListDTO;
import com.joaovitor.dslist.services.GameListService;

@RestController
@RequestMapping("/lists")
public class GameListController {
	
	@Autowired
	private GameListService service;
	
	@GetMapping
	public List<GameListDTO> findAll(){
		List<GameListDTO> list = service.findAll();
		return list;
	}
	
}
