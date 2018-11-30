package javaWebDevelopment.model;

import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;
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
public class Comment {
	@Id
	@GeneratedValue
	@Column
	private Long id;
	@Column
	private String userName;
	@Column
	private String comment;
	@Column 
	private Timestamp publishTime;


	@ManyToOne(fetch=FetchType.EAGER)
	private Competition competition;


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


	public Timestamp getPublishTime() {
		return publishTime;
	}


	public void setPublishTime(Timestamp publishTime) {
		this.publishTime = publishTime;
	}


	public Competition getCompetition() {
		return competition;
	}


	public void setCompetition(Competition competition) {
		this.competition = competition;
		if(competition!=null && !competition.getComments().contains(this)){
			competition.getComments().add(this);
		}
	}
	
	 
}
