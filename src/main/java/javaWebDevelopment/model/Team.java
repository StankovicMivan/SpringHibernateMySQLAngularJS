package javaWebDevelopment.model;




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
	@Column
	private String name;
	@Column
	private String location;
	@Column
	private String contact;
	@Column
	private int playedMatches;
	@Column
	private int score;
	@Column
	private int position;
	
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
	}
	public Team() {
		this.playedMatches =0;
		this.score =0;
	}
	@ManyToOne(fetch=FetchType.EAGER)
	private Competition competition;
	
	
	public int getPlayedMatches() {
		return playedMatches;
	}
	public void setPlayedMatches(int playedMatches) {
		this.playedMatches = playedMatches;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Competition getCompetition() {
		return competition;
	}
	public void setCompetition(Competition competition) {
		this.competition = competition;
		if(competition !=null && !competition.getTeams().contains(this)) {
			competition.getTeams().add(this);
		}
	}
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

	
}
