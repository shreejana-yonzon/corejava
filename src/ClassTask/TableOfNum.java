package ClassTask;

import java.util.Scanner;

public class TableOfNum {
static int num;
public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the number: ");
	num = sc.nextInt();
	
	//call tableOfNum function
	tableOfNum();
	
}
static void tableOfNum() {

	for(int i = 1; i<=10; i++ ) {
		
		System.out.println(num +" x " + i + " = "+ (num*i));
	}
}
}
