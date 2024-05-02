package assignment1;

import java.util.Scanner;

public class Greetings {
public static void main(String[] args) {
	String Greet;
	 
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter Greeting:");
	Greet =  sc.next();
	
	int i = 0;
	for ( i = 0; i < 3; i++) {
		System.out.println(""+Greet);
	} 
}
}
