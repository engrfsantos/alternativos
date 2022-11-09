package br.com.rfsantos.alternativos.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import br.com.rfsantos.alternativos.domain.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, String> {

	@Query(value = "Select u from Usuario u wHERE u.nomeAcesso = :nomeAcesso")
	Usuario findByNomeAcesso(@Param("nomeAcesso") String nomeAcesso);

}
