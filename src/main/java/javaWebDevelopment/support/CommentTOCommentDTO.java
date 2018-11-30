package javaWebDevelopment.support;


import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import javaWebDevelopment.model.Comment;
import javaWebDevelopment.web.dto.CommentDTO;

@Component
public class CommentTOCommentDTO implements Converter<Comment, CommentDTO>{

	

	@Override
	public CommentDTO convert(Comment comment) {
		CommentDTO returnValue = new CommentDTO();
		returnValue.setComment(comment.getComment());
		returnValue.setCompetitionId(comment.getCompetition().getId());
		returnValue.setId(comment.getId());	
		Instant seconds = comment.getPublishTime().toInstant();
		returnValue.setPublishTime(LocalDateTime.ofInstant(seconds, ZoneOffset.UTC));
		returnValue.setUserName(comment.getUserName());
		return returnValue;
	}
	public List<CommentDTO> convert(List<Comment> comments) {
		List<CommentDTO> returnValue = new ArrayList<>();
		for(Comment it:comments) {
			returnValue.add(convert(it));
		}
		return returnValue;
	}
}
