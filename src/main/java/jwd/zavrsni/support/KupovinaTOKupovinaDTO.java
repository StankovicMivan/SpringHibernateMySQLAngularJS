//package jwd.zavrsni.support;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.core.convert.converter.Converter;
//import org.springframework.stereotype.Component;
//
//import jwd.stanica.model.Kupovina;
//import jwd.stanica.model.Linija;
//import jwd.stanica.repository.LinijaRepository;
//import jwd.stanica.web.dto.KupovinaDTO;
//
//@Component
//public class KupovinaTOKupovinaDTO implements Converter<Kupovina, KupovinaDTO>{
//
//	@Autowired
//	private LinijaRepository linijaRepository;
//	
//	@Override
//	public KupovinaDTO convert(Kupovina kupovina) {
//		Linija linija = linijaRepository.findOne(kupovina.getLinija().getId());
//		KupovinaDTO dto = new KupovinaDTO();
//		dto.setId(kupovina.getId());
//		dto.setKolicina(kupovina.getKolicina());
//		dto.setUkupnaCena(kupovina.getKolicina() * linija.getCena());;
//		return dto;
//	}
//
//}
