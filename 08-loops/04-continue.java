// Continue Statement

// Run: java 08-loops/04-continue.java

// This example demonstrates the continue statement to skip an iteration

public class Continue {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            if (i == 2) {
                continue;
            }
            System.out.println("Number: " + i);
        }
    }
}
