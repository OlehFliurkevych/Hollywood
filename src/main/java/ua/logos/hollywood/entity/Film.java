package ua.logos.hollywood.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="film")
public class Film extends BaseEntity{

	@Column(name="title", nullable=false)
	private String title;
	
	@Column(name="description",length=500)
	private String description;
	
	@Column(name="release_year")
	private int releaseYear;
	
	
	public Film(){
		
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		this.description = description;
	}


	public int getReleaseYear() {
		return releaseYear;
	}


	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}


	@Override
	public String toString() {
		return "Film [title=" + title + ", description=" + description + ", releaseYear=" + releaseYear + ", getId()="
				+ getId() + "]";
	}


	public Film(String title, String description, int releaseYear) {
		this.title = title;
		this.description = description;
		this.releaseYear = releaseYear;
	}
	
	
}
