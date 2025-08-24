package com.luizdev.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.luizdev.dslist.entities.Belonging;
import com.luizdev.dslist.entities.BelongingPK;

public interface BelongingRepository extends JpaRepository<Belonging, BelongingPK>{

}
