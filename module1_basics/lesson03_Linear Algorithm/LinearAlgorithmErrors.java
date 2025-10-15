// Linear algorithm with common mistakes
// Try to find and fix them!

import java.util.Scanner;

public class LinearAlgorithmErrors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculate total cost of apples");

        // Mistake 1: integer used for price (no decimals)
        int price = 2;

        // Mistake 2: user value not used
        System.out.print("Enter number of apples: ");
        int quantity = scanner.nextInt();

        // Mistake 3: wrong formula — adds instead of multiplies
        int total = price + quantity;

        // Mistake 4: no currency, unclear output
        System.out.println("Total = " + total);

        // Mistake 5: scanner not closed
        // scanner.close(); // intentionally missing
    }
}
