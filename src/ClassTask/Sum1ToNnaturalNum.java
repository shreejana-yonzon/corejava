package ClassTask;

import java.util.Scanner;

public class Sum1ToNnaturalNum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();

        
        int sum = calSum(num);
        System.out.println("The sum of the first " + num + " natural numbers is: " + sum);
    }

    // Method to calculate the sum of the first n natural numbers
    public static int calSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i; 
        }
        return sum;
    }
}
