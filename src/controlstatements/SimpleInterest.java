package controlstatements;

import java.util.Scanner;

public class SimpleInterest {
public static void main(String[] args) {
	int p;
	int t;
	float r;
	
	Scanner sc = new Scanner(System.in);
   
	System.out.println("Enter the value of principal:");
	p = sc.nextInt();
	
	System.out.println("Enter the value of time:");
	t = sc.nextInt();
	
	System.out.println("Enter the value of rate:");
	r = sc.nextFloat();
	float SI = p * t * r;
	if(p !=0 && t !=0 && r != 0) {
		System.out.println("Simple Interest is:" +SI);
	}
	System.out.println("SI must not input the zero value");
}
}
