package javaWebDevelopment.service;

import java.util.List;


import javaWebDevelopment.model.Competition;



public interface CompetitionService {

	List<Competition> findAll();
	Competition findOne(Long id);
	Competition save(Competition competition);
	void remove(Long id);
}
