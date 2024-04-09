package com.assignmentjavaconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Client {
	public static void main(String[] args) {
		
		
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		
		EmailService emailBean = context.getBean(EmailService.class);
		emailBean.sendEmails();
		
	}
}