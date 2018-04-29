package com.sv.core.deepshallowcopy;

public class DeepCopyClone {

	public static void main(String[] args) throws CloneNotSupportedException{
		Student student1 = new Student();
		Division division = new Division();
		
		student1.setRollno(30);
		student1.setName("Veeksha");
		
		division.setGrade("FirstClass");
		student1.setDivision(division);
		
		
		Student student2 = (Student)student1.clone();
		
		student2.setName("Srilatha");
		student2.getDivision().setGrade("SeconClass");
		
		System.out.println("Original std record rollNo ="+student1.rollno+" Name = "+student1.name +" Division is : "+student1.getDivision());
		System.out.println("Cloned std record rollNo ="+student2.rollno+" Name = "+student2.name + " Division is : "+ student2.getDivision()); 

		

	}

}
