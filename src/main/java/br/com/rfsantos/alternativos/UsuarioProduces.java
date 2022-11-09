package br.com.rfsantos.alternativos;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;

import br.com.rfsantos.alternativos.domain.Usuario;

@Controller
public class UsuarioProduces {



	public UsuarioProduces() {
	}

		@Bean
		public Usuario getUsuario() {
			return new Usuario("2320", "reginaldo2320", "franco", "Reginaldo", "A",   "A",   "INSP");
		}

		public Usuario setUsuario(Usuario usuario) {
			return new Usuario(usuario);
		}





}
