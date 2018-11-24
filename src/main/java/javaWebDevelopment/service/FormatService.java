package javaWebDevelopment.service;


import java.util.List;
import java.util.Optional;

import javaWebDevelopment.model.Format;

public interface FormatService {

	List<Format> findAll();
	Format findOne(Long id);
	Format save(Format format);
	void remove(Long id);
}
