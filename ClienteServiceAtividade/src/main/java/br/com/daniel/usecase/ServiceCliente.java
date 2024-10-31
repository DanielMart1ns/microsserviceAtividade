package br.com.daniel.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daniel.domain.Cliente;
import br.com.daniel.repository.IClienteRepository;
import jakarta.validation.Valid;

@Service
public class ServiceCliente {
	private IClienteRepository clienteRepository;
	
	@Autowired
	public ServiceCliente(IClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	public Cliente cadastrar(@Valid Cliente cliente) {
		return this.clienteRepository.insert(cliente);
	}
	
	public Cliente alterar(@Valid Cliente cliente) {
		return this.clienteRepository.save(cliente);
	}
	
	public Optional<Cliente> pesquisar(Long cpf) {
		return this.clienteRepository.findByCpf(cpf);
	}
}
