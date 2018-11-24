package jwd.zavrsni.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;





@Repository
public interface Name1Repository /* extends JpaRepository<Name1, Long> */ {

	/*	Page<Linija> findByPrevoznikId(Long prevoznikId, Pageable pageRequest);
	
	@Query("SELECT l FROM Linija l WHERE "
			+ "(:destinacija IS NULL or l.destinacija like :destinacija ) AND "
			+ "(:prevoznikId IS NULL OR l.prevoznik.id = :prevoznikId  ) AND "
			+ "(:maxC IS NULL OR l.cena <= :maxC)"
			)
	Page<Linija> pretraga(
			@Param("destinacija") String destinacija, 
			@Param("prevoznikId") Long prevoznikId, 
			@Param("maxC") Double maxC, Pageable pageRequest);

 */
}
