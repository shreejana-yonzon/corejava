package ClassTask;

import java.util.Scanner;

public class FourFunCalculator {

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        // operation based on the operator 
        if (operator == '+') {
            addOpr(num1, num2);
        } else if (operator == '-') {
            subOpr(num1, num2);
        } else if (operator == '*') {
            multOpr(num1, num2);
        } else if (operator == '/') {
            divOpr(num1, num2);
        } else {
            System.out.println("Error: Invalid operator");
        }
    }
    
    public static void addOpr(int num1, int num2) {
        System.out.println("Result: " + (num1 + num2));
    }

    public static void subOpr(int num1, int num2) {
        System.out.println("Result: " + (num1 - num2));
    }

    public static void multOpr(int num1, int num2) {
        System.out.println("Result: " + (num1 * num2));
    }

    public static void divOpr(int num1, int num2) {
        if (num2 != 0) {
            System.out.println("Result: " + ((double) num1 / num2));
        } else {
            System.out.println("Error: Division by zero");
        }
    }
}
