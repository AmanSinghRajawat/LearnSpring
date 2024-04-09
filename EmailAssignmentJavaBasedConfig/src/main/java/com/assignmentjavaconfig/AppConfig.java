package com.assignmentjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.assignmentjavaconfig")
public class AppConfig {

	@Bean
	public DataSource getMySQLBean() {
		return new MySQLDataSource();
	}
	
	@Bean
	public DataSource getPostgreBean() {
		return new PostgreDataSource();
	}
	
	
	@Bean
	public EmailService emailService() {
		return new EmailService(getPostgreBean());
	}
	
}
