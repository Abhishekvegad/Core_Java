
// Topic: Static Keyword in Java
// Definition: Demonstrates static variables, methods, and blocks in Java.
// Use: Helps in memory management and shared values.

class StaticExample {
    static int count = 0;

    // Static block
    static {
        System.out.println("Static block executed");
    }

    // Constructor increments count
    StaticExample() {
        count++;
    }

    // Static method
    static void showCount() {
        System.out.println("Count: " + count);
    }

    public static void main(String[] args) {
        StaticExample obj1 = new StaticExample();
        StaticExample obj2 = new StaticExample();
        
        StaticExample.showCount();
    }
}