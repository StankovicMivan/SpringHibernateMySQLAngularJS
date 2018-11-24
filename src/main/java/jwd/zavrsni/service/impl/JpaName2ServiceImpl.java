package jwd.zavrsni.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import jwd.zavrsni.service.Name2Service;



@Service
public class JpaName2ServiceImpl implements Name2Service{
/*
    @Autowired
	private PrevoznikRepository prevoznikRepository;
	
	@Override
	public List<Prevoznik> findAll() {
		
		return prevoznikRepository.findAll();
	}

	@Override
	public Prevoznik findOne(Long id) {
		
		return prevoznikRepository.findOne(id);
	}

	@Override
	public Prevoznik save(Prevoznik prevoznik) {
	
		return prevoznikRepository.save(prevoznik);
	}

	@Override
	public void remove(Long id) {
		prevoznikRepository.delete(id);
		
	}

	@Override
	public Page<Prevoznik> findAll(int pageNum) {
		
		return prevoznikRepository.findAll(new PageRequest(pageNum, 5));
	}

 */
}
