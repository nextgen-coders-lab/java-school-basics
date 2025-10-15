public class VariablesLesson {
    public static void main(String[] args) {
        // This program demonstrates how to work with variables in Java

        // Declare variables of different types
        String name = "Kate";
        int age = 15;
        double height = 1.65;
        boolean isStudent = true;
        char grade = 'A';

        // Print them to the console
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Height: " + height);
        System.out.println("Is student: " + isStudent);
        System.out.println("Grade: " + grade);

        // Update and print again
        age = age + 1;
        System.out.println("Next year age: " + age);
    }
}