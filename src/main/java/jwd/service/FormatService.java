package jwd.service;

import java.util.List;

import jwd.model.Format;



public interface FormatService {
	List<Format> findAll();
	Format findOne(Long id);
	Format save(Format format);
	void remove(Long id);
}
