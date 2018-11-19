package jwd.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table
public class Team {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column(nullable= false, unique=true)
	private String name;
	@Column
	private String location;
	@Column(nullable=false)
	private String contact;
	@Column
	private Integer playedMatches =0;
	@Column
	private Integer score =0;
	
	@ManyToOne(fetch=FetchType.EAGER)
	private Competition competition;

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

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public Integer getPlayedMatches() {
		return playedMatches;
	}

	public void setPlayedMatches(Integer playedMatches) {
		this.playedMatches = playedMatches;
	}

	public Integer getScore() {
		return score;
	}

	public void setScore(Integer score) {
		this.score = score;
	}

	public Competition getCompetition() {
		return competition;
	}

	public void setCompetition(Competition competition) {
		this.competition = competition;
		if(competition!=null && !competition.getTeams().contains(this)) {
			competition.getTeams().add(this);
		}
	}


	
	

}
