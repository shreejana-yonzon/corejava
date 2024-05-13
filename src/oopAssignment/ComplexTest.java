package oopAssignment;

import java.util.Scanner;

public class ComplexTest {

	public static void main(String[] args) {
		
		//taking input from users
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1:");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the num2: ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the imaginary num: ");
		double i = sc.nextDouble();
		
		
		//creating object for Complex class
		
		Complex  c =  new Complex();
		c.getSum();
		c.getDiff();
		c.getMul();
	}
}
