package javaWebDevelopment.support;

import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.web.dto.CompetitionDTO;



@Component
public class CompetitionToCompetitionDTO implements Converter<Competition, CompetitionDTO> {

	@Override
	public CompetitionDTO convert(Competition competition) {
		CompetitionDTO dto = new CompetitionDTO();
		dto.setFormatId(competition.getFormat().getId());
		dto.setFormatName(competition.getFormat().getName());
		dto.setId(competition.getId());
		dto.setName(competition.getName());
		
		return dto;
	}

	public List<CompetitionDTO> convert(List<Competition> list) {

		List<CompetitionDTO> returnValue = new ArrayList<CompetitionDTO>();

		for (Competition it : list) {
			returnValue.add(convert(it));
		}
		return returnValue;
	}
}
