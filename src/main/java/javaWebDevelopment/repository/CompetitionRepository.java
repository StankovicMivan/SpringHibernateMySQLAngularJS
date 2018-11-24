package javaWebDevelopment.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.model.Team;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long>{

	Optional<Competition> findById(Long id);

}
