package method;

public class ExampleMethod {
public static void main(String[] args) {
//	sum();
//	area();
//	printTable(13);
	
	int sum = getSumOf1To100();
	System.out.println("Sum of 100 nums: " + sum);
	
	int sv = findSmallest(455,766);
	System.out.println("Smallest Value:" + sv);
}
//static chahi call ko lagi matra
//1. no return types with no arguments
 static void sum() {
	int a = 40;
	int b = 30; 
	int c = a + b;
	System.out.println("Total: " + c);
}
 static void area() {
	 int l = 12;
	 int b =15;
	 int area = l * b;
	 System.out.println("Area: " +area);
	 
 }
 
 //2.no return types with args
 static void printTable(int n) {
	 
	 for(int i = 1; i <= 10; i++) {
		 System.out.println(n + " x " + i + " = " + (n *i));
	 }
 }
 
 //3.return type with no args
 static int getSumOf1To100() {
	 int s = 0;
	 for(int i = 1; i<=100; i++) {
		 s = s +i;
	 }
	 return s;
 }
 
 //4.return type with args
 static int findSmallest(int x, int y) {
	
	 if(x < y) {
		 
		 return x;
	 }
	 return y;
 }
}


