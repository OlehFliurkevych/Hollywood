package ua.logos.hollywood.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
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
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="categoty_id")
	private Category category;
	
	@ManyToMany
	@JoinTable(name="actor_film",joinColumns=@JoinColumn(name="film_id"),inverseJoinColumns=@JoinColumn(name="actor_id"))
	private List<Actor> actors=new ArrayList<>();
		
	public List<Actor> getActors() {
		return actors;
	}


	public void setActors(List<Actor> actors) {
		this.actors = actors;
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


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
