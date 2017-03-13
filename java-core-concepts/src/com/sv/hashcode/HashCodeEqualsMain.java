package com.sv.hashcode;

import java.util.ArrayList;
import java.util.List;

public class HashCodeEqualsMain {

	public static void main(String[] args) {

		
		Shape s1=new Shape(100, "Oval");
		Shape s2=new Shape(200, "Circle");
		
		List<Shape> shapesList=new ArrayList<Shape>(); 
		shapesList.add(s1);
		shapesList.add(s2);
		System.out.println("shapesList:"+shapesList);
		
		Shape s3=new Shape(100, "Oval");
		
		if(!shapesList.contains(s3)){
			shapesList.add(s3);
		}
		
		System.out.println("\nResult shapesList:"+shapesList);
	}

}
