package com.sena._2.digitalDream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = "com.sena._2.digitalDream")
@EntityScan("com.sena._2.digitalDream.modelos")
@EnableJpaRepositories("com.sena._2.digitalDream.repository")
public class DigitalDreamApplication {

	public static void main(String[] args) {
		SpringApplication.run(DigitalDreamApplication.class, args);
	}

}
