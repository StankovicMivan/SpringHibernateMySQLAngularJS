package jwd.zavrsni.web.controller;

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



@RestController
@RequestMapping("/api/linije")
public class ApiName1Controller {
//	@Autowired
//	private LinijaService linijaService;
//	
//	@Autowired
//	private LinijaToLinijaDTO toDTO;
//	@Autowired
//	private LinijaDTOToLinija toLinija;
//	@Autowired
//	private KupovinaService kupovinaService;
//	@Autowired
//	private KupovinaTOKupovinaDTO toKupovinaDTO;
//	
//
//	@RequestMapping(method = RequestMethod.GET)
//	public ResponseEntity<List<LinijaDTO>> get(@RequestParam(required = false) String destinacija,
//			@RequestParam(required = false) Long prevoznikId, @RequestParam(required = false) Double maxC,
//			@RequestParam(defaultValue = "0") int pageNum) {
//
//		Page<Linija> linije;
//		System.out.println(prevoznikId);
//		if (destinacija != null || prevoznikId != null || maxC != null) {
//			linije = linijaService.pretraga(destinacija, prevoznikId, maxC, pageNum);
//		} else {
//			linije = linijaService.findAll(pageNum);
//		}
//
//		HttpHeaders headers = new HttpHeaders();
//		headers.add("totalPages", Integer.toString(linije.getTotalPages()));
//		return new ResponseEntity<>(toDTO.convert(linije.getContent()), headers, HttpStatus.OK);
//	}
//	@RequestMapping(method = RequestMethod.GET, value = "/{id}")
//	public ResponseEntity<LinijaDTO> get(@PathVariable Long id) {
//		Linija linija = linijaService.findOne(id);
//
//		if (linija == null) {
//			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//		}
//
//		return new ResponseEntity<>(toDTO.convert(linija), HttpStatus.OK);
//	}
//	
//	@RequestMapping(method=RequestMethod.POST)
//	public ResponseEntity<LinijaDTO> add(
//			@RequestBody LinijaDTO novaLinija){
//		
//		Linija linija = toLinija.convert(novaLinija); 
//		linijaService.save(linija);
//		
//		return new ResponseEntity<>(toDTO.convert(linija),
//				HttpStatus.CREATED);
//	}
//	@RequestMapping(method=RequestMethod.PUT,
//			value="/{id}")
//	public ResponseEntity<LinijaDTO> edit(
//			@PathVariable Long id,
//			@RequestBody LinijaDTO izmenjen){
//		
//		if(!id.equals(izmenjen.getId())){
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//		
//		Linija linija = toLinija.convert(izmenjen); 
//		linijaService.save(linija);
//		
//		return new ResponseEntity<>(toDTO.convert(linija),
//				HttpStatus.OK);
//	}
//	@RequestMapping(method=RequestMethod.DELETE,
//			value="/{id}")
//	public ResponseEntity<LinijaDTO> delete(@PathVariable Long id){
//		linijaService.remove(id);
//		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	}
//	@RequestMapping(method=RequestMethod.POST, value="/{id}/kupi/{brojKarata}")
//	public ResponseEntity<KupovinaDTO> rent(@PathVariable Long id, @PathVariable Integer brojKarata){
//		System.out.println(brojKarata);
//		System.out.println(brojKarata);
//		System.out.println(brojKarata);
//		System.out.println(brojKarata);
//		Kupovina k = kupovinaService.kupiKartu(id, brojKarata);
//		
//		if(k != null) {
//			return new ResponseEntity<>(toKupovinaDTO.convert(k), HttpStatus.CREATED);
//		}
//		else {
//			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//		}
//	}
//	@ExceptionHandler
//	public ResponseEntity<Void> validationHandler(
//					DataIntegrityViolationException e){
//		return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
//	}
}
