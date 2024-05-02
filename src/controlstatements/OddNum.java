package controlstatements;

import java.util.Scanner;

public class OddNum {
public static void main(String[] args) {
	int num;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	num = sc.nextInt();
	
	if(num%2==0) {
		System.out.println("This is an even number.");
	}else {
		System.out.println("This is an odd number");
	}
}
}
