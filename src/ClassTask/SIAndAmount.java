package ClassTask;

import java.util.Scanner;

public class SIAndAmount {
    static int p;
    static int t;
    static float r;

    public static void main(String[] args) {
        outputFun();
    }

    static void inputFun() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of principal:");
        p = sc.nextInt();
        System.out.println("Enter the value of time:");
        t = sc.nextInt();
        System.out.println("Enter the value of rate:");
        r = sc.nextFloat();
    }

    static void processFun() {
        inputFun(); // Call inputFun to get input values
        float amount = p * t * r;
        float si = amount / 100;
        System.out.println("Amount is: " + amount); // Print the amount
        System.out.println("Simple Interest is: " + si); // Print the simple interest
    }

    static void outputFun() {
        processFun(); // Call processFun to calculate and print the simple interest
    }
}
