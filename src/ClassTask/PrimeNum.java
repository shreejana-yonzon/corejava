package ClassTask;

import java.util.Scanner;

public class PrimeNum {
public static void main(String[] args) {
	int num;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number:");
	num = sc.nextInt();
	
	for (int i=0;  i<=10; i++) {
		
		if(num%2 == 0) {
        System.out.println("This " + num + " is not prime number");
       break;
		}else {
			  System.out.println("This " + num + " is  prime number");
			 break;
		}
	}
}
}
