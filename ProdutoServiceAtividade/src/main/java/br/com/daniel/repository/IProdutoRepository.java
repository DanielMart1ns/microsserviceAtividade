package br.com.daniel.repository;

import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.daniel.domain.Produto;

public interface IProdutoRepository extends MongoRepository<Produto, String>{
	Optional<Produto> findByCodigo(Long codigo);
}
