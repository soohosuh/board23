package org.astro.board23;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class Board23Application {

	public static void main(String[] args) {
		SpringApplication.run(Board23Application.class, args);
	}

}
