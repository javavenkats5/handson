package com.sv.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {

		Customer a1 = new Customer(111, "Venkat", 50000);
		Customer a2 = new Customer(222, "Sri", 20000);
		Customer a3 = new Customer(333, "Kannayyalu", 80000);

		List<Customer> list = new ArrayList<Customer>();

		list.add(a3);
		list.add(a1);
		list.add(a2);
		System.out.println("List before sort: " + list);

		Comparator<Customer> compareByName = new Comparator<Customer>() {

			public int compare(Customer a1, Customer a2) {
				String name1 = a1.getFirstName();
				String name2 = a2.getFirstName();
				// ascending order
				return name1.compareTo(name2);
				// descending order
				// return fruitName2.compareTo(fruitName1);
			}
		};
		Collections.sort(list, compareByName);
		System.out.println("List after sort by name: " + list);

		Comparator compareByBalance = new Comparator<Customer>() {
			@Override
			public int compare(Customer o1, Customer o2) {
				return o1.getBalance() - o2.getBalance();
			}
		};

		Collections.sort(list, compareByBalance);

		System.out.println("List after sort by balance: " + list);
	}

}

