//package jwd.zavrsni.support;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import jwd.stanica.model.Linija;
//import jwd.stanica.web.dto.LinijaDTO;
//
//@Component
//public class LinijaToLinijaDTO implements Converter<Linija, LinijaDTO> {
//
//	@Override
//	public LinijaDTO convert(Linija linija) {
//		LinijaDTO dto = new LinijaDTO();
//		dto.setBrojMesta(linija.getBrojMesta());
//		dto.setCena(linija.getCena());
//		dto.setDestinacija(linija.getDestinacija());
//		dto.setId(linija.getId());
//		dto.setPrevoznikId(linija.getPrevoznik().getId());
//		dto.setPrevoznikNaziv(linija.getPrevoznik().getNaziv());
//		dto.setVremePolaska(linija.getVremePolaska());
//		return dto;
//	}
//
//	public List<LinijaDTO> convert(List<Linija> list) {
//
//		List<LinijaDTO> retVal = new ArrayList<LinijaDTO>();
//
//		for (Linija it : list) {
//			retVal.add(convert(it));
//		}
//		return retVal;
//	}
//}
