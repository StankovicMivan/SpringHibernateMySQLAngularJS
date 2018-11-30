package javaWebDevelopment.web.dto;

public class EventDTO {

	private Long competitionId;
	private Long firstTeam;
	private Long secondTeam;
	private Long score;
	public Long getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(Long competitionId) {
		this.competitionId = competitionId;
	}
	public Long getFirstTeam() {
		return firstTeam;
	}
	public void setFirstTeam(Long firstTeam) {
		this.firstTeam = firstTeam;
	}
	public Long getSecondTeam() {
		return secondTeam;
	}
	public void setSecondTeam(Long secondTeam) {
		this.secondTeam = secondTeam;
	}
	public Long getScore() {
		return score;
	}
	public void setScore(Long score) {
		this.score = score;
	}
	
	
}
