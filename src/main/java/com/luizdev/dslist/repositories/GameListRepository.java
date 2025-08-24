package com.luizdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizdev.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{

}
