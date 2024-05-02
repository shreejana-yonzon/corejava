package datatype;

import java.util.Scanner;

public class variable {
/*
 * -------------------Variable---------
 * # use to store data/value
 * # data stored data processing
 * 
 * # syntax
 *   data_type var_name
 * */
	public static void main(String[] args) {
		int l ;
		int b;
		
		
		Scanner sc = new Scanner(System.in);
		

		System.out.println("Enter value of l");
		l = sc.nextInt();//here nextInt is an method for int.
		
		System.out.println("Enter value of b");
		b = sc.nextInt();
		
		int area = l * b;
		System.out.println("Area:"+area);
		
		}
}
