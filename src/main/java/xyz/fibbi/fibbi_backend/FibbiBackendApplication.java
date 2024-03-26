package xyz.fibbi.fibbi_backend;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import xyz.fibbi.fibbi_backend.model.User;
import xyz.fibbi.fibbi_backend.repository.UserRepository;

@SpringBootApplication( exclude = { SecurityAutoConfiguration.class})
public class FibbiBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(FibbiBackendApplication.class, args);
	}

	@Bean
	public CommandLineRunner run(UserRepository userRepository) throws Exception {
		return (String[] args) -> {
			User user1 = new User("John", "john@domain.com");
			User user2 = new User("Julie", "julie@domain.com");
			userRepository.save(user1);
			userRepository.save(user2);
			userRepository.findAll().forEach(user -> System.out.println(user));
		};
	}
}
