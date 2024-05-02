package assignment1;

import java.util.Scanner;

public class PeriOfCircle {
	public static void main(String[] args) {
		int r;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the value of r:");
		r = sc.nextInt();
		
		float peri =(2*22*r)/7;
		System.out.println("Perimeter of Circle:" + peri);
	}
}
