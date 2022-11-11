package br.com.rfsantos.alternativos.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import br.com.rfsantos.alternativos.domain.Alternativo;

public interface AlternativoRepository extends JpaRepository<Alternativo, Long> {

	
	
}
