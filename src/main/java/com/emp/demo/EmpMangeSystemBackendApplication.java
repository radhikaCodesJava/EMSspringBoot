package com.emp.demo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication(scanBasePackages = "com.emp.demo")
public class EmpMangeSystemBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmpMangeSystemBackendApplication.class, args);
	}

	@Value("${allowed.origin}")
	private String allowedOrigin;
	
	//this method instead of here,it can also be written in config class
	//where we write swagger method, in that class i'm referring too.
	/*@Bean
	public WebMvcConfigurer corsConfigurer()
	{
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**")
				       .allowedOrigins("http://localhost:4200");
				       //.allowedOrigins(allowedOrigin);
				       //.allowedOrigins("http://localhost:4200","http://localhost:4201");
				       //.allowedOrigins("*");
				       //.allowedMethods("GET","POST","PUT");
				       //.allowedMethods("*");
				       //.allowedHeaders("*"); 
			}
		};
	}*/
}
