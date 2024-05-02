package assignment1;

import java.util.Scanner;

public class SimpleInt {
public static void main(String[] args) {
	int p;
	int t;
	float r;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the principal:");
	p = sc.nextInt();
	
	System.out.println("Enter the time:");
	t = sc.nextInt();
	
	System.out.println("Enter the rate:");
	r = sc.nextFloat();
	
	float SI = (p * t * r) / 100;
	System.out.println("Total SI "+ SI);
	
	
}
}
