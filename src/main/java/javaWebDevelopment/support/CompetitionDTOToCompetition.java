package javaWebDevelopment.support;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.service.CompetitionService;
import javaWebDevelopment.service.FormatService;
import javaWebDevelopment.web.dto.CompetitionDTO;


@Component
public class CompetitionDTOToCompetition implements Converter<CompetitionDTO, Competition> {

	@Autowired 
	private CompetitionService competitionService;
	@Autowired
	private FormatService formatService;
	
	@Override
	public Competition convert(CompetitionDTO dto) {
		
		Competition competition;
		
		if(dto.getId()==null) {
			competition = new Competition();
			competition.setFormat(formatService.findOne(dto.getFormatId()));
		}else {
			competition = competitionService.findOne(dto.getId());
		}
		competition.setName(dto.getName());
	
		return competition;
	}

}
