package oopAssignment;

import java.util.Scanner;

public class AverageTest {

	public static void main(String[] args) {
		
		//getting input from users
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the num1 : ");
		double num1 = sc.nextDouble();
		
		System.out.println("Enter the num2 : ");
		double num2 = sc.nextDouble();
		
		System.out.println("Enter the num3 : ");
		double num3 = sc.nextDouble();
		
		//create object 
		Average avg = new Average();
		avg.calAvg();
		
	}
}
