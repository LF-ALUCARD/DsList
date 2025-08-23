package com.luizdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizdev.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long>{

}
