
// Topic: Control Statements
// Definition: Demonstrates the use of if-else and switch-case statements in Java.
// Use: Helps in decision-making based on conditions.

public class ControlStatements {
    public static void main(String[] args) {
        int num = 10;

        // If-Else Statement
        if (num > 0) {
            System.out.println("Positive Number");
        } else {
            System.out.println("Negative Number");
        }

        // Switch-Case Statement
        int day = 3;
        switch (day) {
            case 1: System.out.println("Monday"); break;
            case 2: System.out.println("Tuesday"); break;
            default: System.out.println("Other Day");
        }
    }
}