package br.com.rfsantos.alternativos.resources;

import java.text.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;



import br.com.rfsantos.alternativos.sevices.AlternativoService;


@RestController
@RequestMapping("/alternativos")
public class AlternativosResource {

	@Autowired
	private AlternativoService alternativosService;

	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView lancamentoProducao () throws ParseException {
		ModelAndView modelAndView = new ModelAndView("Alternativos");
		modelAndView.addObject("alternativos", alternativosService.listar());
		
		return modelAndView;
		}

	
	// /alternativos/101
	@RequestMapping(value="/alternativos/{id}", method=RequestMethod.GET)
	public ModelAndView lancamentoId (@PathVariable String id)  {
		ModelAndView modelAndView = new ModelAndView("Alternativos");
		modelAndView.addObject("alternativos", alternativosService.listar(id));
		return modelAndView;
		}

	
	
	
}
