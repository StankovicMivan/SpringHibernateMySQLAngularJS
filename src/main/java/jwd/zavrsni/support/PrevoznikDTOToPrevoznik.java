//package jwd.zavrsni.support;
//
//import java.util.ArrayList;
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import jwd.stanica.model.Prevoznik;
//
//import jwd.stanica.service.PrevoznikService;
//import jwd.stanica.web.dto.PrevoznikDTO;
//
//@Component
//public class PrevoznikDTOToPrevoznik implements Converter<PrevoznikDTO, Prevoznik>{
//
//	@Autowired
//	private PrevoznikService prevoznikService;
//
//	
//	@Override
//	public Prevoznik convert(PrevoznikDTO dto) {
//		
//		Prevoznik prevoznik;
//		if(dto.getId()==null) {
//			prevoznik = new Prevoznik();
//			
//		}else {
//			prevoznik = prevoznikService.findOne(dto.getId());
//			if(prevoznik == null) {
//				throw new IllegalStateException("Editing non-existant Prevoznik");
//			}
//		}
//		
//		prevoznik.setAdresa(dto.getAdresa());
//		prevoznik.setNaziv(dto.getNaziv());
//		prevoznik.setPib(dto.getPib());
//		return prevoznik;
//	}
//
//	public List<Prevoznik> convert(List<PrevoznikDTO> dtos){
//		List<Prevoznik> list = new ArrayList<>();
//		
//		for(PrevoznikDTO dto: dtos){
//			list.add(convert(dto));
//		}
//		
//		return list;
//	}
//}
