public class VariablesFixTask {
    public static void main(String[] args) {

        // The program should print information about a student.
        // But now it has many mistakes. Find and fix them!

        String name = Kate;                 // ❌ missing quotes
        int Age = "15";                     // ❌ wrong type
        double height = 1,65;               // ❌ wrong decimal separator
        boolean isStudent = "true";         // ❌ wrong type
        char grade = "A";                   // ❌ wrong quotes
        String school = "NextGen Coders Lab;

        System.out.println("Student name: " + name);
        System.out.println("Age: " + age);  // ❌ variable name mismatch
        System.out.println("Height: " + height);
        System.out.println("Student status: " + isStudent);
        System.out.println("Grade: " + grade);
        System.out.println("School: " + school)
    }
}
