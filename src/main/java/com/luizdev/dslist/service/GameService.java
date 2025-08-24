package com.luizdev.dslist.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizdev.dslist.dto.GameDTO;
import com.luizdev.dslist.dto.GameMinDTO;
import com.luizdev.dslist.entities.Game;
import com.luizdev.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;
	
	public List<GameMinDTO> findAll(){
		List<Game> entidades_games = gameRepository.findAll();
		List<GameMinDTO> entidades = entidades_games.stream().map(x -> new GameMinDTO(x)).toList();		
		return entidades;
	}
	
	public GameDTO findById(Long id) {
		Optional<Game> obj = gameRepository.findById(id);
		return new GameDTO(obj.get());
	}
}
