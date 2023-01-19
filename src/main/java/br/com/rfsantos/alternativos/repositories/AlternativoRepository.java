package br.com.rfsantos.alternativos.repositories;


import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.alternativos.domain.Alternativo;


public interface AlternativoRepository extends JpaRepository<Alternativo, Long> {
	@Query(value = "SELECT u from Alternativo u WHERE u.id = :codigo")
	List<Alternativo> prodAlternativoId(@Param("codigo") String codigo);
}
