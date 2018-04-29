package com.sv.core;

public class DemoCallByValCallByRef {

	
	 static int count = 10;
	 
	 public static void main (String args[]){
		 
		 DemoCallByValCallByRef demo = new DemoCallByValCallByRef();
		 
		 /*
		  *  If we call a method passing a value, it is known as call by value.
		  *  The changes being done in the called method, is not affected in the calling method
		  */
		 
		 System.out.println("before method call - count "+count);
		 
		 demo.increaseTheCount (count);
		 System.out.println("After method call - count "+count);
		 
		 /*
		  * In case of call by reference original value is changed if we made changes in the called method.
		  * If we pass object in place of any primitive value, original value will be changed.
		  */
		 
		 System.out.println("before method call - count "+count);
		 
		 demo.decreaseTheCount (demo);
		 System.out.println("After method call - count "+count);
		 
	 }
	 
	 void increaseTheCount(int count){
		 
		 count = count+10;
	 }
	 
	 void decreaseTheCount(DemoCallByValCallByRef demo){
		 demo.count = 5;
	 }
}
