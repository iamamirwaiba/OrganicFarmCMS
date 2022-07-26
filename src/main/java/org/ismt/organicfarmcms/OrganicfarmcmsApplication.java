package org.ismt.organicfarmcms;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.User.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@RequiredArgsConstructor
public class OrganicfarmcmsApplication implements CommandLineRunner {


	private final UserRepo userRepo;

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(OrganicfarmcmsApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		User user=new User("9889","admin123","admin");
//		userRepo.save(user);
	}
}
