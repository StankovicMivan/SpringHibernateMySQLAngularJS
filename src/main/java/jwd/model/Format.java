package jwd.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table
public class Format {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String name;
	@Column
	private Integer numberOfTeams;
	@Column
	private Integer victory;
	@Column
	private Integer unsolved;
	@Column
	private Integer lose;
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

	public Integer getNumberOfTeams() {
		return numberOfTeams;
	}

	public void setNumberOfTeams(Integer numberOfTeams) {
		this.numberOfTeams = numberOfTeams;
	}

	public List<Competition> getCompetition() {
		return competitions;
	}

	public void setCompetition(List<Competition> competitions) {
		this.competitions = competitions;
	}

	public Integer getVictory() {
		return victory;
	}

	public void setVictory(Integer victory) {
		this.victory = victory;
	}

	public Integer getUnsolved() {
		return unsolved;
	}

	public void setUnsolved(Integer unsolved) {
		this.unsolved = unsolved;
	}

	public Integer getLose() {
		return lose;
	}

	public void setLose(Integer lose) {
		this.lose = lose;
	}
	
	
	
}
