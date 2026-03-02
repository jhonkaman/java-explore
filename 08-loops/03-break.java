// Break Statement

// Run: java 08-loops/03-break.java

// This example demonstrates the break statement to exit a loop early

public class Break {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println("Number: " + i);
        }
        System.out.println("Loop ended");
    }
}
