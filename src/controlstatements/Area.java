package controlstatements;

import java.util.Scanner;

public class Area {
public static void main(String[] args) {
	
	int l;
	int b;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of l");
	l = sc.nextInt();
	
	System.out.println("Enter the value of b");
	b = sc.nextInt();
	
	int Area = l * b;
	if(l != 0  && b !=0) {
		System.out.println("Area:" +Area);
	}
	System.out.println("length and breadth must be non zero");
}
}
