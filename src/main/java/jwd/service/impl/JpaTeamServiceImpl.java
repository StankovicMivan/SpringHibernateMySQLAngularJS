package jwd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import jwd.model.Team;
import jwd.repository.TeamRepository;
import jwd.service.TeamService;



@Service
public class JpaTeamServiceImpl implements TeamService{
	
	@Autowired
	private TeamRepository teamRepository;
	
	@Override
	public Page<Team> findAll(int pageNum) {
		
		return teamRepository.findAll(new PageRequest(pageNum, 5));
	}

	@Override
	public Team findOne(Long id) {
		
		return teamRepository.findOne(id);
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
	public List<Team> findByCompetitionId( Long competitionId) {
		return teamRepository.findByCompetitionId(competitionId);
	}
	@Override
	public Page<Team> pretraga(Long takmicenjeId, String naziv, int page) {
		if(naziv != null) {
			naziv = "%" + naziv + "%";
		}
		return teamRepository.pretraga(takmicenjeId, naziv, new PageRequest(page, 5));
	}

	

	

	
}
