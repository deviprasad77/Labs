package Lab7;

import java.util.Scanner;

class EmployeeException extends Exception{

}

 
 
 class Employee{
	 static void Salary(double salary) throws EmployeeException {
		 if(salary<3000) {
			 throw new EmployeeException();
		 }else
		 {
			 System.out.println("Employee salary is more than 3000");		 }
	 }
	 
	 public static void main(String[] args) {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("enter salary");
		 double salary=sc.nextDouble();
		 
		 try {
			Salary(salary);
		} catch (EmployeeException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println("Salary is less than 3000");
		}
		 
	 }
 }