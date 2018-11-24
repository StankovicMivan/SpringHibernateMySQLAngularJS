package jwd.zavrsni.web.controller;

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



@RestController
@RequestMapping("/api/prevoznici")
public class ApiName2Controller {

//	@Autowired
//	private PrevoznikService prevoznikService;
//	@Autowired
//	private PrevoznikToPrevoznikDTO toDTO;
//	@Autowired
//	private PrevoznikDTOToPrevoznik toPrevoznik;
//	
//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<PrevoznikDTO>> get(
//			@RequestParam(defaultValue = "0") int pageNum) {
//
//		Page<Prevoznik> prevoznici;
//	
//		prevoznici = prevoznikService.findAll(pageNum);	
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("totalPages", Integer.toString(prevoznici.getTotalPages()));
//		return new ResponseEntity<>(toDTO.convert(prevoznici.getContent()), headers, HttpStatus.OK);
//	}
//	@RequestMapping(method=RequestMethod.POST)
//	public ResponseEntity<PrevoznikDTO> add(
//			@RequestBody PrevoznikDTO noviPrevoznik){
//		
//		Prevoznik prevoznik = toPrevoznik.convert(noviPrevoznik); 
//		prevoznikService.save(prevoznik);
//		
//		return new ResponseEntity<>(toDTO.convert(prevoznik),
//				HttpStatus.CREATED);
//	}
	//Skraceno samo za tim bez paginacije
//	@RequestMapping(method=RequestMethod.GET)
//	ResponseEntity<List<TimDTO>> getAll(){
//		List<Tim> lista = servis.getAll();
//		return new ResponseEntity<>(toDto.convert(lista), HttpStatus.OK);
//	}
//	
//	@RequestMapping(method=RequestMethod.GET, value="/{id}/igraci")
//	ResponseEntity<List<IgracDTO>> getAllIgraci(@PathVariable Long id){
//		List<Igrac> igraci = iServis.findByTimId(id);
//		return new ResponseEntity<>(iToDto.convert(igraci), HttpStatus.OK);
//	}
//	
}
