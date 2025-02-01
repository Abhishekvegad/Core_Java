
// Topic: Loops in Java
// Definition: Demonstrates for, while, and do-while loops in Java.
// Use: Helps in executing a block of code multiple times.

public class Loops {
    public static void main(String[] args) {
        // For loop
        for (int i = 1; i <= 5; i++) {
            System.out.println("For Loop Iteration: " + i);
        }

        // While loop
        int j = 1;
        while (j <= 5) {
            System.out.println("While Loop Iteration: " + j);
            j++;
        }

        // Do-While loop
        int k = 1;
        do {
            System.out.println("Do-While Loop Iteration: " + k);
            k++;
        } while (k <= 5);
    }
}