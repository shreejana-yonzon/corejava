package assignment1;

import java.util.Scanner;

public class AreaOfRect {
public static void main(String[] args) {
	
	int l;
	int b;
	
	Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the value of l:" );
	l = sc.nextInt();
	
	System.out.println("Enter the value of b:");
	b = sc.nextInt();
	
	int area = l * b;
	System.out.println("Area of rectangle:" + area);
	
}
}
