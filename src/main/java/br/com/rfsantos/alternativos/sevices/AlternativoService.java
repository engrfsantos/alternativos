package br.com.rfsantos.alternativos.sevices;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.rfsantos.alternativos.domain.Alternativo;
import br.com.rfsantos.alternativos.repositories.AlternativoRepository;

@Service
public class AlternativoService {

	@Autowired
	AlternativoRepository repo;

	public Alternativo findById(Long id) {
		Optional<Alternativo> obj = repo.findById(id);
		return obj.orElse(null);
	}


	public List<Alternativo> listar(){
		List<Alternativo> obj = repo.findAll();
		return obj;
	}

	
	public void save(Alternativo alternativo) {
		repo.save(alternativo);
	}



}
