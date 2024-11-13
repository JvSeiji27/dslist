package com.joaovitor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaovitor.dslist.dto.GameMinDTO;
import com.joaovitor.dslist.entities.Game;
import com.joaovitor.dslist.repositories.GameRepository;

@Service
public class GameService {
	@Autowired GameRepository gameRepository;
	public List<GameMinDTO> findAll(){
		List<Game> result =  gameRepository.findAll();
		List<GameMinDTO> dto = result.stream().map(x-> new GameMinDTO(x)).toList();
		return dto;
	}
}
