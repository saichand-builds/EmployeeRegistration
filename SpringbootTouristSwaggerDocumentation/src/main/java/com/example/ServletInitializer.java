package com.example;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

public class ServletInitializer extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(SpringbootTouristSwaggerDocumentation.class);
	}

}
// use the below end point
// http://localhost:8080/Springboot-Tourist-Data/swagger-ui/index.html
