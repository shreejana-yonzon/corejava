package oopAssignment;

import java.util.Scanner;

public class TestArea {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of length: ");
		int length = sc.nextInt();
		
		System.out.println("Enter the value of breadth: ");
		int breadth = sc.nextInt();
		
		//making object for area class
		
		Area a = new Area();
		a.setDim(length, breadth);
		a.getArea();
		
		
	}

}
