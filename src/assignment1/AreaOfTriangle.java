package assignment1;

import java.util.Scanner;

public class AreaOfTriangle {
public static void main(String[] args) {
	int b;
	int h;
	
Scanner sc = new Scanner (System.in);
	
	System.out.println("Enter the value of b:" );
	b = sc.nextInt();
	
	System.out.println("Enter the value of h:");
	h = sc.nextInt();
	
	int area =  (b * h)/2;
	System.out.println("Area of triangle:" + area);
}
}
