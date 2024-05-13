package array;

import java.util.Scanner;

public class TotalAndPercentage {
    public static void main(String[] args) {
        // Create arrays to store subjects and marks
        String[] subjects = new String[5];
        int[] marks = new int[5];
        int total = 0; // Initialize total marks

        Scanner sc = new Scanner(System.in);

        // Input marks for each subject
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter the name of subject " + (i+1) + ":");
            subjects[i] = sc.next(); // Input subject name

            System.out.println("Enter the marks for subject " + (i+1) + ":");
            marks[i] = sc.nextInt(); // Input marks for the subject

            total += marks[i]; // Add marks to the total
        }

        // Output total marks
        System.out.println("Total Marks: " + total);

        // Output marks for each subject
        for (int i = 0; i < 5; i++) {
            System.out.println("Subject: " + subjects[i] + ", Marks: " + marks[i]);
        }
    }
}
