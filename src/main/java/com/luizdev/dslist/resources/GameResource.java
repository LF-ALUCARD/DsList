package com.luizdev.dslist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizdev.dslist.dto.GameDTO;
import com.luizdev.dslist.dto.GameMinDTO;
import com.luizdev.dslist.service.GameService;

@RestController
@RequestMapping(value = "/games")
public class GameResource {
	
	@Autowired
	private GameService gameService;
	
	@GetMapping
	public ResponseEntity<List<GameMinDTO>> findAll(){
		
		List<GameMinDTO> list = gameService.findAll();
		
		return ResponseEntity.ok().body(list);
	}
	
	@GetMapping (value = "/{Id}")
	public ResponseEntity<GameDTO> findById(@PathVariable Long Id){
		GameDTO obj = gameService.findById(Id);
		return ResponseEntity.ok().body(obj);
	}
}
