package com.joaovitor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.dslist.dto.GameListDTO;
import com.joaovitor.dslist.entities.GameList;
import com.joaovitor.dslist.repositories.GameListRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	public List<GameListDTO> findAll(){
		List<GameList> gameList = repository.findAll();
		List<GameListDTO> list = gameList.stream().map(x -> new GameListDTO(x)).toList();
		return list;
	}
}
