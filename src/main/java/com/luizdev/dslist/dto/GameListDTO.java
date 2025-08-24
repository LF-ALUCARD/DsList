package com.luizdev.dslist.dto;

import java.io.Serializable;
import java.util.Objects;

import com.luizdev.dslist.entities.GameList;

public class GameListDTO implements Serializable{ 
	
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String name;
	
	public GameListDTO() {}

	public GameListDTO(GameList entity) {
		super();
		this.id = entity.getId();
		this.name = entity.getName();
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		GameListDTO other = (GameListDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "GameListDTO [id=" + id + ", name=" + name + "]";
	}
	
	
	
	
}
