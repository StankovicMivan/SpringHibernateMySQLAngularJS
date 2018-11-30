package javaWebDevelopment.web.dto;

import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;

public class CommentDTO {

	private Long id;
	private String userName;
	private String comment;
	private LocalDateTime publishTime;
	private Long competitionId;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	public LocalDateTime getPublishTime() {
		return publishTime;
	}
	public void setPublishTime(LocalDateTime publishTime) {
		this.publishTime = publishTime;
	}
	public Long getCompetitionId() {
		return competitionId;
	}
	public void setCompetitionId(Long competitionId) {
		this.competitionId = competitionId;
	}
	
	
}
