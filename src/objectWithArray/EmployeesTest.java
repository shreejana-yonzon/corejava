package objectWithArray;

import java.util.Scanner;

public class EmployeesTest {

	public static void main(String[] args) {
		
		//create array
		Employees emps[] = new Employees[1];
		
//		write data in array
		
		Scanner sc = new Scanner(System.in);
		for(int i = 0; i<emps.length; i++) {
			
			Employees emp = new Employees();
			
			System.out.println("Enter the employee id.");
			emp.setId(sc.nextInt());
			
			System.out.println("Enter the employee name.");
			emp.setName(sc.next());
			
			System.out.println("Enter the company name.");
			emp.setCompany(sc.next());
			
			System.out.println("Enter the salary of employee.");
			emp.setSalary(sc.nextInt());
			
			System.out.println("Enter the employee department name.");
			emp.setDepartment(sc.next());
			
			System.out.println("Enter the employee post.");
			emp.setPost(sc.next());
			
			System.out.println("Enter the employee city.");
			emp.setCity(sc.next());
			
			emps[i] = emp;
			
		}
		
		//read the data from array
//		for (Employees e : emps) {
//			System.out.println(e);
//		}
		//a>To find total salary of employee.
          
		int totalSalary = 0;
		for (Employees e :emps) {
			totalSalary = totalSalary + e.getSalary();
		}
		System.out.println("Total salary of all employees :" + totalSalary);
		
//		b>To print employees of IT department
		for(Employees e : emps) {
			
			if(e.getDepartment().equals("IT")) {
				System.out.println(e);
			}
		}
		
		//c> To count employees of Admin Department
		int adminCount = 0;
		for(Employees e :emps) {
			if(e.getDepartment().equals("Admin")) {
				adminCount++;
			}
		}
		System.out.println("Total Admin department employees: " + adminCount);
		
//		d> To print and count the employees of particular city 
		
		int cityCount = 0;
		for(Employees e : emps) {
			
			if(e.getCity().equals("ktm")) {
				cityCount++;
				System.out.println(e);
			}
		}
		System.out.println("The employees of ktm city:" + cityCount);
		
//  e> To find total salary of particular department
		int totalSalaryDep = 0;
		for (Employees e :emps) {
			if(e.getDepartment().equals(e.getDepartment())) {
				totalSalaryDep = totalSalaryDep + e.getSalary();
			}
		}
		System.out.println("Total salary of specific department employees :" + totalSalaryDep);
		
		// f> To find highest and lowest salary of employees
		Employees highestSalary = emps[0];
		Employees lowestSalary = emps[0];
		for(Employees e : emps) {
			if(e.getSalary()>highestSalary.getSalary()) {
				highestSalary = e;
			}
			if(e.getSalary()<lowestSalary.getSalary()) {
				lowestSalary = e;
			}
		}
		System.out.println("Lowest Salary is " +lowestSalary.getSalary()+"(Employee " +lowestSalary.getName() + ")" );
		System.out.println("Highest Salary is " +highestSalary.getSalary()+"(Employee " +highestSalary.getName() + ")" );
		
	}
	
}
