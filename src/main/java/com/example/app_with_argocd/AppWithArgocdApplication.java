package com.example.app_with_argocd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class AppWithArgocdApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppWithArgocdApplication.class, args);
	}

}
