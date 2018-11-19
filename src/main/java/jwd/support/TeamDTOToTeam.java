package jwd.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.model.Team;
import jwd.service.CompetitionService;
import jwd.service.TeamService;
import jwd.web.dto.TeamDTO;

@Component
public class TeamDTOToTeam implements Converter<TeamDTO, Team>{

	@Autowired 
	private TeamService teamService;
	@Autowired
	private CompetitionService competitionService;
	
	@Override
	public Team convert(TeamDTO dto) {
		Team team;
		if(dto.getId()==null) {
			team = new Team();
			team.setCompetition(competitionService.findOne(dto.getTakmicenjeId())); 
		}else {
			team = teamService.findOne(dto.getId());
			team.setScore(dto.getBrojBodova());
			team.setPlayedMatches(dto.getOdigranoSusreta());
			team.setCompetition(competitionService.findOne(dto.getTakmicenjeId()));
		}
		team.setContact(dto.getKontakt());
		team.setLocation(dto.getMesto());
		team.setName(dto.getNaziv());
		return team;
	}

}
