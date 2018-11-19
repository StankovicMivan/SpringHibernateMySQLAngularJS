package jwd.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import jwd.model.Team;



public interface TeamService {


	Page<Team> findAll(int pageNum);
	Team findOne(Long id);
	void save(Team team);
	void remove(Long id);
	List<Team> findByCompetitionId(Long competitionId);
	Page<Team> pretraga(
			@Param("competitionId") Long competitionId, 
			@Param("name") String name,
			int page);
}
