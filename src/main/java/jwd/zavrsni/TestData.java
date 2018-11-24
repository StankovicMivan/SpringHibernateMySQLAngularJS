package jwd.zavrsni;

import javax.annotation.PostConstruct;


import org.springframework.stereotype.Component;


@Component
public class TestData {

	//
	// @Autowired
	// private LinijaService linijaService;
	//
	// @Autowired
	// private PrevoznikService prevoznikService;

	@PostConstruct
	public void init() {

		// Prevoznik p1 = new Prevoznik();
		// p1.setAdresa("Subotica");
		// p1.setPib("123456789");
		// p1.setNaziv("Subotica trans");
		// prevoznikService.save(p1);
		//
		// Prevoznik p2 = new Prevoznik();
		// p2.setAdresa("Niš");
		// p2.setPib("123456789");
		// p2.setNaziv("Niš ekspres");
		// prevoznikService.save(p2);
		//
		// Prevoznik p3 = new Prevoznik();
		// p3.setAdresa("Beograd");
		// p3.setPib("123456789");
		// p3.setNaziv("Lasta");
		// prevoznikService.save(p3);
		//
		// Prevoznik p4 = new Prevoznik();
		// p4.setAdresa("Kraljevo");
		// p4.setPib("123456789");
		// p4.setNaziv("Farlang");
		// prevoznikService.save(p4);
		//
		// Linija l1 = new Linija();
		// l1.setCena(640.0);
		// l1.setBrojMesta(48);
		// l1.setDestinacija("Novi Sad");
		// l1.setVremePolaska("08:00");
		// p1.addLinija(l1);
		// linijaService.save(l1);
		//
		// Linija l2 = new Linija();
		// l2.setCena(1200.0);
		// l2.setBrojMesta(51);
		// l2.setDestinacija("Beograd");
		// l2.setVremePolaska("09:00");
		// p2.addLinija(l2);
		// linijaService.save(l2);
		//
		// Linija l3 = new Linija();
		// l3.setCena(120.0);
		// l3.setBrojMesta(36);
		// l3.setDestinacija("Tavankut");
		// l3.setVremePolaska("10:00");
		// p3.addLinija(l3);
		// linijaService.save(l3);
		//
		// Linija l4 = new Linija();
		// l4.setCena(1100.0);
		// l4.setBrojMesta(44);
		// l4.setDestinacija("Kraljevo");
		// l4.setVremePolaska("11:00");
		// p4.addLinija(l4);
		// linijaService.save(l4);
		//
	}
}
