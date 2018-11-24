package javaWebDevelopment.service.impl;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javaWebDevelopment.model.Format;
import javaWebDevelopment.model.Team;
import javaWebDevelopment.repository.FormatRepository;
import javaWebDevelopment.service.FormatService;



@Service
public class JpaFormatServiceImpl implements FormatService{

	@Autowired
	private FormatRepository formatRepository;
	@Override
	public List<Format> findAll() {
		
		return formatRepository.findAll();
	}

	@Override
	public Format findOne(Long id) {
		Optional<Format> optional= Optional.empty();
		
		optional = formatRepository.findById(id);
		Format returnValue = optional.get();
		System.out.println(returnValue.getName());
		return returnValue;
		
	}

	@Override
	public Format save(Format format) {
		
		return formatRepository.save(format);
	}

	@Override
	public void remove(Long id) {
		formatRepository.delete(id);
	}

	
	
	
}
