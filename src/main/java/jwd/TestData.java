package jwd;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import jwd.model.Format;
import jwd.model.Competition;
import jwd.model.Team;
import jwd.service.FormatService;
import jwd.service.CompetitionService;
import jwd.service.TeamService;


@Component
public class TestData {

	
	 @Autowired
	 private TeamService teamService;
	
	 @Autowired
	 private CompetitionService competitionService;
	
	 @Autowired
	 private FormatService formatService;


	@PostConstruct
	public void init() {

		Format f1 = new Format();
		f1.setNumberOfTeams(15);		
		f1.setName("Fudbal");
		f1.setLose(0);
		f1.setUnsolved(1);
		f1.setVictory(3);
		formatService.save(f1);
		
		Competition t1 = new Competition();
		
		t1.setFormat(f1);
		t1.setName("Super Liga");
		competitionService.save(t1);
		
		Team u1 = new Team();
		u1.setScore(2);
		u1.setContact("ivan@gmail.com");
		u1.setLocation("Odzaci");
		u1.setName("Tekstilac");
		u1.setPlayedMatches(10);
		u1.setCompetition(t1);
		
		teamService.save(u1);
		competitionService.save(t1);
		
	}
}
