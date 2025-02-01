
// Topic: Constructors in Java
// Definition: Demonstrates default, parameterized, and copy constructors in Java.
// Use: Helps in initializing objects when they are created.

class Person {
    String name;

    // Default Constructor
    Person() {
        this.name = "Unknown";
    }

    // Parameterized Constructor
    Person(String name) {
        this.name = name;
    }

    // Copy Constructor
    Person(Person p) {
        this.name = p.name;
    }

    void display() {
        System.out.println("Name: " + name);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person("John");
        Person p3 = new Person(p2);

        p1.display();
        p2.display();
        p3.display();
    }
}