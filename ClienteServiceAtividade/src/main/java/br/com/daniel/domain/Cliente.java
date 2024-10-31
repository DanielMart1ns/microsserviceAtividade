package br.com.daniel.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Document(collection = "cliente")
@Getter
@Setter
@Builder
public class Cliente {
	
	@Id
	private String id;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String nome;
	
	@NotNull
	@Indexed(unique = true, background = true)
	private Long cpf;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String estado;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String cidade;
	
	@NotNull
	@Size(min = 1, max = 50)
	private String bairro;
	
	@NotNull
	private Integer numero;
}
