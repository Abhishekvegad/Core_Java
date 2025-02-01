
// Topic: String Handling in Java
// Definition: Demonstrates String methods, StringBuilder, and StringBuffer.
// Use: Helps in manipulating textual data efficiently.

public class StringHandling {
    public static void main(String[] args) {
        String str = "Hello";
        System.out.println("UpperCase: " + str.toUpperCase());

        // StringBuilder (Mutable)
        StringBuilder sb = new StringBuilder("Java");
        sb.append(" Programming");
        System.out.println("StringBuilder: " + sb);

        // StringBuffer (Thread-safe Mutable)
        StringBuffer sbf = new StringBuffer("Hello");
        sbf.reverse();
        System.out.println("Reversed StringBuffer: " + sbf);
    }
}