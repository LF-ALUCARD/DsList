package com.luizdev.dslist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizdev.dslist.entities.GameList;
import com.luizdev.dslist.service.GameListService;

@RestController
@RequestMapping(value = "/gameslist")
public class GameListResource {
	
	@Autowired
	private GameListService gameListService;
	
	@GetMapping
	public List<GameList> findAll(){
		return gameListService.findAll();
	}
}
