package com.projeto.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.model.Fornecedor;
import com.projeto.repository.Fornecedores;

@Service
public class CadastroFornecedoresService {
	
	@Autowired
	private Fornecedores fornecedores;
	
	public void salvar(Fornecedor fornecedor){
		this.fornecedores.save(fornecedor);
	}
}
