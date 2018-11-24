//package jwd.zavrsni.support;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//
//import jwd.stanica.model.Linija;
//import jwd.stanica.service.LinijaService;
//import jwd.stanica.service.PrevoznikService;
//import jwd.stanica.web.dto.LinijaDTO;
//
//@Component
//public class LinijaDTOToLinija implements Converter<LinijaDTO, Linija> {
//
//	@Autowired 
//	private PrevoznikService prevoznikService;
//	@Autowired
//	private LinijaService linijaService;
//	
//	@Override
//	public Linija convert(LinijaDTO dto) {
//		
//		Linija linija;
//		
//		if(dto.getId()==null) {
//			linija = new Linija();
//			linija.setPrevoznik(prevoznikService.findOne(dto.getPrevoznikId())); 
//		}else {
//			linija = linijaService.findOne(dto.getId());
//		}
//		linija.setPrevoznik(prevoznikService.findOne(dto.getPrevoznikId()));
//		linija.setBrojMesta(dto.getBrojMesta());
//		linija.setCena(dto.getCena());
//		linija.setDestinacija(dto.getDestinacija());
//		linija.setVremePolaska(dto.getVremePolaska());
//	
//		return linija;
//	}
//
//}
