package jwd.service;

import java.util.List;

import org.springframework.data.domain.Page;

import jwd.model.Competition;



public interface CompetitionService {

	Page<Competition> findAll(int pageNum);
	List<Competition> findAll();
	Competition findOne(Long id);
	Competition save(Competition competition);
	void remove(Long id);
}
