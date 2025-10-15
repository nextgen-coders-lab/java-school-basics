public class VariablesLesson {
    public static void main(String[] args) {
        // This is a lesson about variables in Java

        // Declare an integer variable (whole number)
        int age = 14;
        System.out.println("Age: " + age);

        // Declare a double variable (decimal number)
        double temperature = 36.6;
        System.out.println("Body temperature: " + temperature);

        // Declare a boolean variable (true or false)
        boolean isStudent = true;
        System.out.println("Is a student: " + isStudent);

        // Declare a char variable (a single character)
        char grade = 'A';
        System.out.println("Grade: " + grade);

        // Declare a String variable (text)
        String name = "Kate";
        System.out.println("Name: " + name);

        // Example of updating a variable
        age = age + 1; // Add 1 to the current value
        System.out.println("Next year age: " + age);

        // Combine text and numbers
        System.out.println(name + " is " + age + " years old and got grade " + grade + ".");
    }
}
