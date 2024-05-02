package controlstatements;

import java.util.Scanner;

public class GreatestNum {
public static void main(String[] args) {
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first num");
	num1 = sc.nextInt();
	
	System.out.println("Enter the second num:");
	num2 = sc.nextInt();
	
	if(num1>num2) {
		System.out.println("Num1 is greatest number.");
	}else {
		System.out.println("Num2 is greatest number");
	}
}
}
