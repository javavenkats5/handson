package com.sv.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableMain {

	public static void main(String[] args) {

		Account a1=new Account(111,"Venkat", 50000);
		Account a2=new Account(222,"Sri", 20000);
		Account a3=new Account(333,"Kannayyalu", 80000);
		
		List<Account> list=new ArrayList<Account>();
		
		list.add(a3);
		list.add(a1);
		list.add(a2);
		System.out.println("List before sort: "+list);
		Collections.sort(list); 
		System.out.println("List after sort by accntNo: "+list);
	}

}
