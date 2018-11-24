//package jwd.zavrsni.support;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import jwd.stanica.model.Prevoznik;
//import jwd.stanica.web.dto.PrevoznikDTO;
//
//@Component
//public class PrevoznikToPrevoznikDTO implements Converter<Prevoznik, PrevoznikDTO> {
//
//	public PrevoznikDTO convert(Prevoznik prevoznik) {
//		PrevoznikDTO dto = new PrevoznikDTO();
//		dto.setAdresa(prevoznik.getAdresa());
//		dto.setId(prevoznik.getId());
//		dto.setNaziv(prevoznik.getNaziv());
//		dto.setPib(prevoznik.getPib());
//		return dto;
//	}
//	public List<PrevoznikDTO> convert(List<Prevoznik> prevoznik){
//		List<PrevoznikDTO> retVal = new ArrayList<PrevoznikDTO>();
//		
//		for(Prevoznik it: prevoznik) {
//			retVal.add(convert(it));
//		}
//		
//		return retVal;
//		
//		
//	}
//}
