package ClassTask;

import java.util.Scanner;

public class PrimeNUmRange {
public static void main(String[] args) {
	int num1;
	int num2;
	int value;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number between 40 to 80:");
	num1 = sc.nextInt();
	num2 = sc.nextInt();
	
	
	for(; num1<=num2; num1++) {
		
		int flag = fun(num1);
		if(flag == 1) {
			System.out.println(num1 + "is prime no.");
		}
	}
	 sc.close();
	
			
}
 static int fun(int num) {
	 for(int i = 2; i<num; i++) {
		 if (num%i == 0) {
			 return 0;
		 }
	 }
	 return 1;
 }

}
