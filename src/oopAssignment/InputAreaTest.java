package oopAssignment;

import java.util.Scanner;

public class InputAreaTest {
	public static void main(String[] args) {
		
		//Taking input from keyboard or user
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of length:");
		int length = sc.nextInt();
		
		System.out.println("Enter the value of breadth: ");
		int breadth = sc.nextInt();
		
		
		//create object 
		InputArea rect = new InputArea(length, breadth);
		
		 // Call method to calculate and return the area
         rect.returnArea();
	}

}
