package com.paxovision.employee;

public class _EmployeeData {
	
	public static void main(String [] args){
		  Employee employeeOne = new Employee("James Smith");
	      Employee employeeTwo = new Employee("Mary Anne");

	      
	      employeeOne.empAge(26);
	      employeeOne.empDesignation("Senior Software Engineer");
	      employeeOne.empSalary(1000);
	      employeeOne.printEmployee();

	      employeeTwo.empAge(21);
	      employeeTwo.empDesignation("Software Engineer");
	      employeeTwo.empSalary(500);
	      employeeTwo.printEmployee();
	   }
	
	

}
