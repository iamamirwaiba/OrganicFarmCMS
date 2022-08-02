package org.ismt.organicfarmcms;

import lombok.RequiredArgsConstructor;
import org.ismt.organicfarmcms.RemainingLeave.RemainingLeave;
import org.ismt.organicfarmcms.RemainingLeave.RemainingLeaveRepo;
import org.ismt.organicfarmcms.User.UserRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

import javax.transaction.Transactional;

@SpringBootApplication
@RequiredArgsConstructor
public class OrganicfarmcmsApplication implements CommandLineRunner {


	private final UserRepo userRepo;
	private final RemainingLeaveRepo remainingLeaveRepo;

	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	public static void main(String[] args) {
		SpringApplication.run(OrganicfarmcmsApplication.class, args);
	}

	@Override
	@Transactional
	public void run(String... args) throws Exception {
//		remainingLeaveRepo.updateRemainingLeave(4,7);
	}
}
