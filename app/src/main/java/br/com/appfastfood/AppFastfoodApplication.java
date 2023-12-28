package br.com.appfastfood;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
@OpenAPIDefinition(info = @Info(
		title = "API - Produção",
		version = "0.0.1-SNAPSHOT",
		description = "Seja bem vindo(a) a especificação da API de Produção! Aqui há funcionalidade relacionada a área de Produção"
))
public class AppFastfoodApplication {
	public static void main(String[] args) {
		SpringApplication.run(AppFastfoodApplication.class, args);
	}

}
