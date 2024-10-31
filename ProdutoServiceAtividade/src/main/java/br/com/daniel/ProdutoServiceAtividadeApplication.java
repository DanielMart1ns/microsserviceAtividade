package br.com.daniel;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;

@SpringBootApplication
@RefreshScope
public class ProdutoServiceAtividadeApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProdutoServiceAtividadeApplication.class, args);
	}

}
