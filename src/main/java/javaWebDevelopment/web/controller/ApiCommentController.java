package javaWebDevelopment.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javaWebDevelopment.model.Comment;
import javaWebDevelopment.model.Team;
import javaWebDevelopment.service.CommentService;
import javaWebDevelopment.support.CommentDTOTOComment;
import javaWebDevelopment.support.CommentTOCommentDTO;
import javaWebDevelopment.web.dto.CommentDTO;
import javaWebDevelopment.web.dto.TeamDTO;



@RestController
@RequestMapping("/api/comments")
public class ApiCommentController {
	
	@Autowired
	private CommentService commentService;
	@Autowired
	private CommentTOCommentDTO toDTO;
	@Autowired
	private CommentDTOTOComment toComment;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CommentDTO>> get(@RequestParam Long competitionId) {

		List<Comment> comments;
		comments = commentService.findByCompetitionId(competitionId);

		List<CommentDTO> commentsDTO = toDTO.convert(comments);
		
		return new ResponseEntity<>(commentsDTO, HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<CommentDTO> add(@RequestBody CommentDTO newComment){

		Comment comment = toComment.convert(newComment); 
		
		commentService.save(comment);
		
		return new ResponseEntity<>(toDTO.convert(comment),HttpStatus.CREATED);
	}
}
