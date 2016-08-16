package com.projeto.controller;

import javax.validation.Valid;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.projeto.model.Fornecedor;
import com.projeto.repository.Fornecedores;
import com.projeto.service.CadastroFornecedoresService;

@Controller
@RequestMapping("/fornecedores")
public class FornecedoresController {
	
	@Autowired
	private CadastroFornecedoresService cadastroFornecedoresService;
	
	@RequestMapping("/novo")
	public ModelAndView novo(Fornecedor fornecedor) {
		ModelAndView mv = new ModelAndView("/fornecedor/CadastroFornecedor");
		//mv.addObject();
		return mv;
	}
	
	@RequestMapping(value = "/novo",method = RequestMethod.POST)
	public ModelAndView salvar(@Valid Fornecedor fornecedor,BindingResult result,RedirectAttributes attributes) {
		if(result.hasErrors()){
			return novo(fornecedor);
		}
		
		cadastroFornecedoresService.salvar(fornecedor);
		attributes.addFlashAttribute("mensagem","Fornecedor salvo com sucesso!");
		return new ModelAndView("redirect:/fornecedores/novo");
	}
	
	@RequestMapping
	public String pesquisa() {
		return "/produto/PesquisaFornecdores";
	}
	
}
