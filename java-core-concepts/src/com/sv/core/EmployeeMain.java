package com.sv.core;

import java.util.ArrayList;
import java.util.List;

public class EmployeeMain {

	public static void main(String[] args) {
		
		List employeeList = new ArrayList();
		Employee emp1 = new Employee();
		emp1.setEmpName("Veeksha");
		emp1.setId(10);
		
		Employee emp2 = new Employee();
		emp2.setEmpName("Veeksha");
		emp2.setId(10);
		
		Employee emp3 = new Employee();
		emp3.setEmpName("Veeksha");
		emp3.setId(20);
		
		employeeList.add(emp1);
		
		System.out.println("Employee List .. "+employeeList);
		
		if (!employeeList.contains(emp2)){
			employeeList.add(emp2);
		}
		System.out.println("Employee List .. "+employeeList);
		
		if (!employeeList.contains(emp3)){
			employeeList.add(emp3);
		}
		System.out.println("Employee List .. "+employeeList);
		
	}

}
class Employee {

	
	int id;
	String empName;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getEmpName() {
	return empName;
}
public void setEmpName(String empName) {
	this.empName = empName;
}


@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + id;
	return result;
}

@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Employee other = (Employee) obj;
	if (id != other.id)
		return false;
	return true;
}

@Override
public String toString() {
	return "Employee [id=" + id + ", empName=" + empName+" ]";
}






}

