package com.sv.java8;
public class MyClassInterfaceTest implements Interface1, Interface2 {

	@Override
	public void method2() {
	}

	@Override
	public void method1(String str) {
	}
 
	@Override
	public void log(String str){
		System.out.println("MyClass logging::"+str);
		Interface2.super.log("calling-1 ");
	}
	
	public static void main(String[] args) {
		 
		MyClassInterfaceTest myClass=new MyClassInterfaceTest();
		myClass.log("Lets see: ");
		
	}
} 