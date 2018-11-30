package javaWebDevelopment.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaWebDevelopment.model.Comment;
import javaWebDevelopment.repository.CommentRepository;
import javaWebDevelopment.service.CommentService;

@Service
public class JpaCommentServiceImpl implements CommentService {

	@Autowired
	private CommentRepository commentRepository;

	@Override
	public List<Comment> findAll() {
		
		return commentRepository.findAll();
	}

	@Override
	public Comment findOne(Long id) {
		
		return commentRepository.findOne(id);
	}

	@Override
	public List<Comment> findByCompetitionId(Long id) {
		
		return commentRepository.findByCompetitionId(id);
	}

	@Override
	public Comment save(Comment comment) {
		
		return commentRepository.save(comment);
	}

	@Override
	public void remove(Long id) {
		commentRepository.delete(id);
		
	}
}
