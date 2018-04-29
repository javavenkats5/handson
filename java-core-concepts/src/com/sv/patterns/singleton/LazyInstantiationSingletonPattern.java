package com.sv.patterns.singleton;

import java.io.Serializable;

public class LazyInstantiationSingletonPattern implements Serializable{

	private static LazyInstantiationSingletonPattern obj;
	private LazyInstantiationSingletonPattern(){
		
	}
	
	private static  LazyInstantiationSingletonPattern getInstance(){
		if (obj == null){
			synchronized(LazyInstantiationSingletonPattern.class){  
		        if (obj == null){  
		            obj = new LazyInstantiationSingletonPattern();//instance will be created at request time  
		        }  
		    }   
		}
		return obj;
	}
	/*Avoids creating new instance when object is serialized and deserialized back, restore same instance.*/
	protected Object readResolve() {  
        return getInstance();  
    }  
}
