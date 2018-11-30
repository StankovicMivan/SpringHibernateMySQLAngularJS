package javaWebDevelopment.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaWebDevelopment.model.Comment;

@Repository
public interface CommentRepository extends JpaRepository<Comment, Long> {

	List<Comment> findByCompetitionId(Long id);
}
