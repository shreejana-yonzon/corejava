package assignment1;

import java.util.Scanner;

public class SumAvg {
public static void main(String[] args) {
	int num1;
	int num2;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the first num1:");
	num1 = sc.nextInt();
	
	System.out.println("Enter the first num2:");
	num2 = sc.nextInt();
	
	int sum = num1 + num2;
	System.out.println("Total:" + sum);
	
	int avg = sum / 2;
	System.out.println("Average:" + avg);
	
}
}
