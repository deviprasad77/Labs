package com.cg.eis.pl;

import com.cg.eis.bean.Employee;
import com.cg.eis.service.EmployeeServiceImpl;

public class EmployeeController {

	public static void main(String[] args) {
		EmployeeServiceImpl empService = new EmployeeServiceImpl();

		Employee emp1 = new Employee(10, "Dev", 25000, null, null);
		Employee emp2 = new Employee(5, "Ravi", 30000, null, null);
		Employee emp3 = new Employee(15, "pradeep", 20000, null, null);
		Employee emp4 = new Employee(12, "sai", 42000, null, null);
		Employee emp5 = new Employee(1, "venu", 3000, null, null);
		empService.addDetails(1, emp1);
		empService.addDetails(2, emp2);
		empService.addDetails(3, emp3);
		empService.addDetails(4, emp4);
		empService.addDetails(5, emp5);
		empService.printDetails();

	}

}
