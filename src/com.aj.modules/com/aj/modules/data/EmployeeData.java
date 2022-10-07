package com.aj.modules.data;

import java.util.ArrayList;

public class EmployeeData {
	
	ArrayList<String> employees = new ArrayList<String>() {
		{
			add("Aman");
			add("Arhaan");
			add("Suraj");
			add("Abhishek");
		}
	};
	
	public ArrayList<String> getEmployees() {
		return employees;
	}
	
	public int getEmployeeCount() {
		return employees.size();
	}
	
	
	
	
}