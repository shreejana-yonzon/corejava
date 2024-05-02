package datatype;

import java.util.Scanner;

public class parameter {
public static void main(String[] args) {
	
	int p;
	int t;
	float r;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of principal");
	p = sc.nextInt();
	
	System.out.println("Enter the value of time:");
	t = sc.nextInt();
	
	System.out.println("Enter the value of rate");
	r = sc.nextFloat();
	
	float SI = p * t * r;
	System.out.println("Simple Interest:"+SI);
}
}
