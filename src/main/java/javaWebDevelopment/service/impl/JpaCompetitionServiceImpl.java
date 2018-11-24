package javaWebDevelopment.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.repository.CompetitionRepository;
import javaWebDevelopment.service.CompetitionService;




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
		Optional<Competition> optional= Optional.empty();
		
		optional = competitionRepository.findById(id);
		Competition returnValue = optional.get();
		System.out.println(returnValue.getName());
		return returnValue;
	}

	@Override
	public Competition save(Competition competition) {
	
		return competitionRepository.save(competition);
	}

	@Override
	public void remove(Long id) {
		competitionRepository.delete(id);
	}


	
}
