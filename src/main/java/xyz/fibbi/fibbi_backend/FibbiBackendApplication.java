package xyz.fibbi.fibbi_backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication( exclude = { SecurityAutoConfiguration.class})
public class FibbiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibbiBackendApplication.class, args);
	}

}
