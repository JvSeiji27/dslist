package com.joaovitor.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.joaovitor.dslist.dto.GameListDTO;
import com.joaovitor.dslist.entities.GameList;
import com.joaovitor.dslist.projections.GameMinProjection;
import com.joaovitor.dslist.repositories.GameListRepository;
import com.joaovitor.dslist.repositories.GameRepository;

@Service
public class GameListService {
	
	@Autowired
	private GameListRepository repository;
	
	@Autowired
	private GameRepository gameRepository;
	
	public List<GameListDTO> findAll(){
		List<GameList> gameList = repository.findAll();
		List<GameListDTO> list = gameList.stream().map(x -> new GameListDTO(x)).toList();
		return list;
	}
	
	@Transactional
	public void move (Long listId, int sourceIndex, int destinationIndex ) {
		List<GameMinProjection> list = gameRepository.searchByList(listId);
		GameMinProjection obj = list.remove(sourceIndex);
		list.add(destinationIndex, obj);
		int min = sourceIndex < destinationIndex ? sourceIndex : destinationIndex;
		int max = sourceIndex > destinationIndex ? sourceIndex : destinationIndex;
		
		for(int i=min; i<=max; i++) {
			repository.updateBelongingPosition(listId, list.get(i).getId(), i);
		}
	}
}
