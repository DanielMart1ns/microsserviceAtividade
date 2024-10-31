package br.com.daniel.usecase;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.daniel.domain.Produto;
import br.com.daniel.repository.IProdutoRepository;
import jakarta.validation.Valid;

@Service
public class ServiceProduto {

	private IProdutoRepository produtoRepository;
	
	@Autowired
	public ServiceProduto(IProdutoRepository produtoRepository) {
		this.produtoRepository = produtoRepository;
	}
	
	public Produto cadastrar(@Valid Produto produto) {
		return this.produtoRepository.insert(produto);
	}
	
	public Produto alterar(@Valid Produto produto) {
		return this.produtoRepository.save(produto);
	}
	
	public Optional<Produto> buscar(Long codigo) {
		return this.produtoRepository.findByCodigo(codigo);
	}
}
