package com.estudo.cursomc.config;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.estudo.cursomc.services.DBService;
import com.estudo.cursomc.services.EmailService;
import com.estudo.cursomc.services.MockEmailService;
import com.estudo.cursomc.services.SmtpEmailService;

@Configuration
@Profile("test")
public class TestConfig {

	@Autowired
	private DBService dbService;

	@Bean
	public boolean instantiateDatabase() throws ParseException {
		dbService.instantiateTestDatabase();
		return true;
	}
	
//	@Bean
//	public EmailService emailService() {
//		return new MockEmailService();
//	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
