package javaWebDevelopment.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;





@Entity
@Table
public class Competition {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String name;
	@OneToMany(mappedBy="competition")
	private List<Team> teams = new ArrayList<>();

	@ManyToOne(fetch=FetchType.EAGER)
	private Format format;

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

	public List<Team> getTeams() {
		return teams;
	}

	public void setTeams(List<Team> teams) {
		this.teams = teams;
	}

	public Format getFormat() {
		return format;
	}

	public void setFormat(Format format) {
		this.format = format;
		if(format!=null && !format.getCompetitions().contains(this)){
			format.getCompetitions().add(this);
		}
	}



}
