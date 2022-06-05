package com.techreturners.bookmanager;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.GroupedOpenApi;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BookmanagerApplication {

	@Bean
	public GroupedOpenApi swaggerConfiguration() {
		return GroupedOpenApi.builder()
				.group("APIBookManager")
				.pathsToMatch("/api/v1/book/**")
				.build();
	}
	@Bean
	public OpenAPI bookManagerInfoApi() {
		return new OpenAPI()
				.info(new Info().title("\uD83E\uDD57 Minimalist Book Manager API")
						.description("Need a helping hand to manage your books? This is the API for you! \uD83D\uDE3A")
						.version("v1")
						.license(new License().name("Apache 2.0").url("http://springdoc.org")));
	}

	public static void main(String[] args) {
		SpringApplication.run(BookmanagerApplication.class, args);
	}

}
