package javaWebDevelopment.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.service.CompetitionService;
import javaWebDevelopment.support.CompetitionDTOToCompetition;
import javaWebDevelopment.support.CompetitionToCompetitionDTO;
import javaWebDevelopment.web.dto.CompetitionDTO;

@RestController
@RequestMapping("/api/competitions")
public class ApiCompetitionController {
	
	@Autowired
	private CompetitionService competitionService;	
	@Autowired
	private CompetitionToCompetitionDTO toDTO;
	@Autowired
	private CompetitionDTOToCompetition toCompetition;
	
	//methods

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CompetitionDTO>> get() {

		List<Competition> competition;
		competition = competitionService.findAll();
		
		return new ResponseEntity<>(toDTO.convert(competition), HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<CompetitionDTO> get(@PathVariable Long id) {
		Competition competition = competitionService.findOne(id);

		if (competition == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(competition), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<CompetitionDTO> add(
			@RequestBody CompetitionDTO newCompetition){
		
		Competition competition = toCompetition.convert(newCompetition); 
		competitionService.save(competition);
		
		return new ResponseEntity<>(toDTO.convert(competition),
				HttpStatus.CREATED);
	}
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public ResponseEntity<CompetitionDTO> edit(
			@PathVariable Long id,
			@RequestBody CompetitionDTO changed){
		
		if(!id.equals(changed.getId())){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Competition competition = toCompetition.convert(changed); 
		competitionService.save(competition);
		
		return new ResponseEntity<>(toDTO.convert(competition),HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public ResponseEntity<CompetitionDTO> delete(@PathVariable Long id){
		competitionService.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	@ExceptionHandler
	public ResponseEntity<Void> validationHandler(
					DataIntegrityViolationException e){
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
