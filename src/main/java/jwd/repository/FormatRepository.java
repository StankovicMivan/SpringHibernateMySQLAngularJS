package jwd.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import jwd.model.Format;

@Repository
public interface FormatRepository extends JpaRepository<Format, Long> {

}
