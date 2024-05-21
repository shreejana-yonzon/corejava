package oopAssignment;

import java.util.Scanner;

public class EmployeesTestL2 {
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the salary of Employee:");
	int salary = sc.nextInt();
	
	System.out.println("Enter number of hours of work per day of employee:");
	int hourPerDay = sc.nextInt();
	
	Employees e1 = new Employees();
	e1.getInfo(salary,hourPerDay);
	e1.addSal(salary);
	e1.addWork(hourPerDay);
	
	
	
	
	
}
}
