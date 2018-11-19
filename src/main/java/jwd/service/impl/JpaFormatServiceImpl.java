package jwd.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jwd.model.Format;
import jwd.repository.FormatRepository;
import jwd.service.FormatService;

@Service
public class JpaFormatServiceImpl implements FormatService {
	
	@Autowired
	FormatRepository repository;

	public List<Format> findAll() {
	
		return repository.findAll();
	}


	public Format findOne(Long id) {
		
		return repository.findOne(id);
	}

	
	public Format save(Format pozicija) {
	
		return repository.save(pozicija);
	}

	
	public void remove(Long id) {
		
		repository.delete(id);
	}

}
