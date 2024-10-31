package br.com.daniel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "produto")
@Getter
@Setter
@Builder
public class Produto {
	
	@Id
	private String id;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String descricao;
	
	@NotNull
	@Indexed(unique = true)
	private Long codigo;
	
	@NotNull
	private Long preco;
	
	@NotNull
	private Boolean possuiEmEstoque;
}
