package javaWebDevelopment.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import javaWebDevelopment.model.Competition;
import javaWebDevelopment.model.Team;





@Repository
public interface TeamRepository extends JpaRepository<Team, Long> {

		List<Team> findByCompetitionId(Long competitionId, Pageable pageRequest);
	
	@Query("SELECT t FROM Team t WHERE "
			+ "(:competitionId IS NULL OR t.competition.id = :competitionId  ) "
			)
	Page<Team> pretraga(
			@Param("competitionId") Long competitionId, Pageable pageRequest);

	Optional<Team> findById(Long id);
}
