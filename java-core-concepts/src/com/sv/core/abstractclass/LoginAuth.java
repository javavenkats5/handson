package com.sv.core.abstractclass;
public abstract class LoginAuth{
   public String encryptPassword(String pass){
	   // Implement the same default behavior here 
       // that is shared by all subclasses.
	return pass;
   }

   // Each subclass needs to provide their own implementation of this only:
   public abstract void checkDBforUser();
}