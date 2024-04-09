package com.assignmentjavaconfig;

public class EmailService {
	
	private DataSource dataSource;
	
	public EmailService(DataSource dataSource) {
		this.dataSource = dataSource;
	}
	
	
	public void sendEmails() {
		System.out.println("Hey, Printing "+dataSource.getClass().getSimpleName()+" class's Emails");
		String []emails = dataSource.getEmails();
		for(String e : emails) {
			System.out.println(e);
		}
	}
	

}
