package javaWebDevelopment.repository;


import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.model.Format;

@Repository
public interface FormatRepository extends JpaRepository<Format, Long>{

	Optional<Format> findById(Long id);

}
