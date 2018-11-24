package javaWebDevelopment.service;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import javaWebDevelopment.model.Team;



public interface TeamService {


	Page<Team> findAll(int pageNum, int showParam);
	List<Team> findAll();
	Team findOne(Long id);
	void save(Team team);
	void remove(Long id);
	List<Team> findByCompetitionId(Long competitionId);
	Page<Team> pretraga(
			@Param("competitionId") Long competitionId, int page);

}
