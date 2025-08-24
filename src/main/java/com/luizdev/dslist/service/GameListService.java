package com.luizdev.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizdev.dslist.dto.GameListDTO;
import com.luizdev.dslist.entities.GameList;
import com.luizdev.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameListDTO> findAll(){
		List<GameList> entites = gameListRepository.findAll();	
		List<GameListDTO> list = entites.stream().map(x -> new GameListDTO(x)).toList();
		return list;
	}
}
