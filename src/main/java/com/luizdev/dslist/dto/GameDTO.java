package com.luizdev.dslist.dto;

import java.io.Serializable;
import java.util.Objects;

import com.luizdev.dslist.entities.Game;

public class GameDTO implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String title;
	private Integer year;
	private String genre;
	private String platforms;
	private Double score;
	private String imgUrl;
	private String shortDescription;
	private String longDescription;
	
	public GameDTO () {}

	public GameDTO(Game entity) {
		id = entity.getId();
		title = entity.getTitle();
		year = entity.getYear();
		genre = entity.getGenre();
		platforms = entity.getPlatforms();
		score = entity.getScore();
		imgUrl = entity.getImgUrl();
		shortDescription = entity.getShortDescription();
		longDescription = entity.getLongDescription();
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public Integer getYear() {
		return year;
	}

	public String getGenre() {
		return genre;
	}

	public String getPlatforms() {
		return platforms;
	}

	public Double getScore() {
		return score;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
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
		GameDTO other = (GameDTO) obj;
		return Objects.equals(id, other.id);
	}

	@Override
	public String toString() {
		return "GameDTO [id=" + id + ", title=" + title + ", year=" + year + ", genre=" + genre + ", platforms="
				+ platforms + ", score=" + score + ", imgUrl=" + imgUrl + ", shortDescription=" + shortDescription
				+ ", longDescription=" + longDescription + "]";
	}
	
	
}
