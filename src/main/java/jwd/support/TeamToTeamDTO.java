package jwd.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.model.Team;
import jwd.web.dto.TeamDTO;

@Component
public class TeamToTeamDTO implements Converter<Team, TeamDTO>{

	@Override
	public TeamDTO convert(Team team) {
		TeamDTO dto = new TeamDTO();
		
		dto.setBrojBodova(team.getScore());
		dto.setId(team.getId());
		dto.setKontakt(team.getContact());
		dto.setMesto(team.getLocation());
		dto.setNaziv(team.getName());
		dto.setOdigranoSusreta(team.getPlayedMatches());
		dto.setTakmicenjeId(team.getCompetition().getId());
		dto.setTakmicenjeNaziv(team.getCompetition().getName());
		
		return dto;
	}
	public List<TeamDTO> convert(List<Team> ucesnici){
		List<TeamDTO> retVal = new ArrayList<>();
		
		for(Team it: ucesnici) {
			retVal.add(convert(it));
		}
		return retVal;
	}

}
