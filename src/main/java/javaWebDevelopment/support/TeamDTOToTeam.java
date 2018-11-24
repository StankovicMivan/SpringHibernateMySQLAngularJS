package javaWebDevelopment.support;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Team;
import javaWebDevelopment.service.CompetitionService;
import javaWebDevelopment.service.TeamService;
import javaWebDevelopment.web.dto.TeamDTO;

@Component
public class TeamDTOToTeam implements Converter<TeamDTO, Team> {



	@Autowired
	private TeamService teamService;
	@Autowired
	private CompetitionService competitionService;

	@Override
	public Team convert(TeamDTO dto) {
		Team team;
		
		if(dto.getId()==null) {
			team = new Team();	
		}else {
			team = teamService.findOne(dto.getId());
		}
		team.setCompetition(competitionService.findOne(dto.getCompetitionId()));; 
		team.setContact(dto.getContact());
		team.setLocation(dto.getLocation());
		team.setName(dto.getName());
		team.setPlayedMatches(dto.getPlayedMatches());
		team.setScore(dto.getScore());
		return team;
	}
}
