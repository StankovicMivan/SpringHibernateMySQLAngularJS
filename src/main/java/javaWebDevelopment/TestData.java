package javaWebDevelopment;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.model.Format;
import javaWebDevelopment.model.Team;
import javaWebDevelopment.service.CompetitionService;
import javaWebDevelopment.service.FormatService;
import javaWebDevelopment.service.TeamService;


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

		Format format1 = new Format();
//		format1.setId(1l);
		format1.setNumberOfTeams(16);		
		format1.setName("Fudbal");
		format1.setLose(0l);
		format1.setUnsolved(1);
		format1.setVictory(3);
		
		formatService.save(format1);
		
		Competition competition1 = new Competition();
		
		competition1.setFormat(format1);
		competition1.setName("Serbian SuperLiga");
		competitionService.save(competition1);
		
		Competition competition2 = new Competition();
		
		competition2.setFormat(format1);
		competition2.setName("Jelen liga");
		competitionService.save(competition2);
		
		Team team1 = new Team();
			team1.setScore(46);
			team1.setContact("redstar@gmail.com");
			team1.setLocation("Beograd");
			team1.setName("Red Star Belgrade");
			team1.setPlayedMatches(16);
			team1.setPosition(1);
			team1.setCompetition(competition1);
			teamService.save(team1);
		
		Team team2 = new Team();
			team2.setScore(37);
			team2.setContact("radnickinis@gmail.com");
			team2.setLocation("NiÅ¡");
			team2.setName("RadniÄ�ki NiÅ¡");
			team2.setPlayedMatches(16);
			team2.setPosition(2);
			team2.setCompetition(competition1);
			teamService.save(team2);
		
		Team team3 = new Team();
			team3.setScore(33);
			team3.setContact("partizan@gmail.com");
			team3.setLocation("Beograd");
			team3.setName("Partizan");
			team3.setPlayedMatches(16);
			team3.setPosition(3);
			team3.setCompetition(competition1);
			teamService.save(team3);
			
		Team team4 = new Team();
			team4.setScore(32);
			team4.setContact("cukaricki@gmail.com");
			team4.setLocation("Beograd");
			team4.setName("FK ÄŒukariÄ�ki");
			team4.setPlayedMatches(16);
			team4.setPosition(4);
			team4.setCompetition(competition1);
			teamService.save(team4);
		
		Team team5 = new Team();
			team5.setScore(28);
			team5.setContact("napredak@gmail.com");
			team5.setLocation("KruÅ¡evac");
			team5.setName("FK Napredak");
			team5.setPlayedMatches(16);
			team5.setPosition(5);
			team5.setCompetition(competition1);
			teamService.save(team5);
		
		Team team6 = new Team();
			team6.setScore(25);
			team6.setContact("mladostLucani@gmail.com");
			team6.setLocation("LuÄ�ani");
			team6.setName("FK Mladost LuÄ�ani");
			team6.setPlayedMatches(16);
			team6.setPosition(6);
			team6.setCompetition(competition1);
			teamService.save(team6);	
			
		Team team7 = new Team();
			team7.setScore(23);
			team7.setContact("poletns@gmail.com");
			team7.setLocation("Novi Sad");
			team7.setName("FK Polet Novi Sad");
			team7.setPlayedMatches(16);
			team7.setPosition(7);
			team7.setCompetition(competition1);
			teamService.save(team7);
			
		Team team8 = new Team();
			team8.setScore(21);
			team8.setContact("fkvojvodina@gmail.com");
			team8.setLocation("Novi Sad");
			team8.setName("FK Vojvodina");
			team8.setPlayedMatches(16);
			team8.setPosition(8);
			team8.setCompetition(competition1);
			teamService.save(team8);
			
		Team team9 = new Team();
			team9.setScore(17);
			team9.setContact("fkmacva@gmail.com");
			team9.setLocation("Å abac");
			team9.setName("FK MaÄ�va Å abac");
			team9.setPlayedMatches(16);
			team9.setPosition(9);
			team9.setCompetition(competition1);
			teamService.save(team9);
			
		Team team10 = new Team();
			team10.setScore(16);
			team10.setContact("fkbacka@gmail.com");
			team10.setLocation("BaÄ�ka Palanka");
			team10.setName("FK Backac");
			team10.setPlayedMatches(16);
			team10.setPosition(10);
			team10.setCompetition(competition1);
			teamService.save(team10);
			
		Team team11 = new Team();
			team11.setScore(15);
			team11.setContact("fkrad@gmail.com");
			team11.setLocation("Beograd");
			team11.setName("FK Rad");
			team11.setPlayedMatches(16);
			team11.setPosition(11);
			team11.setCompetition(competition1);
			teamService.save(team11);	
			
		Team team12 = new Team();
			team12.setScore(15);
			team12.setContact("fkvozdovac@gmail.com");
			team12.setLocation("Beograd");
			team12.setName("FK VoÅ¾dovac");
			team12.setPlayedMatches(16);
			team12.setPosition(12);
			team12.setCompetition(competition1);
			teamService.save(team12);	
			
		Team team13 = new Team();
			team13.setScore(15);
			team13.setContact("fksurdulica@gmail.com");
			team13.setLocation("Surdulica");
			team13.setName("FK Radnik Surdulica");
			team13.setPlayedMatches(16);
			team13.setPosition(13);
			team13.setCompetition(competition1);
			teamService.save(team13);	
			
		Team team14 = new Team();
			team14.setScore(13);
			team14.setContact("fkzemun@gmail.com");
			team14.setLocation("Beograd");
			team14.setName("FK Zemun");
			team14.setPlayedMatches(16);
			team14.setPosition(14);
			team14.setCompetition(competition1);
			teamService.save(team14);	
			
		Team team15 = new Team();
			team15.setScore(12);
			team15.setContact("fkspartak@gmail.com");
			team15.setLocation("Subotica");
			team15.setName("FK Spartak Subotica");
			team15.setPlayedMatches(16);
			team15.setPosition(15);
			team15.setCompetition(competition1);
			teamService.save(team15);	
			
		Team team16 = new Team();
			team16.setScore(7);
			team16.setContact("fkdinamovranje@gmail.com");
			team16.setLocation("Vranje");
			team16.setName("FK Dinamo Vranje");
			team16.setPlayedMatches(16);
			team16.setPosition(16);
			team16.setCompetition(competition1);
			teamService.save(team16);	
			
			
		competitionService.save(competition1);
		
		
		
		
		
	}
}
