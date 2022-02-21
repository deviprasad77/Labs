package com.cg.eis.service;

import java.util.HashMap;
import com.cg.eis.bean.Employee;



public class EmployeeServiceImpl implements EmployeeService {
	   
HashMap<Integer,Employee> empList=new HashMap<>();
	
	
	public String addDetails(int key,Employee emp) 
	{
	
		 String designation=designationCheck(emp.getSalary());
		 emp.setDesignation(designation);
		 String insuranceScheme=applyInsuranceScheme(emp.getSalary());
		 emp.setInsuranceScheme(insuranceScheme);
		empList.put(key,emp);
		
		return "Added Successfully";
	}
	public void deleteEmpDetails(int key) 
	{
		Employee e=empList.get(key);
	
		System.out.println("Deleted data of:"+e.getEmpName());
		empList.remove(key);
		
	}
	
	 public void printDetails()
	 {
		 System.out.println(empList.toString());
	 }
	private String applyInsuranceScheme(double salary) {
		 
		String ans="";
		 if(salary>5000 && salary<20000)
		 {
			 ans="Scheme C";
		 }
		 else if(salary>=20000 && salary<=40000)
		 {
			 ans="Scheme B";
		 }
		 else if(salary>=40000)
		 {
			 ans="Scheme A";
		 }
		 else if(salary<5000)
		 {
			 ans="No Scheme";
		 }
		 else
		 {
			 ans="Not Found";
		 }
		 return ans;
	}
	private String designationCheck(double salary) 
	{
		 String ans="";
		 if(salary>5000 && salary<20000)
		 {
			 ans="System Associate";
		 }
		 else if(salary>=20000 && salary<=40000)
		 {
			 ans="Programmer";
		 }
		 else if(salary>=40000)
		 {
			 ans="Manager";
		 }
		 else if(salary<5000)
		 {
			 ans="Clerk";
		 }
		 else
		 {
			 ans="Not Found";
		 }
		 return ans;
	}
	}

	

	


	
	


	
