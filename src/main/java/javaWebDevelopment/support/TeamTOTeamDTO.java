package javaWebDevelopment.support;


import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Team;
import javaWebDevelopment.web.dto.TeamDTO;

@Component
public class TeamTOTeamDTO implements Converter<Team, TeamDTO>{


	
	@Override
	public TeamDTO convert(Team team) {
		TeamDTO returnValue = new TeamDTO();
		returnValue.setContact(team.getContact());
		returnValue.setId(team.getId());
		returnValue.setCompetitionId(team.getCompetition().getId());
		returnValue.setCompetitionName(team.getCompetition().getName());
		returnValue.setLocation(team.getLocation());
		returnValue.setName(team.getName());
		returnValue.setPlayedMatches(team.getPlayedMatches());
		returnValue.setScore(team.getScore());
		returnValue.setPosition(team.getPosition());
		return returnValue;
	}

	public List<TeamDTO> convert(List<Team> teams){
		List<TeamDTO> returnValue = new ArrayList<>();
		
		for(Team it : teams) {
			returnValue.add(convert(it));
		}
		
		return returnValue;
	}
}
