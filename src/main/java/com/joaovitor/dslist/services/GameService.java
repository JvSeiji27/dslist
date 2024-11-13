package com.joaovitor.dslist.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaovitor.dslist.dto.GameDTO;
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
	
	//findById retorna um optional!
	@Transactional(readOnly = true)
	public GameDTO findById(Long id) {
		Game result = gameRepository.findById(id).get();
		GameDTO dto = new GameDTO(result);
		return dto;
	}
}
