package jwd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwd.model.Competition;

@Repository
public interface CompetitionRepository extends JpaRepository<Competition, Long>{

}
