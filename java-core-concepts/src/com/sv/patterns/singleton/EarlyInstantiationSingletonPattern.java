package com.sv.patterns.singleton;

public class EarlyInstantiationSingletonPattern {
	
	//Early, instance will be created at load time  
	private static EarlyInstantiationSingletonPattern obj = new EarlyInstantiationSingletonPattern();
	
	// Private constructor
	private EarlyInstantiationSingletonPattern(){
		
	}
	
	// static factory method
    public static EarlyInstantiationSingletonPattern getInstance(){
    	return obj;
    }
}
