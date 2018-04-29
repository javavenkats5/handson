package com.sv.core.deepshallowcopy;

public class Division {

	String grade;

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Division [grade=" + grade + "]";
	}
	
	/* protected Object clone() throws CloneNotSupportedException
	    {
	        return super.clone();
	    }
	*/
}
