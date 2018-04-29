package com.sv.core.deepshallowcopy;

public class ShallowCopyClone {

	public static void main(String args[]) throws CloneNotSupportedException{
		Student student1 = new Student();
		Subject subject1 = new Subject();
		
		student1.setRollno(30);
		student1.setName("Veeksha");
		
		subject1.setSubject("Maths");
		student1.setSubject(subject1);
		
		
		Student student2 = (Student)student1.clone();
		
		student2.setName("Srilatha");
		student2.getSubject().setSubject("Sciense");
		
		System.out.println("Original std record rollNo ="+student1.rollno+" Name = "+student1.name +" Subject is : "+student1.getSubject());
		System.out.println("Cloned std record rollNo ="+student2.rollno+" Name = "+student2.name + " Subject is : "+ student2.getSubject()); 

		// Note: Here the Subject object is not cloned properly.
	}
}
