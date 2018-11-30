package javaWebDevelopment.support;

import java.sql.Timestamp;
import java.time.LocalDateTime;

import javax.print.attribute.standard.DateTimeAtCompleted;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Comment;
import javaWebDevelopment.service.CommentService;
import javaWebDevelopment.service.CompetitionService;

import javaWebDevelopment.web.dto.CommentDTO;


@Component
public class CommentDTOTOComment implements Converter<CommentDTO, Comment>{

	@Autowired
	private CommentService commentService;
	@Autowired
	private CompetitionService competitionService;
	@Override
	public Comment convert(CommentDTO dto) {
		Comment comment;
		
		if(dto.getId()==null) {
			comment = new Comment();
		}else {
			comment = commentService.findOne(dto.getId());
		}
		comment.setCompetition(competitionService.findOne(dto.getCompetitionId()));
		comment.setComment(dto.getComment());
//		
//		comment.setPublishTime(dto.getPublishTime());
		comment.setPublishTime(Timestamp.valueOf(LocalDateTime.now()));
		comment.setUserName(dto.getUserName());
		
		return comment;
	}
	
}
