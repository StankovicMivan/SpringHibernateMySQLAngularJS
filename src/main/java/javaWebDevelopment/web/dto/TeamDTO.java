package javaWebDevelopment.web.dto;



public class TeamDTO {

	
	private Long id;
	private int position;
	private String name;
	private String location;
	private String contact;
	private int playedMatches;
	private int score;
	private long competitionId;
	private String competitionName;
	
	
	public int getPosition() {
		return position;
	}
	public void setPosition(int position) {
		this.position = position;
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
	public long getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(long competitionId) {
		this.competitionId = competitionId;
	}
	public String getCompetitionName() {
		return competitionName;
	}
	public void setCompetitionName(String competitionName) {
		this.competitionName = competitionName;
	}
	
	
}
