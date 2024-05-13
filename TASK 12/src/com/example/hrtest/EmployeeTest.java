package com.example.hrtest;

	import com.example.hr.Employee;

	public class EmployeeTest {
	    public static void main(String[] args) {
	        // Create an instance of Employee
	        Employee employee = new Employee("Sundar Aakash ", 101, 75000.0);

	        // Call methods to print employee's name and salary
	        employee.printName();
	        employee.printSalary();
	    }
	}

