package javaWebDevelopment.support;

import java.util.ArrayList;
import java.util.List;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javaWebDevelopment.model.Format;
import javaWebDevelopment.web.dto.FormatDTO;


@Component
public class FormatToFormatDTO implements Converter<Format, FormatDTO> {

	public FormatDTO convert(Format format) {
		FormatDTO dto = new FormatDTO();
		dto.setId(format.getId());
		dto.setName(format.getName());
		dto.setNumberOfTeams(format.getCompetitions().size());
		return dto;
	}
	
	public List<FormatDTO> convert(List<Format> format){
		List<FormatDTO> returnValue = new ArrayList<FormatDTO>();
		
		for(Format it: format) {
			returnValue.add(convert(it));
		}
		return returnValue;
		
	}
}
