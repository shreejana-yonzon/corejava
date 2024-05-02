package assignment1;

import java.util.Scanner;

public class PeriOfTriangle {
public static void main(String[] args) {
	int a;
	int b;
	int c;
	
Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter the value of a:");
	a = sc.nextInt();
	
	System.out.println("Enter the value of b:");
	b = sc.nextInt();
	
	System.out.println("Enter the value of c:");
	c = sc.nextInt();
	
	int periOfTri = a + b + c;
	System.out.println("Perimeter of Triangle:" + periOfTri);
}
}
