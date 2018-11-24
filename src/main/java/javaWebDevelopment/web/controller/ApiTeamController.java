package javaWebDevelopment.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import javaWebDevelopment.model.Team;
import javaWebDevelopment.service.TeamService;
import javaWebDevelopment.support.TeamDTOToTeam;
import javaWebDevelopment.support.TeamTOTeamDTO;
import javaWebDevelopment.web.dto.CompetitionDTO;
import javaWebDevelopment.web.dto.TeamDTO;



@RestController
@RequestMapping("/api/teams")
public class ApiTeamController {

	@Autowired
	private TeamService teamService;
	@Autowired
	private TeamTOTeamDTO toDTO;
	@Autowired
	private TeamDTOToTeam toTeam;

	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<TeamDTO>> get(@RequestParam(defaultValue = "0") int pageNum,@RequestParam(defaultValue = "4") int showParam) {

		Page<Team> teams;
		teams = teamService.findAll(pageNum, showParam);

		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", Integer.toString(teams.getTotalPages()));
		return new ResponseEntity<>(toDTO.convert(teams.getContent()), headers, HttpStatus.OK);
	}
	

	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
	public ResponseEntity<TeamDTO> getOne(@PathVariable Long id) {
		Team team = teamService.findOne(id);

		if (team == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(team), HttpStatus.OK);
	}
//	@RequestMapping(method=RequestMethod.GET)
//	public ResponseEntity<List<TeamDTO>> get(){
//		List<Team> teams = teamService.findAll();
//		return new ResponseEntity<>(toDTO.convert(teams), HttpStatus.OK);
//	}

	@RequestMapping(method=RequestMethod.POST)
//	@PostMapping(value="/api/teams")
	public ResponseEntity<TeamDTO> add(@RequestBody TeamDTO newTeam){

		Team team = toTeam.convert(newTeam); 
		teamService.save(team);

		return new ResponseEntity<>(toDTO.convert(team),HttpStatus.CREATED);
	}

	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
//	@PutMapping(value="/api/teams/{id}")
	public ResponseEntity<TeamDTO> edit(
			@PathVariable Long id,
			@RequestBody TeamDTO changed){

		if(!id.equals(changed.getId())){
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}

		Team team = toTeam.convert(changed); 
		teamService.save(team);

		return new ResponseEntity<>(toDTO.convert(team),HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.DELETE,value="/{id}")
	public ResponseEntity<CompetitionDTO> delete(@PathVariable Long id){
		teamService.remove(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

}
