package com.sv.core.deepshallowcopy;

public class Student implements Cloneable {

	int rollno;  
	String name;  
	Subject subject;
	Division division;
	  
	
	public Division getDivision() {
		return division;
	}


	public void setDivision(Division division) {
		this.division = division;
	}


	public int getRollno() {
		return rollno;
	}


	public void setRollno(int rollno) {
		this.rollno = rollno;
	}


	public String getName() {
		return name;
	}


	public Subject getSubject() {
		return subject;
	}


	public void setSubject(Subject subject) {
		this.subject = subject;
	}


	public void setName(String name) {
		this.name = name;
	}


	/*//Shallow copy
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}*/
	
	
	protected Object clone() throws CloneNotSupportedException{
		Student student = (Student) super.clone();
		// Deep Copy - enable below
       // student.division = (Division) division.clone();
 
        return student;
	}
}
