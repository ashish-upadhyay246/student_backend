package com.hexaware.manymany;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;

@Configuration
public class SwaggerConfig {
	
	@Bean
	OpenAPI getOpenApi() {
		Info info = new Info();
		info.setTitle("LabOp Documentation Swagger");
		OpenAPI api = new OpenAPI();
		api.setInfo(info);
		return api;
	}

}