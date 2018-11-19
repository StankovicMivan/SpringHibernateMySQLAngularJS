package jwd.support;

import java.util.ArrayList;
import java.util.List;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import jwd.model.Competition;
import jwd.web.dto.CompetitionDTO;

@Component
public class CompetitionToCompetitionDTO implements Converter<Competition, CompetitionDTO> {

	@Override
	public CompetitionDTO convert(Competition competition) {
		CompetitionDTO dto = new CompetitionDTO();
		dto.setFormatId(competition.getFormat().getId());
		dto.setFormatNaziv(competition.getFormat().getName());
		dto.setId(competition.getId());
		dto.setNaziv(competition.getName());
		return dto;
	}
	public List<CompetitionDTO> convert(List<Competition> takmicenja){
		List<CompetitionDTO> retVal = new ArrayList<>();
		for(Competition it: takmicenja) {
			retVal.add(convert(it));
		}
		return retVal;
	}

}
