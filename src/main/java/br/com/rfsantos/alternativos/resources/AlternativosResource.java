package br.com.rfsantos.alternativos.resources;

import java.text.ParseException;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



import br.com.rfsantos.alternativos.domain.Alternativo;
import br.com.rfsantos.alternativos.sevices.AlternativoService;


@RestController
@RequestMapping("/alternativos")
public class AlternativosResource {

	@Autowired
	private AlternativoService alternativosService;
	private List<Alternativo> alternativos;
	
	// /alternativos
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView lancamentoProducao () throws ParseException {
		ModelAndView modelAndView = new ModelAndView("Lancamento");
		modelAndView.addObject("alternativos", alternativosService.listar());
		
		return modelAndView;
		}

	
	// /alternativos/101
	@RequestMapping(value="/alternativos/{codigo}", method=RequestMethod.GET)
	public ModelAndView lancamentoId (@PathVariable String codigo)  {
		ModelAndView modelAndView = new ModelAndView("Alternativos");
	
			alternativos = alternativoService.findById(codigo);
			modelAndView.addObject("alternativos", alternativos);
	
		modelAndView.addObject("locais", setor.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);

		//List<ProdDefeito> prodDefeitos = producao.getProdDefeitos();
		List<ProdDefeito> prodDefeitos = prodDefeitoService.prodDefeitosProducaoId(producao);
		
		
		modelAndView.addObject("proddefeitos", prodDefeitos);
		
		modelAndView.addObject("producao", producao);		
		modelAndView.addObject("proddefeito", new ProdDefeito(producao));
		
		List<Defeito> defeitos = defeitoService.FindByLeitura(producao.getLeitura());
		modelAndView.addObject("defeitos",  defeitos);
		modelAndView.addObject("locais", setor.listar());
		
		modelAndView.addObject("condicoes", this.condicao.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);

		return modelAndView;
		}

	
	
	// /lancamento (POST)
	@PostMapping
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView salvar(@Autowired Producao producao, @RequestParam(value="condicao", required = true) String condicao) {
	
		ModelAndView modelAndView = new ModelAndView("Lancamento");
		String leitura = producao.getLeitura();
		Produto produto = produtoService.produtoEan(leitura);
	
		producao.setProdutoId(produto.getId());
		producao.setDescricao(produto.getDescricao());
		producao.setSetorId(filtro.getSetor());
		producao.setUsuarioId(filtro.getUsuario().getId());
		String serie = producao.getLeitura().substring(18,24);
		producao.setSerie(serie);
		producao.setCondicao(this.condicao.findById(Integer.parseInt(condicao)));
		producao.setSetorId(filtro.getSetor());
		producao.setPostoId(filtro.getPosto());
	
		this.producaoService.save(producao);
	
		modelAndView.addObject("producoes", producaoService.producoesId(producao.getId()));
		modelAndView.addObject("locais", setor.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("filtro", filtro);
		modelAndView.addObject("proddefeitos", prodDefeitoService.prodDefeitosProducaoId(producao));
		modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));
	
		modelAndView.addObject("condicoes", this.condicao.listar());
		modelAndView.addObject("producao", producao);
		modelAndView.addObject("proddefeito", new ProdDefeito());
	
		return modelAndView;
	}
	
	// /lancamento/producao/id (POST)
	@PostMapping
	@RequestMapping(value="/producao/{id}",method=RequestMethod.POST)
	public ModelAndView salvar(@PathVariable Long id, ProdDefeito prodDefeito) throws ParseException { 	
		ModelAndView modelAndView = new ModelAndView("Lancamento");
		
		producao = producaoService.findById(id);
	
		modelAndView.addObject("producoes", producao);
		modelAndView.addObject("locais", setor.listar());
		modelAndView.addObject("postos", this.posto.listar());
		modelAndView.addObject("condicoes", this.condicao.listar());
		modelAndView.addObject("filtro", filtro);	
		modelAndView.addObject("defeitos",  defeitoService.FindByLeitura(producao.getLeitura()));
	
		
		prodDefeito.setProducao(producao);
		
		List<ProdDefeito> prodDefeitos = producao.getProdDefeitos();
		prodDefeitos.add(prodDefeito);
		
		producao.setProdDefeitos(prodDefeitos);
		
		this.prodDefeitoService.save(prodDefeito);
		this.producaoService.save(producao);
		
		
		
		modelAndView.addObject("producao",  producao);
		modelAndView.addObject("proddefeitos", producao.getProdDefeitos());
		modelAndView.addObject("proddefeito", new ProdDefeito());
		
		return modelAndView;
		}

}
