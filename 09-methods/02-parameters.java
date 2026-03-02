// Method Parameters

// Run: java 09-methods/02-parameters.java

// This example demonstrates methods that accept parameters

public class Parameters {
    public static void greetPerson(String name) {
        System.out.println("Hello, " + name);
    }

    public static void main(String[] args) {
        greetPerson("Alice");
        greetPerson("Bob");
    }
}
