package jwd.zavrsni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jwd.zavrsni.service.NameDodatnoService;



@Service
public class JpaNameDodatnoServiceImpl implements NameDodatnoService{
	/*
	  @Autowired
	KupovinaRepository kupovinaRepository;
	@Autowired
	LinijaRepository linijaRepository;
	@Override
	public Kupovina kupiKartu(Long linijaId, Integer kolicina) {
		if(linijaId == null) {
			throw new IllegalArgumentException("Id of a linija cannot be null!");
		}
		
		Linija linija = linijaRepository.findOne(linijaId);
	
		if(linija == null) {
			throw new IllegalArgumentException("There is no Linija that has given id!!");
		}
		//TU se izvrsava radnja na back-endu, u zavisnosti sta nam treba za dodatno
		if(linija.getBrojMesta() >= kolicina) {
			int novaKolicina = linija.getBrojMesta() -kolicina;
	
			linija.setBrojMesta(novaKolicina);
			
			Kupovina kupovina = new Kupovina();
			kupovina.setKolicina(kolicina);
			kupovina.setLinija(linija);
			
			kupovinaRepository.save(kupovina);
			linijaRepository.save(linija);
				
			return kupovina;
		}
		
		return null;
	}
	 */
}
