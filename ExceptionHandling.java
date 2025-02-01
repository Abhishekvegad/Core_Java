
// Topic: Exception Handling
// Definition: Demonstrates try-catch, finally, throw, and throws in Java.
// Use: Helps in handling runtime errors gracefully.

public class ExceptionHandling {
    public static void main(String[] args) {
        try {
            int divideByZero = 5 / 0; // This will throw an exception
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("This block always executes.");
        }
    }
}