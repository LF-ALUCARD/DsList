package com.luizdev.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizdev.dslist.entities.GameList;
import com.luizdev.dslist.repositories.GameListRepository;

@Service
public class GameListService {

	@Autowired
	private GameListRepository gameListRepository;
	
	public List<GameList> findAll(){
		List<GameList> entites = gameListRepository.findAll();	
		return entites;
	}
}
