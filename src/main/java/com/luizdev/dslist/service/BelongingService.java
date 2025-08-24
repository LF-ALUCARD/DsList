package com.luizdev.dslist.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luizdev.dslist.entities.Belonging;
import com.luizdev.dslist.repositories.BelongingRepository;

@Service
public class BelongingService {

	@Autowired
	private BelongingRepository gameListRepository;
	
	public List<Belonging> findAll(){
		List<Belonging> entites = gameListRepository.findAll();	
		return entites;
	}
}
