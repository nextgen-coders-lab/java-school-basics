public class VariablesErrors {
    public static void main(String[] args) {

        // ❌ 1. Wrong type assignment
        // int number = 3.5; // error: incompatible types
        // ✅ Correct:
        double number = 3.5;

        // ❌ 2. Using a variable before declaration
        // System.out.println(price); // error: cannot find symbol
        // ✅ Correct:
        double price = 10.99;
        System.out.println(price);

        // ❌ 3. Wrong variable name (Java is case-sensitive)
        int Age = 14;
        // System.out.println(age); // error: variable age not found
        // ✅ Correct:
        System.out.println(Age);

        // ❌ 4. Missing quotes for String
        // String name = Kate; // error: cannot find symbol
        // ✅ Correct:
        String name = "Kate";

        // ❌ 5. Using undefined variable in expression
        int a = 5;
        int b = 7;
        // int c = a + d; // error: variable d does not exist
        // ✅ Correct:
        int c = a + b;

        // ❌ 6. Concatenation mistake (math + text)
        // System.out.println("Sum: " + a + b); // prints "Sum: 57"
        // ✅ Correct:
        System.out.println("Sum: " + (a + b));

        // ❌ 7. Wrong type for boolean
        // boolean isOk = "true"; // error: incompatible types
        // ✅ Correct:
        boolean isOk = true;

        // ❌ 8. Char must use single quotes
        // char grade = "A"; // error
        // ✅ Correct:
        char grade = 'A';

        // ✅ Final check
        System.out.println("All variables declared correctly!");
    }
}
