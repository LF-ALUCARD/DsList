package com.luizdev.dslist.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.luizdev.dslist.entities.Belonging;
import com.luizdev.dslist.service.BelongingService;

@RestController
@RequestMapping(value = "/belongings")
public class BelongingResource {
	
	@Autowired
	private BelongingService belongingService;
	
	@GetMapping
	public List<Belonging> findAll(){
		return belongingService.findAll();
	}
}
