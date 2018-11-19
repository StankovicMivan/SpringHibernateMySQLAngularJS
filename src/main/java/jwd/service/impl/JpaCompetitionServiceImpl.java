package jwd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import jwd.model.Competition;
import jwd.repository.CompetitionRepository;
import jwd.service.CompetitionService;



@Service
public class JpaCompetitionServiceImpl implements CompetitionService{

    @Autowired
	private CompetitionRepository competitionRepository;
	
	@Override
	public List<Competition> findAll() {
		
		return competitionRepository.findAll();
	}

	@Override
	public Competition findOne(Long id) {
		
		return competitionRepository.findOne(id);
	}

	@Override
	public Competition save(Competition competition) {
	
		return competitionRepository.save(competition);
	}

	@Override
	public void remove(Long id) {
		competitionRepository.delete(id);
		
	}

	@Override
	public Page<Competition> findAll(int pageNum) {
		
		return competitionRepository.findAll(new PageRequest(pageNum, 5));
	}

}
