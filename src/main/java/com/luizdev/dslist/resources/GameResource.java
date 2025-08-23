package com.luizdev.dslist.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.luizdev.dslist.service.GameService;

@Controller
@RequestMapping(value = "/game")
public class GameResource {
	
	@Autowired
	private GameService gameService;
}
