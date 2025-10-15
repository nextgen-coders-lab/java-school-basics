import java.time.LocalDateTime;

public class HiJava02 {
    public static void main(String[] args) {
        // It's comment. It doesn't compile.
        // Date and Time
        System.out.println(LocalDateTime.now());

                // println prints text and MOVES the cursor to a new line
        System.out.println("Hello");
        System.out.println("World");

        // print prints text but DOES NOT move to a new line
        System.out.print("Hello ");
        System.out.print("World");

        // Print an empty line to separate the output
        System.out.println();

        // The \n symbol means "new line" (Line Feed)
        // Here we use print, but it still moves to the next line because of \n
        System.out.print("Java\nProgramming");
    }
}
