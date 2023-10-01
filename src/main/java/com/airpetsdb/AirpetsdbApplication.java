package com.airpetsdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class AirpetsdbApplication {

	public static void main(String[] args) {
		SpringApplication.run(AirpetsdbApplication.class, args);
	}

	@Bean
	public WebMvcConfigurer conrsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				// registry.addMapping("/**").allowedOrigins("http://localhost:4200");
				registry.addMapping("/api/**").allowedOrigins("http://localhost:4200", "http://localhost:4000")
						.allowedMethods("PUT", "DELETE", "GET", "POST")
						.allowedHeaders("http://localhost:4200/users/{emailAddress}/{password}",
								"http://localhost:4000/users/{emailAddress}/{password}")
						.allowedHeaders("http://localhost:4200/updateUser/{id}",
								"http://localhost:4000/updateUser/{id}")
						.exposedHeaders("http://localhost:4200/updateUser/{id}",
								"http://localhost:4000/updateUser/{id}")
						.allowCredentials(false).maxAge(3600);
			}
		};
	}

}
