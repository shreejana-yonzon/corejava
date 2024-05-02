package assignment1;

import java.util.Scanner;

public class PeriOfRect {
public static void main(String[] args) {
	int l;
	int b;
	
	Scanner sc  = new Scanner(System.in);
	
	System.out.println("Enter the value of l:");
	l = sc.nextInt();
	
	System.out.println("Enter the value of b:");
	b = sc.nextInt();
	
	int periOfRect = 2 *(l + b);
	System.out.println("Perimeter of Rectangle:" + periOfRect);
}
}
