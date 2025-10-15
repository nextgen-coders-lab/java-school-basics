// Lesson 3: Linear Algorithm
// Task: fix the program so it compiles and correctly calculates total cost

import java.util.Scanner

public class LinearAlgorithmFixTask {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in)

        System.out.println("Welcome! Let's calculate total cost of apples")

        System.out.print("Enter price for one apple (use dot, e.g. 1.5): ")
        double price = scanner.nextDouble()

        System.out.print("Enter number of apples: ")
        int quantity = scanner.nextInt()

        // TODO: calculate total correctly
        double total = price * quantity

        System.out.println("Total cost is " + total + " GEL")

        scanner.close()
    }
}

