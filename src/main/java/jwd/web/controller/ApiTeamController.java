package jwd.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jwd.model.Team;
import jwd.service.TeamService;
import jwd.support.TeamDTOToTeam;
import jwd.support.TeamToTeamDTO;
import jwd.web.dto.TeamDTO;



@RestController
@RequestMapping("/api/ucesnici")
public class ApiTeamController {
	@Autowired
	private TeamService teamService;
	
	@Autowired
	private TeamToTeamDTO toDTO;
	@Autowired
	private TeamDTOToTeam toUcesnik;


	

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TeamDTO>> get(
			@RequestParam(required = false) Long takmicenjeId,
			@RequestParam(required = false) String naziv,
			@RequestParam(defaultValue = "0") int pageNum) {

		Page<Team> ucesnici;

		if (takmicenjeId != null || naziv != null ) {
			ucesnici = teamService.pretraga(takmicenjeId, naziv, pageNum);
		} else {
			ucesnici = teamService.findAll(pageNum);
		}

		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", Integer.toString(ucesnici.getTotalPages()));
		return new ResponseEntity<>(toDTO.convert(ucesnici.getContent()), headers, HttpStatus.OK);
	}
	
	
	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<TeamDTO> get(@PathVariable Long id) {
		Team team = teamService.findOne(id);

		if (team == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(team), HttpStatus.OK);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<TeamDTO> add(
			@RequestBody TeamDTO noviUcesnik){
		
		Team team = toUcesnik.convert(noviUcesnik); 
		if(team.getCompetition().getFormat().getNumberOfTeams() < team.getCompetition().getFormat().getCompetition().size()) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		teamService.save(team);
		
		return new ResponseEntity<>(toDTO.convert(team),
				HttpStatus.CREATED);
	}
	
	
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
	public ResponseEntity<TeamDTO> edit(
			@PathVariable Long id,
			@RequestBody TeamDTO izmenjen){
		
		if(!id.equals(izmenjen.getId())){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		Team team = toUcesnik.convert(izmenjen); 
		teamService.save(team);
		
		return new ResponseEntity<>(toDTO.convert(team),
				HttpStatus.OK);
	}
	
	
	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public ResponseEntity<TeamDTO> delete(@PathVariable Long id){
		teamService.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
	
	@ExceptionHandler
	public ResponseEntity<Void> validationHandler(
					DataIntegrityViolationException e){
		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
	}
}
