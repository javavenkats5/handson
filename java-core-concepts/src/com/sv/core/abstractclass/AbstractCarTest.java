package com.sv.core.abstractclass;

public class AbstractCarTest {

	public static void main(String[] args) {
		
		Car car=new Honda();
		car.setColor("Red");
		System.out.println("Honda:"+car);
		
		 car=new Toyoto();
		car.setColor("Green");
		System.out.println("Toyoto:"+car);
	} 
}
