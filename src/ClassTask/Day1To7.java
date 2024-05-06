package ClassTask;

import java.util.Scanner;

public class Day1To7 {
  static	int num;
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number (1-7):");
	num = sc.nextInt();
	
	//call the method here
	numToDayOfWeek();
	
}
//making method/function here to translate number to day of week 
static void numToDayOfWeek() {
	
	switch (num) {
	
	case 1: 
		System.out.println("Sunday");
		break;
	case 2: 
		System.out.println("Monday");
		break;
	case 3: 
		System.out.println("Tuesday");
		break;
	case 4: 
		System.out.println("Wednesday");
		break;
	case 5: 
		System.out.println("Thursday");
		break;
	case 6: 
		System.out.println("Friday");
		break;
	case 7: 
		System.out.println("Saturday");
		break;
		
		default:
			System.out.println("Error: Invalid number");
	
	}
	
}
}
