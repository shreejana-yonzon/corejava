package oopAssignment;

import java.util.Scanner;

public class EmployeeTest {
public static void main(String[] args) {
	
	//creating object
	Employee emp1 = new Employee("Robert", 1994, "64C-WallsStreat");
	Employee emp2 = new Employee("Sam", 2000, "68D-WallsStreat");
	Employee emp3 = new Employee("John", 1999, "26B-WallsStreat");
	
	//printing Employees data
	System.out.println("Name\t\tYear of joining\t\tAddress");
	emp1.employeeInfo();
	emp2.employeeInfo();
	emp3.employeeInfo();
}
}
