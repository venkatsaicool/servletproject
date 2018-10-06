package com.saiv.proj;

import java.util.ArrayList;
import java.util.List;


public class CustomerService {
List<Customer> std1 = new ArrayList<Customer>();
	
	CustomerService() {
	}
	
	public void save(Customer std) {
		std1.add(std);
		System.out.println("adding studnnet name");
		for (Customer student : std1) {
		//System.out.println(student);
	}
		
	}
	public List<Customer> dispaly() {
	for (Customer student : std1) {
			System.out.println(student);
		}
		return std1;
	}
	
	




	}


