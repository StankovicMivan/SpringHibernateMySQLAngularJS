package jwd.zavrsni.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import jwd.zavrsni.service.Name1Service;
import jwd.zavrsni.service.NameDodatnoService;



@Service
public class JpaName1ServiceImpl implements Name1Service{
/*	@Autowired
	private LinijaRepository linijaRepository;
	
	@Override
	public Page<Linija> findAll(int pageNum) {
		
		return linijaRepository.findAll(new PageRequest(pageNum, 5));
	}

	@Override
	public Linija findOne(Long id) {
		
		return linijaRepository.findOne(id);
	}

	@Override
	public void save(Linija linija) {
	
		linijaRepository.save(linija);
	}

	@Override
	public void remove(Long id) {
	
		linijaRepository.delete(id);
		
	}

	@Override
	public Page<Linija> findByPrevoznikId(int pageNum, Long prevoznikId) {
		return linijaRepository.findByPrevoznikId(prevoznikId,  new PageRequest(pageNum, 5));
	}

	@Override
	public Page<Linija> pretraga(String destinacija, Long prevoznikId, Double maxC, int page) {
		if(destinacija != null) {
			destinacija = "%" + destinacija + "%";
		}
		
		return linijaRepository.pretraga(destinacija, prevoznikId, maxC,  new PageRequest(page, 5));
	}

	*/
}
