package jwd.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import jwd.model.Team;





@Repository
public interface TeamRepository extends JpaRepository<Team, Long>{

	List<Team> findByCompetitionId(Long competitionId);
	
	@Query("SELECT t FROM Team u WHERE "
			+ "(:competitionId IS NULL or t.competitionId.id = :competitionId ) AND "
			+ "(:name IS NULL OR t.name like :name  )"
			)
	Page<Team> pretraga(
			@Param("competitionId") Long competitionId, 
			@Param("name") String name, Pageable pageRequest);

 
}
