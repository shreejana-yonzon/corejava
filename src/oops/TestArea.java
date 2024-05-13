package oops;

import java.util.Scanner;

public class TestArea {

	public static void main(String[] args) {
		//For static
//		Rectangle r = new Rectangle();
//		
//		r.l =12;
//		r.b = 6;
//		r.printArea();
		
		 // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Ask the user to enter the length of the rectangle
        System.out.print("Enter the length of the rectangle: ");
        int l = scanner.nextInt();

        // Ask the user to enter the breadth of the rectangle
        System.out.print("Enter the breadth of the rectangle: ");
        int b = scanner.nextInt();

        // Create a Rectangle object with the provided length and breadth arguments 
        Rectangle r = new Rectangle(l,b);

        // Print the area of the rectangle
        r.printArea();

        // Close the Scanner object
        scanner.close();
	}
	
}
