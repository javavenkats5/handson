package com.sv.core.deepshallowcopy;

public class Subject {

	String subject;
	
	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public String toString() {
		return "Subject [subject=" + subject + "]";
	}
}
