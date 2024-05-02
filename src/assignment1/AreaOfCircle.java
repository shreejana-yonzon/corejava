package assignment1;

import java.util.Scanner;

public class AreaOfCircle {
public static void main(String[] args) {
	int r;
	
	Scanner sc =  new Scanner(System.in);
	
	System.out.println("Enter the value of radius:");
	r = sc.nextInt();
	
	float Area = (22 * ( r * r))/7;
	System.out.println("Area of circle:" + Area);
	
}
}
