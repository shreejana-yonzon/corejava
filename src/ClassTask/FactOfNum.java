package ClassTask;

import java.util.Scanner;

public class FactOfNum {
	
static int num;

public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of num:");
	num = sc.nextInt();
	
	int factorial = factNum();//factNum call
	
	//when num = 0 and above the display this message. 
	if(num >= 0) {
	System.out.println("The factorial of "+ num +" is :" +factorial);
	}
	
}
public static int factNum() {
	
	//testing for negative input number
	if (num < 0) {
		System.out.println("Factorial is not define for negative number.");	
	}
	//checking for 0 and 1 input number
	else if(num == 0 || num ==1) {
		return 1; // factorial of 0 and 1 is always 1
	}else {
		int fact = 1;
		for (int i = 2; i <= num; i++) {
			fact =fact*i;//to calculate factorial 
		}
		return fact;
		
	}
	return 1;
}
}
