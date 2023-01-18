package br.com.rfsantos.alternativos.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.rfsantos.alternativos.domain.Produto;
import br.com.rfsantos.alternativos.sevices.ProdutoService;



@RestController
@RequestMapping("/produtos")
public class ProdutosResource {

	@Autowired
	private ProdutoService produtoService;

		@RequestMapping(method=RequestMethod.GET)
		public ResponseEntity<?> list(){
			List<Produto> obj = produtoService.listar();
			return ResponseEntity.ok().body(obj);
		}

		@RequestMapping(value="/{id}", method=RequestMethod.GET)
		public ResponseEntity<?> find(@PathVariable String id){
			Produto obj = produtoService.findById(id);
			return ResponseEntity.ok().body(obj);
		}



}
