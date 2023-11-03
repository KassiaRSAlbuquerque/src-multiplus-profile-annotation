package io.github.kassiarsalbuquerque.Vendas.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.github.kassiarsalbuquerque.Vendas.model.Cliente;
import io.github.kassiarsalbuquerque.Vendas.repository.ClienteRepository;

@Service
public class ClienteService {
	
	/*
	 * classe com regra de negocio, com validacoes, objeto q
	 * chama a base dados
	 */
	@Autowired
	ClienteRepository clienteRepository;
	
	public void salvarCliente(Cliente  cliente) {
		validarCliente(cliente);
		this.clienteRepository.persistir(cliente);
	}
	
	private void validarCliente(Cliente  cliente) {
		//aplicar validacoes
	}
}
