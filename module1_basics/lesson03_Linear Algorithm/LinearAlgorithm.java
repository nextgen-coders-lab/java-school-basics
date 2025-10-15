// Example of a linear algorithm in Java
// Program: Calculate the total cost of apples

import java.util.Scanner;

public class LinearAlgorithm {
    public static void main(String[] args) {
        // Create a scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Step 1: Get input from user
        System.out.print("Enter the price of one apple: ");
        double price = scanner.nextDouble();

        System.out.print("Enter the number of apples: ");
        int quantity = scanner.nextInt();

        // Step 2: Process data
        double total = price * quantity;

        // Step 3: Display result
        System.out.println("Total cost: " + total + " USD");

        // Close the scanner
        scanner.close();
    }
}