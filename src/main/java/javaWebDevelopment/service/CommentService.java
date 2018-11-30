package javaWebDevelopment.service;

import java.util.List;

import javaWebDevelopment.model.Comment;


public interface CommentService {
	List<Comment> findAll();
	Comment findOne(Long id);
	List<Comment> findByCompetitionId(Long id);
	Comment save(Comment comment);
	void remove(Long id);
}
