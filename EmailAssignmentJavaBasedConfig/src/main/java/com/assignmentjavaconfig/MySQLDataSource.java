package com.assignmentjavaconfig;


public class MySQLDataSource implements DataSource {

	String [] emails = {"jonh@g.c", "maria@g.c"};
	public String[] getEmails() {
		return emails;
	}
	
}
