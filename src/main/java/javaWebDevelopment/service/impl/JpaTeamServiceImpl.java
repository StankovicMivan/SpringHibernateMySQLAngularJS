package javaWebDevelopment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.model.Team;
import javaWebDevelopment.repository.TeamRepository;
import javaWebDevelopment.service.TeamService;


@Service
public class JpaTeamServiceImpl implements TeamService{
	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public Page<Team> findAll(int pageNum, int showParam) {	
		return teamRepository.findAll(new PageRequest(pageNum, showParam));
	}

	@Override
	public Team findOne(Long id) {		
		Optional<Team> optional= Optional.empty();
		
		optional = teamRepository.findById(id);
		Team returnValue = optional.get();
		System.out.println(returnValue.getName());
		return returnValue;
	
	}

	@Override
	public void save(Team team) {
		teamRepository.save(team);
	}

	@Override
	public void remove(Long id) {
		teamRepository.delete(id);		
	}

	@Override
	public List<Team> findByCompetitionId(Long competitionId) {
		return teamRepository.findByCompetitionId(competitionId, new PageRequest(1, 5));
	}

	@Override
	public Page<Team> pretraga(Long competitionId, int page) {
		return teamRepository.pretraga(competitionId, new PageRequest(page, 5) );
	}

	@Override
	public List<Team> findAll() {	
		return teamRepository.findAll();
	}

}
