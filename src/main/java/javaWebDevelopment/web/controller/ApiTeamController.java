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
import javaWebDevelopment.web.dto.EventDTO;
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
	public ResponseEntity<List<TeamDTO>> getPages(
			@RequestParam(defaultValue = "0") int pageNum,
			@RequestParam(defaultValue = "4") int showParam, 
			@RequestParam Long competitionId) {

		Page<Team> teams;
		teams = teamService.pretraga(competitionId, pageNum, showParam);

		HttpHeaders headers = new HttpHeaders();
		headers.add("totalPages", Integer.toString(teams.getTotalPages()));
		return new ResponseEntity<>(toDTO.convert(teams.getContent()), headers, HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.GET,value="/{competitionId}")
	public ResponseEntity<List<TeamDTO>> getList( @PathVariable Long competitionId) {

		List<Team> teams;
		teams = teamService.findByCompetitionId(competitionId);
		return new ResponseEntity<>(toDTO.convert(teams), HttpStatus.OK);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/{competitionId}/{id}")
	public ResponseEntity<TeamDTO> getOne(@PathVariable Long competitionId,@PathVariable Long id) {
		Team team = teamService.findOne(id);

		if (team == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

		return new ResponseEntity<>(toDTO.convert(team), HttpStatus.OK);
	}


	@RequestMapping(method=RequestMethod.POST)
	public ResponseEntity<EventDTO> addEvent(@RequestBody EventDTO eventDTO){
		System.out.println(eventDTO.getCompetitionId());
		System.out.println(eventDTO.getFirstTeam());
		System.out.println(eventDTO.getSecondTeam());
		System.out.println(eventDTO.getScore());
		Team team1 = teamService.findOne(eventDTO.getFirstTeam());
		Team team2 = teamService.findOne(eventDTO.getSecondTeam());
		if(eventDTO.getScore() ==1) {
			team1.setPlayedMatches(team1.getPlayedMatches()+1);
			team2.setPlayedMatches(team2.getPlayedMatches()+1);
			team1.setScore(team1.getScore()+team1.getCompetition().getFormat().getVictory());
		}else if(eventDTO.getScore() ==2) {
			team1.setPlayedMatches(team1.getPlayedMatches()+1);
			team2.setPlayedMatches(team2.getPlayedMatches()+1);
			team2.setScore(team2.getScore()+team2.getCompetition().getFormat().getVictory());
		}else if(eventDTO.getScore() ==3) {
			team1.setPlayedMatches(team1.getPlayedMatches()+1);
			team2.setPlayedMatches(team2.getPlayedMatches()+1);
			team1.setScore(team1.getScore()+team1.getCompetition().getFormat().getUnsolved());
			team2.setScore(team2.getScore()+team2.getCompetition().getFormat().getUnsolved());
		}
		teamService.save(team1);
		teamService.save(team2);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

//		
	
	
//	@RequestMapping(method=RequestMethod.POST)
//	public ResponseEntity<TeamDTO> add(@RequestBody TeamDTO newTeam){
//
//		Team team = toTeam.convert(newTeam); 
//		teamService.save(team);
//
//		return new ResponseEntity<>(toDTO.convert(team),HttpStatus.CREATED);
//	}
	@RequestMapping(method=RequestMethod.PUT,value="/{id}")
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
