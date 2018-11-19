package jwd.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import jwd.model.Competition;
import jwd.model.Team;
import jwd.service.CompetitionService;
import jwd.service.TeamService;
import jwd.support.CompetitionToCompetitionDTO;
import jwd.support.TeamToTeamDTO;
import jwd.web.dto.CompetitionDTO;
import jwd.web.dto.TeamDTO;



@RestController
@RequestMapping("/api/takmicenja")
public class ApiCompetitionController {

	@Autowired
	private CompetitionService competitionService;
	@Autowired
	private CompetitionToCompetitionDTO toDTO;
	@Autowired
	private TeamService teamService;	
	@Autowired
	private TeamToTeamDTO toUcesnikDTO;
	
	@RequestMapping(method = RequestMethod.GET)
	public ResponseEntity<List<CompetitionDTO>> get() {

		List<Competition> takmicenja;
	
		takmicenja = competitionService.findAll();	

		return new ResponseEntity<>(toDTO.convert(takmicenja), HttpStatus.OK);
	}

	@RequestMapping(method=RequestMethod.GET, value="/{id}/ucesnici")
	ResponseEntity<List<TeamDTO>> getAll(@PathVariable Long id){
		
		List<Team> ucesnici = teamService.findByCompetitionId(id);
		return new ResponseEntity<>(toUcesnikDTO.convert(ucesnici), HttpStatus.OK);
	}
	@RequestMapping(method = RequestMethod.GET, value="/{id}")
	public ResponseEntity<List<TeamDTO>> get(
			@RequestParam(required = false) Long idPrvog,
			@RequestParam(required = false) Long idDrugog,
			@RequestParam(required = false) int zvanicno,
			@RequestParam(defaultValue = "0") int pageNum) {

	System.out.println(idPrvog);
	System.out.println(idDrugog);
	System.out.println(zvanicno);	

		return new ResponseEntity<>(  HttpStatus.OK);
	}
	
}
