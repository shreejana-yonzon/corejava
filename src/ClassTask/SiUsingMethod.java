package ClassTask;

import java.util.Scanner;

public class SiUsingMethod {
public static void main(String[] args) {
	int p;
	int t;
	float r;
	
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter the value of principal:");
	 p = sc.nextInt();
	 
	 System.out.println("Enter the value of time: ");
	 t = sc.nextInt();
	 
	 System.out.println("Enter the value of rate :");
	 r = sc.nextFloat();
	 
	float in =  inputFun(p,t,r);
	float result = processFun(in);
	outputFun(result);
	
	System.out.println("The result is :" + result);
}
public static float inputFun(int x, int y, float z) {

	int p = x;
	int t = y;
	float r = z;
	return (p * t * r);
}
static float processFun(float si) {
	return si/100;
	
}
static void outputFun(float si) {
	
	System.out.println("Simple Interest is: " + si);
}
}
