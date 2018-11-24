package javaWebDevelopment.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


//Game format, like BasketBall, FootBall etc.

@Entity
public class Format {

	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String name;	
	@Column
	private int numberOfTeams;
	
	@Column 
	private int victory;
	@Column
	private int unsolved;
	@JoinColumn
	private Long lose;
	
	
	@OneToMany(mappedBy="format")
	private List<Competition> competitions = new ArrayList<>();

	
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getNumberOfTeams() {
		return numberOfTeams;
	}

	public void setNumberOfTeams(int numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}

	public int getVictory() {
		return victory;
	}

	public void setVictory(int victory) {
		this.victory = victory;
	}

	public int getUnsolved() {
		return unsolved;
	}

	public void setUnsolved(int unsolved) {
		this.unsolved = unsolved;
	}

	public Long getLose() {
		return lose;
	}

	public void setLose(Long lost) {
		this.lose = lost;
	}

	public List<Competition> getCompetitions() {
		return competitions;
	}

	public void setCompetitions(List<Competition> competitions) {
		this.competitions = competitions;
	}
	
	

	
}
